(ns keboola.facebook.insights-extractor.query
  (:gen-class)
  (:require [keboola.facebook.api.request :as request]
            [keboola.facebook.insights-extractor.output :as output]
            [keboola.docker.runtime :as runtime]
            [clojure.core.async :as async]))


(defn run-nested-query [token out-dir {:keys [name query version]}]
  (let [nested-data (request/nested-request token query :version version)
        all-rows (apply concat nested-data)
        result (output/write-rows all-rows (str out-dir name))]
    (runtime/log-strings "Run query " name " finished" result)))

(defn parse-token [credentials]
  (:token credentials))

(defn run-query [query credentials out-dir]
  (runtime/log-strings "Run query:" query)
  (let [token (parse-token credentials)
        complete-query {:query (:query query) :name (:name query) :version (:api-version query)}]
    (case (:type query)
      "nested-query" (run-nested-query token out-dir complete-query))))
