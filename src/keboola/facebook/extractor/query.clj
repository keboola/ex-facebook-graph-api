(ns keboola.facebook.extractor.query
  (:gen-class)
  (:require [clojure.core.async :as async]
            [clojure.string :as s]
            [keboola.docker.runtime :as runtime]
            [keboola.facebook.api.request :as request]
            [keboola.facebook.extractor.output :as output]))

(defn- run-and-write [token out-dir prefix query version]
  (let [nested-data (request/nested-request token query :version version)
        all-rows (apply concat nested-data)]
    (output/write-rows all-rows out-dir prefix)))

(defn run-nested-query [token out-dir {:keys [name query version]}]
  (if-let [ids-str (:ids query)]
    (doseq [ids (partition-all 50 (s/split ids-str #","))]
      (run-and-write token out-dir name (assoc query :ids (s/join "," ids)) version))
    ;else if no ids then run the whole query
    (run-and-write token out-dir name query version))
  (runtime/log-strings "Run query" name "finished"))

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
