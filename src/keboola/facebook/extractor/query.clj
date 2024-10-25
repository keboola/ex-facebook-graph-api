(ns keboola.facebook.extractor.query
  (:gen-class)
  (:require [clojure.core.async :as async]
            [clojure.string :as s]
            [keboola.docker.config :as docker-config]
            [keboola.docker.runtime :as runtime]
            [keboola.facebook.api.request :as request]
            [keboola.facebook.extractor.query-parser :refer :all]
            [keboola.facebook.extractor.output :as output]
            [clojure.string :as string])
  (:import [java.time LocalDate]
           [java.time.format DateTimeFormatter]))
(defn incremental?
  "Returns false if the given query is not incremental, true otherwise."
  [query]
  (let [incremental-value (:incremental query)]
    (if (nil? incremental-value)
      true
      incremental-value)))

(defn- run-and-write [token out-dir prefix query version]
  (let [nested-data (request/nested-request token query :version version)
        all-rows (apply concat nested-data)]
    (output/write-rows all-rows out-dir prefix false (incremental? query))))

(defmacro swallow-exceptions [& body]
  `(try ~@body (catch Exception e#)))

(defn retrieve-page-access-token [id token version]
  (let [accounts (swallow-exceptions (request/get-accounts token :version version))
        page-token-from-accounts-list (if (some? accounts) (:access_token (first (filter #(= id (:id %)) accounts))))
        page-token-from-page-details (swallow-exceptions (request/get-page-token-via-page-details token id))
        page-token (or page-token-from-accounts-list page-token-from-page-details)]
    (if (nil? page-token)
      (runtime/log-strings "Could not find page access token for" id ". Token from the configuration will be used instead.")
      (runtime/log-strings "Using page access token to retrieve data for" id))
    page-token))

(defn choose-token [id user-token version]
  (or (retrieve-page-access-token id user-token version) user-token))

(defn- run-by-id-merge-and-write
  ([token out-dir prefix query version] (run-by-id-merge-and-write token out-dir prefix query version choose-token))
  ([token out-dir prefix query version choose-token-fn]
   (let [ids-str (:ids query)
         prepare-query #(assoc query :ids %)
         run-query (fn [id] (request/nested-request (choose-token-fn id token version) (prepare-query id) :version version))
         ids-seq (s/split ids-str #",")
         all-merged-queries-rows (mapcat #(run-query %) ids-seq)
         all-rows (apply concat all-merged-queries-rows)]
     (output/write-rows all-rows out-dir prefix false (incremental? query)))))

(defn run-nested-query [token out-dir {:keys [name query version run-by-id?]}]
  (if-let [ids-str (:ids query)]
    (if run-by-id?
      (run-by-id-merge-and-write token out-dir name query version (constantly token))
      (doseq [ids (partition-all 50 (s/split ids-str #","))]
        (run-and-write token out-dir name (assoc query :ids (s/join "," ids)) version)))
    ;else if no ids then run the whole query
    (run-and-write token out-dir name query version))
  (runtime/log-strings "Run query" name "finished"))

(defn run-nested-query-with-page-token [user-token out-dir {:keys [name query version]}]
  (if (some?  (:ids query))
    (run-by-id-merge-and-write user-token out-dir name query version)
    ;else if no ids then run the whole query
    (run-and-write user-token out-dir name query version))
  (runtime/log-strings "Run query" name "finished"))

(defn check-ids [query all-ids]
  (let [ids (get-in query [:query :ids])
        has-ids-key (contains? (:query query) :ids)]
    (if (and has-ids-key (empty? ids)) (assoc-in query [:query :ids] all-ids)
        ;else return query untouched
        query)))

(defn query-contains-insights? [{:keys [fields path] :or {fields "" path ""}}]
  (or (string/includes? (or fields "") "insights")
      (string/includes? (or path "") "insights")))

(defn query-path-feed? [{:keys [path] :or {path ""}}]
  (string/includes? (or path "") "feed"))

(defn query-path-posts? [{:keys [path] :or {path ""}}]
  (string/includes? (or path "") "posts"))

(defn query-path-ratings? [{:keys [path] :or {path ""}}]
  (string/includes? (or path "") "ratings"))

(defn query-path-stories? [{:keys [path] :or {path ""}}]
  (string/includes? (or path "") "stories"))

(defn query-need-userinfo? [{:keys [fields path] :or {fields "" path ""}}]
  (or (some #(string/includes? (or fields "") %) ["likes" "from" "username"])
      (string/includes? (or path "") "likes")))

(defn need-page-token? [query]
  (and (runtime/keboola-ex-facebook-component?)
       (or (query-contains-insights? query)
           (query-path-ratings? query)
           (query-path-feed? query)
           (query-path-stories? query)
           (query-path-posts? query)
           (query-need-userinfo? query))))

(defn make-run-inishgts-query-with-time-range [async-insights-request-fn token id parameters-str version query]
  (let [parameters-map (parse-parameters parameters-str)
        time-ranges-str (get parameters-map "time_ranges")
        date-preset (get parameters-map "date_preset")]
    (cond
    ;; If time_ranges is present, split into daily queries
      time-ranges-str
      (let [time-ranges (parse-time-ranges time-ranges-str)
            expanded-time-ranges (expand-time-ranges time-ranges)
            run-query-for-time-range (fn [time-range]
                                       (let [new-parameters (generate-parameters-for-dates parameters-map time-range)]
                                         (async-insights-request-fn token id new-parameters version query)))]
        (runtime/log-strings "Splitting query by time_ranges: " {:time_ranges expanded-time-ranges})
        (mapcat run-query-for-time-range expanded-time-ranges))
    ;; If date_preset is one of last_3d, last_7d, last_30d, split into daily queries
      (some #{date-preset} ["last_3d" "last_7d" "last_30d"])
      (let [days (date-preset-to-days date-preset)
            end-date (.format (LocalDate/now) (DateTimeFormatter/ofPattern "yyyy-MM-dd"))
            start-date (get-past-date days)
            expanded-time-ranges (generate-date-ranges start-date end-date)
            run-query-for-time-range (fn [time-range]
                                       (let [new-parameters (generate-parameters-for-dates parameters-map time-range)]
                                         (async-insights-request-fn token id new-parameters version query)))]
        (runtime/log-strings "Splitting query by date_preset: " date-preset {:time_ranges expanded-time-ranges})
        (mapcat run-query-for-time-range expanded-time-ranges))
    ;; Else, use the parameters as is
      :else
      (do
        (runtime/log-strings "Running query with parameters as is even though split-query-time-range-by-day = true")
        (async-insights-request-fn token id parameters-str version query)))))

;; Runs the async insights query, splitting it into daily queries based on time_ranges or date_preset.
(defn run-async-insights-query-with-splitting [token out-dir name query version]
  (let [ids-str (:ids query)
        parameters (:parameters query)
        ids-seq (s/split ids-str #",")
        run-query (fn [id] (make-run-inishgts-query-with-time-range request/async-insights-request token id parameters version query))
        all-merged-queries-rows (mapcat run-query ids-seq)
        all-rows (apply concat all-merged-queries-rows)]
    (output/write-rows all-rows out-dir name true (incremental? query))))

;; Runs the async insights query, optionally splitting it into daily queries based on the query configuration.
(defn run-async-insights-query [token out-dir name query version]
  (let [split-query? (:split-query-time-range-by-day query)]
    (if split-query?
      (run-async-insights-query-with-splitting token out-dir name query version)
      ;; Else, use the parameters as is
      (let [ids-str (:ids query)
            parameters (:parameters query)
            ids-seq (s/split ids-str #",")
            run-query (fn [id] (request/async-insights-request token id parameters version query))
            all-merged-queries-rows (mapcat run-query ids-seq)
            all-rows (apply concat all-merged-queries-rows)]
        (output/write-rows all-rows out-dir name true (incremental? query))))))

(defn run-query [query all-ids credentials out-dir]
  (runtime/log-strings "Run query:" query)
  (let [token (docker-config/get-fb-token credentials)
        q (check-ids query all-ids)
        complete-query {:query (:query q) :name (:name q) :version (:api-version q) :run-by-id? (:run-by-id q)}
        run-with-page-token #(run-nested-query-with-page-token token out-dir complete-query)
        run-with-user-token #(run-nested-query token out-dir complete-query)
        run-query #(if (need-page-token? (:query query)) (run-with-page-token) (run-with-user-token))]
    (case (:type query)
      "nested-query" (run-query)
      "async-insights-query" (run-async-insights-query token out-dir (:name q) (:query q) (:api-version q)))))
