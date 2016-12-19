(ns keboola.facebook.insights-extractor.query
  (:gen-class)
  (:require [keboola.facebook.api.request :as request]
            [keboola.facebook.api.parser :as parser]
            [cheshire.core :refer [parse-string]]
            [keboola.utils.json-to-csv :as csv]
            [keboola.docker.runtime :as runtime]
            [clojure.core.async
             :as async
             :refer [>! <! >!! <!! go chan buffer close! thread
                     alts! alts!! timeout]]))

(defn get-primary-key [table-columns]
  (let [basic-pk ["id"]
        extended-pk ["key1" "key2" "end_time"]]
    (concat basic-pk (filter (fn [column] (some #(= % (keyword column)) table-columns)) extended-pk))))

(defn make-csv-write-chan [get-data-fn columns filepath]
  (let [manifest {:incremental true :primary_key (get-primary-key columns)}]
    (runtime/save-manifest filepath manifest)
    (async/thread
      (csv/write filepath columns (get-data-fn))
      true)))

(defn filter-table-data-fn [data table-name]
  (fn []
    (map #(assoc %
                 :account-id (-> % :keboola :account-id)
                 :parent-id (-> % :keboola :parent-id)
                 :parent-type (-> % :keboola :parent-type))
         (filter #(= table-name (-> % :keboola :table-name)) data))))

(defn run-nested-query [token out-dir {:keys [name path fields ids version]}]
  (let [nested-data (request/nested-request token
                                 {:fields fields
                                  :ids ids}
                                 :version version)
        lazy-data-seq (apply concat (mapcat #(:data %) nested-data))
        analyzed-structure (parser/analyze-seq lazy-data-seq 2000)
        tables-columns (dissoc (:columns analyzed-structure) "page")
        write-channels (reduce-kv (fn [memo table-name columns]
                                    (conj memo
                                          (make-csv-write-chan
                                           (filter-table-data-fn lazy-data-seq table-name)
                                           (conj columns :parent-id :parent-type :account-id)
                                           (str out-dir name "_" table-name) ))
                                    ) [] tables-columns)]
    (runtime/log-strings "Writing output to csv files. Analyzed structure:" analyzed-structure)
    (mapv #(async/<!! %) write-channels)
    (runtime/log-strings "Run query " name " finished" )
    ))

(defn parse-token [credentials]
  (:token credentials))


(defn run-query [query credentials out-dir]
  (runtime/log-strings "Run query:" query)
  (let [token (parse-token credentials)
        complete-query (assoc (:query query) :name (:name query) :version (:api-version query))]
    (case (:type query)
      "nested-query" (run-nested-query token out-dir complete-query))))
