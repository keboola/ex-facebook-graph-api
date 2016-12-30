(ns keboola.facebook.api.request
  (:require   [clojure.spec :as s]
              [keboola.facebook.api.specs :as ds]
              [keboola.docker.runtime :refer [log-strings]]
              [keboola.http.client :as client]
              [clojure.string :as string]
              [clj-time.core :as t]
              [clj-time.format :refer [formatter unparse]]
              ))

(def graph-api-url "https://graph.facebook.com/")
(s/def ::version string?)
(def default-version "v2.8")

(defn relative-days-timestamp [days]
  (unparse (formatter "YYYY-MM-dd") (t/plus (t/now) (t/days (Integer/parseInt days)))))

(defn preparse-fields [fields-str]
  (string/replace fields-str #"%%days:-?\d+%%"
                  #(relative-days-timestamp (re-find #"-?\d+" %))))

(s/fdef make-url
        :args (s/or :path-only (s/cat :path string? )
                    :path-and-version (s/cat :path string? :version string?))
        :fn #(-> % :ret (clojure.string/starts-with? graph-api-url))
        :ret string?)

(defn make-url
  "return absolute url to fb api given relative @path and @version"
  ([path] (make-url path default-version))
  ([path version]
   (str graph-api-url version "/" path)))

(s/fdef nested-object?
        :args (s/cat :object (s/or :nested (s/keys :req-un [::ds/data])
                                   :simple ::ds/fb-object))
        :ret boolean?
        :fn (fn [val]
              (if (= :simple (-> val :args :object first))
                (= false (-> val :ret))
                (= true (-> val :ret) ))))
(defn nested-object?
  "Returns true if objet is map and contains :data keyword"
  [object]
  (and (map? object) (contains? object :data)))

(s/fdef get-nested-objects
        :args (s/cat :body-data ::ds/data
                     :params ::ds/keboola)
        :ret (s/coll-of map? :into []))
(defn get-nested-objects
  "Traverse body-data array and take out nested-object like structures.
  Return array of objects with keys :name :data :parent-id :parent-type "
  [body-data params]
  (reduce
   (fn [memo, row]
     (if-let [objects (reduce-kv (fn [m k v]
                                   (if (nested-object? v)
                                     (conj m
                                           {:name (name k)
                                            :data v
                                            :parent-id (:id row)
                                            :parent-type (str (:parent-type params) "_" (name k))
                                            }) m))
                                 [] row)]
       (concat memo objects)
       memo))
   [] body-data))

(s/fdef flatten-value-object
        :args (s/cat :key1 string?
                     :object-value (s/or :scalar ::ds/table-value :object ::ds/simple-object))
        :ret (s/* ::ds/key1-key2-value))

(defn flatten-value-object
  "flattens object values and prepends and prepend key1"
  [key1 object-value]
  (cond
    (map? object-value) (map (fn [[key2 val]] {:key1 key1 :key2 (name key2) :value val})
                             object-value)
    :else (list {:key1 key1 :key2 "" :value object-value})))

(s/fdef flatten-array-value
        :args (s/cat :item (s/or :scalar ::ds/table-value :object ::ds/complex-object)
                     :end_time ::ds/end_time)
        :ret (s/* (s/merge (s/keys :req-un [::ds/end_time]) ::ds/key1-key2-value)))

(defn flatten-array-value [item end_time]
  (map
   #(assoc % :end_time end_time)
   (cond
     (map? item) (mapcat (fn [[key1 val]] (flatten-value-object (name key1) val)) item)
     :else (list {:key1 "" :key2 "" :value item}))))

(s/fdef flatten-array
        :args (s/cat :array (s/coll-of ::ds/insights))
        :ret (s/* (s/map-of keyword? ::ds/table-value)))
(defn flatten-array
  "flattens array of object with same structure prefixing its keys with array-name
  returns list of key-value pairs"
  [array]
  (mapcat #(flatten-array-value (:value %) (:end_time %)) array))


(s/fdef filter-scalars
        :args (s/cat :row (s/map-of keyword? (s/or :scalar ::ds/table-value
                                                   :object map?
                                                   :seq sequential?)))
        :ret (s/map-of keyword? ::ds/table-value))
(defn filter-scalars [row]
  (into {} (filter (fn [[k v]]
                     (and (-> v map? not) (-> v sequential? not))
                     ) row)))

(s/fdef filter-flatten-objects
        :args (s/cat :row ::ds/complex-object)
        :ret (s/map-of keyword? ::ds/table-value))
(defn filter-flatten-objects
  [row]
  (let [simple-objects (filter (fn [[k v]] (and (-> v map?) (-> v nested-object? not))) row)]
    (apply hash-map
           (mapcat (fn [[object-name object]]
                     (mapcat (fn [[k v]]
                               (list (keyword (str (name object-name) "_" (name k))) v))
                             object))
                   simple-objects))))

#_(s/fdef filter-values
        :args (s/cat :row ::ds/fb-object
                     :params ::ds/keboola
                     :account-id string?)
        :fn #(-> % :ret (contains? :keboola))
        :ret (s/map-of keyword? (s/or :value ::ds/table-value :object map?)))
(defn extract-values
  "traverse object(@row) values and take only scalar values or flatten simple objects(key->value) or explodes arrays(insights metrics)
  return list of objects with enhanced info(:keboola keyword) and all scalar values"
  [row params account-id]
  (let [scalars (filter-scalars row)
        objects-flatten (filter-flatten-objects row )
        all-simple-scalars (merge {:account-id account-id :keboola params} scalars objects-flatten)
        arrays (filter (fn [[k v]] (vector? v)) row)
        merged-arrays (map
                       #(merge all-simple-scalars %) (mapcat (fn [[_ array]]
                                                               (flatten-array array)) arrays))]
    (if (empty? merged-arrays)
      (list all-simple-scalars)
      merged-arrays)))

(defn get-next-page-url
  "return url to the next page from @response param"
  [response]
  (get-in response [:paging :next]))

(defn get-next-page-data
  "if response contains next page url then call it and wait for new repsonse
  result: vector with new nested-object like structure
  "
  [response params]
  ;(println "next url" (get-next-page-url response) (:paging response))
  (if-let [next-page-url (get-next-page-url response )] ; process next api page if exists
    (let [new-response (:body ((:api-fn params) next-page-url))]
      [{
        :parent-id (:parent-id params)
        :parent-type (:parent-type params)
        :name (:table-name params)
        :data new-response
        }])))

(defn page-and-collect
  "collect data from response and make another paging requests if needed.
  Returns lazy sequence of flattened data resulting from processing the whole query"
  [{:keys [account-id parent-id parent-type table-name body-data api-fn response] :as init-params} ]
  ((fn step [params this-object-data rest-objects]
            (if (and (empty? rest-objects) (empty? this-object-data))
              nil
              (let [
                    new-rows (mapcat #(extract-values % (dissoc params :body-data :response :api-fn) account-id) this-object-data)

                    next-page-data (get-next-page-data (:response params) params)
                    nested-objects (concat (get-nested-objects this-object-data params) next-page-data)
                    all-objects (concat nested-objects rest-objects)
                    next-object (first all-objects)
                    new-params (assoc params
                                      :parent-id (:parent-id next-object)
                                      :parent-type (:parent-type next-object)
                                      :table-name (:name next-object)
                                      :response (:data next-object)
                                      :body-data (:data (:data next-object)))]
                (lazy-seq (cons new-rows (step new-params (:body-data new-params) (rest all-objects) )))))) init-params body-data [] ))

(defn make-paging-fn [access-token]
  (fn [url] (client/GET url :query-params {:access_token access-token} :as :json))
  )

(defn nested-request
  "Make a initial request to fb api given query and collect its result data.
  Returns collection of maps of key-value pairs page-id -> result_data "
  [access-token {:keys [fields ids path]} & {:keys [ version]}]
  (let [preparsed-fields (preparse-fields fields)
        query-params {:access_token access-token :fields preparsed-fields :ids ids}
        full-url (make-url path version)
        request-fn (fn [url] (client/GET url :query-params query-params :as :json))
        response (request-fn full-url)
        next-page-api-fn (make-paging-fn access-token)
        ]
    (log-strings "calling" full-url "with" preparsed-fields ids)
    (map
     #(hash-map
       :account-id (first %)
       :data (page-and-collect {
                                :account-id (name (first %))
                                :parent-id (first %)
                                :parent-type "page"
                                :table-name "page"
                                :body-data [(second %)]
                                :response (:body response)
                                :api-fn next-page-api-fn}))
     (:body response))))

(defn get-accounts [access-token & {:keys [version]}]
  (get-in (client/GET (make-url "me/accounts" version)
                      :query-params {:access_token access-token} :as :json)
          [:body :data]))

;;;; DEPRECATED
(defn get-response-data [response]
  (get-in response [:data])
  )

(defn- collect-result [response api-fn]
  (lazy-seq
   (if (get-next-page-url response)
     (concat (get-response-data response)
             (collect-result
              (:body (api-fn (get-next-page-url response)))
              api-fn
              )))))


(defn- get-request [access-token path & {:keys [query version]}]
  (let [query-params (assoc query :access_token access-token)
        request-fn (fn [url] (client/GET url :query-params query-params :as :json))]
    (collect-result
     (request-fn (make-url path :version version))
     request-fn
     )))
