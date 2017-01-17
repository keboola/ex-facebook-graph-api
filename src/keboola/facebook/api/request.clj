(ns keboola.facebook.api.request
  (:require   [clojure.spec :as s]
              [keboola.facebook.api.parser :as parser]
              [keboola.docker.runtime :refer [log-strings app-error]]
              [keboola.http.client :as client]
              [clojure.string :as string]))

(def graph-api-url "https://graph.facebook.com/")
(def default-version "v2.8")

(s/fdef make-url
        :args (s/or :path-only (s/cat :path string? )
                    :path-and-version (s/cat :path string? :version string?))
        :fn #(-> % :ret (clojure.string/starts-with? graph-api-url))
        :ret string?)

(defn make-url
  "return absolute url to fb api given relative @path and @version"
  ([path] (make-url path default-version))
  ([path version]
   (str graph-api-url (or version default-version) "/" path)))

(defn extract-values
  "traverse object(@row) values and take only scalar values or flatten simple objects(key->value) or explodes arrays(insights metrics)
  return list of objects with enhanced info(:keboola keyword) and all scalar values"
  [row params ex-account-id]
  (let [scalars (parser/filter-scalars row)
        objects-flatten (parser/filter-flatten-objects row )
        all-simple-scalars (merge {:ex-account-id ex-account-id :keboola params} scalars objects-flatten)
        arrays (filter (fn [[k v]] (vector? v)) row)
        merged-arrays (map
                       #(merge all-simple-scalars %) (mapcat (fn [[array-name array]]
                                                               (parser/flatten-array array array-name)) arrays))]
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
  [response params ex-account-id top-node]
  ;(println "next url" (get-next-page-url response) (:paging response))
  (if-let [next-page-url (get-next-page-url response )] ; process next api page if exists
    (let [new-response (:body ((:api-fn params) next-page-url))]
      (cond (contains? new-response :data)
            [{
              :parent-id (:parent-id params)
              :fb-graph-node (:fb-graph-node params)
              :name (:table-name params)
              :data new-response
              }]
            (contains? new-response (keyword ex-account-id))
            [{
              :parent-id ex-account-id
              :fb-graph-node top-node
              :name top-node
              :data new-response
              }]
            :else
            (app-error (str "Unknown page structure:" (keys new-response) "next-page" next-page-url (dissoc params :body-data :response :api-fn)))))))

(defn page-and-collect
  "collect data from response and make another paging requests if needed.
  Returns lazy sequence of flattened data resulting from processing the whole query"
  [{:keys [ex-account-id parent-id fb-graph-node table-name body-data api-fn response] :as init-params} ]
  ((fn step [params this-object-data rest-objects top-node]
            (if (and (empty? rest-objects) (empty? this-object-data))
              nil
              (let [
                    new-rows (mapcat #(extract-values % (dissoc params :body-data :response :api-fn) ex-account-id) this-object-data)

                    next-page-data (get-next-page-data (:response params) params ex-account-id top-node)
                    nested-objects (concat (parser/get-nested-objects this-object-data params) next-page-data)
                    all-objects (concat nested-objects rest-objects)
                    next-object (first all-objects)
                    new-params (assoc params
                                      :parent-id (:parent-id next-object)
                                      :fb-graph-node (:fb-graph-node next-object)
                                      :table-name (:name next-object)
                                      :response (:data next-object)
                                      :body-data (:data (:data next-object)))]
                (lazy-seq (cons new-rows (step new-params (:body-data new-params) (rest all-objects) top-node)))))) init-params body-data [] fb-graph-node))

(defn make-paging-fn [access-token]
  (fn [url] (client/GET url :query-params {:access_token access-token} :as :json)))

(defn nested-request
  "Make a initial request to fb api given query and collect its result data.
  Returns collection of maps of key-value pairs page-id -> result_data "
  [access-token {:keys [fields ids path limit since until] :as whole-query} & {:keys [ version]}]
  (let [preparsed-fields (parser/preparse-fields fields)
        preparsed-since (parser/preparse-fields (or since ""))
        preparsed-until (parser/preparse-fields (or until ""))
        query-params (assoc whole-query :access_token access-token :fields preparsed-fields :since preparsed-since :until preparsed-until)
        full-url (make-url path version)
        request-fn (fn [url] (client/GET url :query-params query-params :as :json))
        response (request-fn full-url)
        next-page-api-fn (make-paging-fn access-token)
        ]
    (log-strings "calling" full-url "with" preparsed-fields ids preparsed-since preparsed-until)
    (mapcat
     #(page-and-collect
       {
        :ex-account-id (name (first %))
        :parent-id (name (first %))
        :fb-graph-node "page"
        :table-name "page"
        :body-data [(if (not-empty path) {(keyword (string/replace path #"/" "_")) (second %)} (second %))]
        :response (:body response)
        :api-fn next-page-api-fn})
     (:body response))))



(defn- collect-result [response api-fn]
  (lazy-seq
   (if (not-empty (:data response))
     (cons (:data response)
           (if (some? (-> response :paging :next))
             (collect-result (:body (api-fn (-> response :paging :next))) api-fn)) ))))


(defn- get-request [access-token path & {:keys [query version]}]
  (let [query-params (assoc query :access_token access-token)
        request-fn (fn [url] (client/GET url :query-params query-params :as :json))
        full-url (make-url path version)]
    ;(println full-url)
    (collect-result
     (:body (request-fn full-url))
     request-fn
     )))

(defn get-accounts [access-token & {:keys [version]}]
  (apply concat (get-request access-token "me/accounts" :version version)))

(defn get-adaccounts [access-token & {:keys [version]}]
  (apply concat (get-request access-token "me/adaccounts"
                             :query {:fields "account_id,id,business_name,name"}
                             :version version)))
