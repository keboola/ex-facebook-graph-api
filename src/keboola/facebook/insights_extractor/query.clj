(ns keboola.facebook.insights-extractor.query
  (:gen-class)
  (:require [keboola.facebook.api.request :as request]
            [keboola.facebook.insights-extractor.output :as output]
            [keboola.docker.runtime :as runtime]
            [clojure.core.async :as async]))

(defn run-nested-query [token out-dir {:keys [name query version]}]
  (let [nested-data (request/nested-request token query :version version)
        all-rows (apply concat nested-data)]
    (output/write-rows all-rows out-dir name)
    (runtime/log-strings "Run query" name "finished" )))

(defn parse-token [credentials]
  (:token credentials))

(defn check-ids [query all-ids]
  (let [ids (get-in query [:query :ids])
        has-ids-key (contains? (:query query) :ids)]
    (if (and has-ids-key (empty? ids)) (assoc-in query [:query :ids] all-ids)
        ;else return query untouched
        query)))

(defn run-query [query all-ids credentials out-dir]
  (runtime/log-strings "Run query:" query)
  (let [token (parse-token credentials)
        q (check-ids query all-ids)
        complete-query {:query (:query q) :name (:name q) :version (:api-version q)}]
    (case (:type query)
      "nested-query" (run-nested-query token out-dir complete-query))))
