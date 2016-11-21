(ns keboola.facebook.api.request
  (:require [keboola.http.client :as client])
  )

(def graph-api-url "https://graph.facebook.com/")
(def default-version "v2.8")


(defn make-url
  "return absolute url to fb api given relative @path and @version"
  [path & {:keys [version]}]
  (str graph-api-url (or version default-version) "/" path))

(defn nested-object?
  "Returns true if objet is map and contains :data keyword"
  [object]
  (and (map? object) (contains? object :data)))

(defn get-nested-objects
  "Traverse body-data array and take out nested-object like structures.
  Return array of objects with keys :name :data :parent-id :parent-type "
  [body-data params]
  (reduce
   (fn [memo, row]
     (if-let [
              objects (reduce-kv (fn [m k v]
                                   (if (nested-object? v)
                                     (conj m
                                           {:name (name k)
                                            :data v
                                            :parent-id (:id row)
                                            :parent-type (str (:parent-type params) "_" (name k))
                                            }) m))
                                 [] row)
              ]
       (concat memo objects)
       memo))
   [] body-data))

(defn flatten-object
  "take all key-value pairs of object and flatten it to :@object-name_key value sequences.
  Return list of flattened key values
  "
  [object-name object]
  (reduce-kv (fn [memo key value]
               (conj memo value (keyword (str object-name "_" (name key)))))
             '() object))

(defn flatten-array [array-name array]
  (loop [memo '()
         cnt 0
         object (first array)
         other (rest array)
         ]
    (if (empty? object)
      memo
      (recur
       (apply conj memo (mapcat (fn [[k v]] [v (str array-name "_" (name k) cnt) ]) object))
       (inc cnt)
       (first other)
       (rest other)))))

(defn filter-values
  "traverse object(@row) values and take only scalar values or flatten simple objects(key->value)
  return object with enhanced info(:keboola keyword) and all scalar values"
  [row params]
  (reduce-kv
   (fn [memo k v]
     (cond
       (vector? v) (apply assoc memo (flatten-array (name k) v))
       (-> v map? not) (assoc memo k v )
       (and (map? v) (not (nested-object? v))) (apply assoc memo (flatten-object (name k) v))
       :else memo))
   {:keboola params}
   row))

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
  [{:keys [parent-id parent-type table-name body-data api-fn response] :as init-params} ]
  ((fn step [params this-object-data rest-objects]
            (if (and (empty? rest-objects) (empty? this-object-data))
              nil
              (let [
                    new-values (map #(filter-values % (dissoc params :body-data :response :api-fn)) this-object-data)
                    next-page-data (get-next-page-data (:response params) params)
                    nested-objects (concat (get-nested-objects this-object-data params) next-page-data)
                    all-objects (concat nested-objects rest-objects)
                    next-object (first all-objects)
                    new-params (assoc params
                                      :parent-id (:parent-id next-object)
                                      :parent-type (:parent-type next-object)
                                      :table-name (:name next-object)
                                      :response (:data next-object)
                                      :body-data (:data (:data next-object))
                                      )
                    ]
                (lazy-seq (cons new-values (step new-params (:body-data new-params) (rest all-objects) )))))) init-params body-data [] ))

(defn make-paging-fn [access-token]
  (fn [url] (client/GET url :query-params {:access_token access-token} :as :json))
  )

(defn nested-request
  "Make a initial request to fb api given query and collect its result data.
  Returns collection of maps of key-value pairs page-id -> result_data "
  [access-token {:keys [fields ids ids-title path]} & {:keys [ version]}]
  (let [form-params {:access_token access-token :method "GET" :fields fields :ids ids}
        full-url (make-url path :version version)
        request-fn (fn [url] (client/POST url :form-params form-params :as :json))
        response (request-fn full-url)
        next-page-api-fn (make-paging-fn access-token)
        ]
    (map
     #(hash-map
       :account-id (first %)
       :data (page-and-collect {:parent-id (first %)
                                :parent-type ids-title
                                :table-name ids-title
                                :body-data [(second %)]
                                :response (:body response)
                                :api-fn next-page-api-fn}))
     (:body response))
    ))

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
