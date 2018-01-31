(ns keboola.facebook.extractor.query
  (:gen-class)
  (:require [clojure.core.async :as async]
            [clojure.string :as s]
            [keboola.docker.runtime :as runtime]
            [keboola.facebook.api.request :as request]
            [keboola.facebook.extractor.output :as output]
            [clojure.string :as string]))

(defn- run-and-write [token out-dir prefix query version]
  (let [nested-data (request/nested-request token query :version version)
        all-rows (apply concat nested-data)]
    (output/write-rows all-rows out-dir prefix)))


(defn retrieve-page-access-token [id token version]
  (let [accounts (request/get-accounts token :version version)
        page-token (:access_token (first (filter #(= id (:id %)) accounts)))]
    (if (nil? page-token)
      (runtime/log-strings "Could not find page access token for" id "Will use user token instead.")
      (runtime/log-strings "Using page access token to retrieve data for" id))
    page-token))

(defn run-nested-query [token out-dir {:keys [name query version]}]
  (if-let [ids-str (:ids query)]
    (doseq [ids (partition-all 50 (s/split ids-str #","))]
      (run-and-write token out-dir name (assoc query :ids (s/join "," ids)) version))
    ;else if no ids then run the whole query
    (run-and-write token out-dir name query version))
  (runtime/log-strings "Run query" name "finished"))

(defn run-nested-query-with-page-token [user-token out-dir {:keys [name query version]}]
  (if-let [ids-str (:ids query)]
    (doseq [id (s/split ids-str #",")]
      (let [token (or (retrieve-page-access-token id user-token version) user-token)]
        (run-and-write token out-dir name (assoc query :ids id) version)))
    ;else if no ids then run the whole query
    (run-and-write user-token out-dir name query version))
  (runtime/log-strings "Run query" name "finished"))


(defn parse-token [credentials]
  (:token credentials))

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
  (string/includes? (or path "") "feed")
  )

(defn need-page-token? [query]
  (and (runtime/keboola-ex-facebook-component?)
       (or (query-contains-insights? query)
           (not (query-path-feed? query)))))

(defn run-query [query all-ids credentials out-dir]
  (runtime/log-strings "Run query:" query)
  (let [token (parse-token credentials)
        q (check-ids query all-ids)
        complete-query {:query (:query q) :name (:name q) :version (:api-version q)}
        run-with-page-token #(run-nested-query-with-page-token token out-dir complete-query)
        run-with-user-token #(run-nested-query token out-dir complete-query)
        run-query #(if (need-page-token? (:query query)) (run-with-page-token) (run-with-user-token))]
    (case (:type query)
      "nested-query" (run-query))))
