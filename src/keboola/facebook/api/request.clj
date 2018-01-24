(ns keboola.facebook.api.request
  (:require   [clojure.spec.alpha :as s]
              [keboola.facebook.api.parser :as parser]
              [keboola.docker.runtime :refer [log-strings app-error log-error]]
              [slingshot.slingshot :refer [try+ throw+]]
              [keboola.http.client :as client]
              [clojure.string :as string]))

(def graph-api-url "https://graph.facebook.com/")
(def default-version "v2.8")

(s/fdef make-url
        :args (s/or :path-only (s/cat :path string?)
                    :path-and-version (s/cat :path string? :version string?))
        :fn #(-> % :ret (clojure.string/starts-with? graph-api-url))
        :ret string?)

(defn make-url
  "return absolute url to fb api given relative @path and @version"
  ([path] (make-url path default-version))
  ([path version]
   (str graph-api-url (or version default-version) "/" path)))

(defn get-next-limit [current-limit]
  (let [limit (if (int? current-limit) current-limit (Integer/parseInt current-limit))]
    (if (< limit 1)
      0
      (int (Math/ceil (/ limit 2))))))

(def DEFAULT_LIMIT "25")
(defn parse-limit-from-url [url]
  (re-find #"\d+" (or  (last (re-seq #"limit=\d+" url)) "")))

(defn update-url-with-limit [url new-limit]
  (let [has-query-params (clojure.string/includes? url "?")
        parts (clojure.string/split url #"limit=")
        first-part (apply str (clojure.string/join "limit=" (drop-last parts)))
        last-part (last parts)]
    (if (empty? first-part)
      (if has-query-params
        (str url "&limit=" new-limit)
        (str url "?limit=" new-limit))
      (str first-part
           "limit="
           (clojure.string/replace-first last-part #"\d+" (str new-limit))))))

(defn skip-error-exception? [e]
  (if-let [status (:status e)]
      (and
       (<= 400 status 500)
       (or
        (re-find #"Media Posted Before Business Account Conversion" (:body e))))))

(defn retry-exception? [e]
  (if-let [status (:status e)]
      (and
       (<= 500 status 600)
       (or
        (re-find #"An unknown error occurred" (:body e))
        (re-find #"An unexpected error has occurred. Please retry" (:body e))
        (re-find #"Please reduce the amount of data" (:body e))))))

(def MIN_TRY_LIMIT_COUNT 3)
(def MIN_TRY_LIMIT 1)
(def empty-response {:body {:data []} :status 200})

(defn call-and-adapt [api-fn url min-limit-count]
  (try+
   (api-fn url)
   (catch skip-error-exception? e
     (log-error "Recoverable error encountered: Media Posted Before Business Account Conversion Error" (:body e))
     empty-response)
   (catch retry-exception? e
     (if (zero? min-limit-count)
       (throw+ e)
       (let [current-limit (or (parse-limit-from-url url) DEFAULT_LIMIT)
             new-limit (get-next-limit current-limit)
             new-url (update-url-with-limit url new-limit)
             new-min-limit-count (if (= new-limit MIN_TRY_LIMIT) (dec min-limit-count)
                                     min-limit-count)]
         (log-error (:body e))
         (log-error "RETYRING request with limit " new-limit)
         (call-and-adapt api-fn new-url new-min-limit-count))))))

(defn make-get-request
  ([url]
   (let [call-api-fn (fn [url] (client/GET url :as :json))
         current-limit (parse-limit-from-url url)
         new-url (if current-limit (update-url-with-limit url current-limit) url)]
     (call-and-adapt call-api-fn new-url MIN_TRY_LIMIT_COUNT)))
  ([url query-params]
   (let [call-api-fn (fn [url] (client/GET url :query-params (dissoc query-params :limit) :as :json))
         current-limit (:limit query-params)
         new-url (if current-limit (update-url-with-limit url current-limit) url)]
     (call-and-adapt call-api-fn new-url MIN_TRY_LIMIT_COUNT))))

(defn extract-values
  "traverse object(@row) values and take only scalar values or flatten simple objects(key->value) or explodes arrays(insights metrics)
  return list of objects with enhanced info(:keboola keyword) and all scalar values"
  [row params ex-account-id]
  (let [scalars (parser/filter-scalars row)
        objects-flatten (parser/filter-flatten-objects row)
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
  (if-let [next-page-url (get-next-page-url response)] ; process next api page if exists
    (let [new-response (:body (make-get-request next-page-url))]
      (cond (contains? new-response :data)
            [{
              :parent-id (:parent-id params)
              :fb-graph-node (:fb-graph-node params)
              :name (:table-name params)
              :data new-response}]

            (contains? new-response (keyword ex-account-id))
            [{
              :parent-id ex-account-id
              :fb-graph-node top-node
              :name top-node
              :data new-response}]

            :else
            (app-error (str "Unknown page structure:" (keys new-response) "next-page" next-page-url (dissoc params :body-data :response)))))))

(defn page-and-collect
  "collect data from response and make another paging requests if needed.
  Returns lazy sequence of flattened data resulting from processing the whole query"
  [{:keys [ex-account-id parent-id fb-graph-node table-name body-data response] :as init-params}]
  ((fn step [params this-object-data rest-objects top-node]
            (if (and (empty? rest-objects) (empty? this-object-data))
              nil
              (let [
                    new-rows (mapcat #(extract-values % (dissoc params :body-data :response) ex-account-id) this-object-data)

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

(defn nested-request
  "Make a initial request to fb api given query and collect its result data.
  Returns collection of maps of key-value pairs page-id -> result_data "
  [access-token {:keys [fields ids path limit since until] :as whole-query} & {:keys [ version]}]
  (let [preparsed-fields (parser/preparse-fields fields)
        preparsed-since (parser/preparse-fields (or since ""))
        preparsed-until (parser/preparse-fields (or until ""))
        query-params (assoc whole-query :access_token access-token :fields preparsed-fields :since preparsed-since :until preparsed-until)
        full-url (make-url path version)
        response (make-get-request full-url query-params)
        response-body (:body response)
        sanitized-path (keyword (string/replace path #"/" "_"))]

    (log-strings "calling" full-url "with" preparsed-fields ids preparsed-since preparsed-until)
    (if (some? ids)
      (mapcat
       #(page-and-collect
         {
          :ex-account-id (name (first %))
          :parent-id (name (first %))
          :fb-graph-node "page"
          :table-name "page"
          :body-data [(if (not-empty path) {sanitized-path (second %)} (second %))]
          :response response-body})

       response-body)
       ;else - no ids response
      (page-and-collect
       {
          :ex-account-id ""
          :parent-id ""
          :fb-graph-node "page"
          :table-name "page"
          :body-data [(if (not-empty path) {sanitized-path response-body} response-body)]
          :response (if (not-empty path) {sanitized-path response-body} response-body)}))))


(defn- collect-result [response api-fn]
  (lazy-seq
   (if (not-empty (:data response))
     (cons (:data response)
           (if (some? (-> response :paging :next))
             (collect-result (:body (api-fn (-> response :paging :next))) api-fn))))))


(defn- get-request [access-token path & {:keys [query version]}]
  (let [query-params (assoc query :access_token access-token)
        request-fn (fn [url] (client/GET url :query-params query-params :as :json))
        full-url (make-url path version)]
    ;(println full-url)
    (collect-result
     (:body (request-fn full-url))
     request-fn)))


(defn get-accounts [access-token & {:keys [version]}]
  (apply concat (get-request access-token "me/accounts" :version version)))

(defn get-igaccounts [access-token & {:keys [version]}]
  (apply concat (get-request access-token "me/accounts"
                             :query {:fields "instagram_business_account,name,category"}
                             :version version)))

(defn get-adaccounts [access-token & {:keys [version]}]
  (apply concat (get-request access-token "me/adaccounts"
                             :query {:fields "account_id,id,business_name,name,currency"}
                             :version version)))

(defn debug-token [app-token input-token & {:keys [version]}]
  (let [query {:access_token app-token :input_token input-token}
        url (make-url "debug_token" version)]
    (:body (client/GET url :query-params query :as :json))))
