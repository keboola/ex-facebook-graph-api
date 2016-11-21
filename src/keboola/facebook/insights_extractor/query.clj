(ns keboola.facebook.insights-extractor.query
  (:require [keboola.facebook.api.request :as request])
  (:require [keboola.facebook.api.parser :as parser])
  (:require [cheshire.core :refer [parse-string]])
  (:require [keboola.utils.json-to-csv :as csv])
  (:require [clojure.core.async
             :as async
             :refer [>! <! >!! <!! go chan buffer close! thread
                     alts! alts!! timeout]])
  )

(defn make-csv-write-chan [get-data-fn columns filepath]
  (async/thread
    (csv/write filepath columns (get-data-fn))
    true)
  )
(defn filter-table-data-fn [data table-name]
  (fn []
    (map #(assoc % :parent-id (-> % :keboola :parent-id) :parent-type (-> % :keboola :parent-type))
         (filter #(= table-name (-> % :keboola :table-name)) data)))
  )

(defn run-nested-query [token out-dir {:keys [name path fields ids ids-title version]}]
  (let [nested-data (request/nested-request token
                                 {:fields fields
                                  :ids ids
                                  :ids-title ids-title}
                                 :version version)
        lazy-data-seq (parser/unfold-nested-sequence (mapcat #(:data %) nested-data))
        tables-columns (dissoc (:columns (parser/analyze-seq lazy-data-seq 400)) ids-title)
        write-channels (reduce-kv (fn [memo table-name columns]
                                    (conj memo
                                          (make-csv-write-chan
                                           (filter-table-data-fn lazy-data-seq table-name)
                                           (conj columns :parent-id :parent-type)
                                           (str out-dir "/" name "_" table-name) ))
                                    ) [] tables-columns)
        result (mapv #(async/<!! %) write-channels)]
    result))

(defn parse-token [credentials]
  (parse-string credentials true) :token)


(defn run-query [query credentials out-dir]
  (let [token (parse-token credentials)]
    (case (:type query)
      "nested-query" (run-nested-query token out-dir (assoc (:query query) :name (:name query) :version (:api-version query)))
      )))
