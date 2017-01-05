(ns keboola.facebook.insights-extractor.output
  (:require [keboola.utils.json-to-csv :as csv]
            [keboola.docker.runtime :as runtime]
            [clojure.core.async :as async]))

(defn sort-columns [columns]
  (let [prefered-columns [:id :account-id :parent-type :parent-id :name :key1 :key2 :value :period :end_time :title]
        used-prefered-columns (filter (set columns) prefered-columns)
        other-columns (filter #(not ((set used-prefered-columns) %)) columns)]
    (concat used-prefered-columns (sort other-columns))))

(defn get-primary-key [table-columns]
  (let [basic-pk ["id"]
        extended-pk ["key1" "key2" "end_time"]]
    (concat basic-pk (filter (fn [column] (some #(= % (keyword column)) table-columns)) extended-pk))))

(defn write-one-table [table-name table-rows file-path-prefix]
  (let [sample-rows (take 500 table-rows)
        sample-columns (set (mapcat #(-> % (dissoc :keboola) keys) sample-rows))
        has-data-columns (not-empty (disj sample-columns :id :account-id))
        columns (conj sample-columns :parent-id :parent-type :account-id)
        csv-header (sort-columns columns)
        manifest {:incremental true :primary_key (get-primary-key columns)}
        file-path (str file-path-prefix "_" table-name)]
    (if has-data-columns
      (do
        (runtime/log-strings "Start writing csv output of table" table-name "with columns" csv-header)
        (runtime/save-manifest file-path manifest)
        (csv/write file-path csv-header
                   (map #(assoc %
                                :account-id (-> % :keboola :account-id)
                                :parent-id (-> % :keboola :parent-id)
                                :parent-type (-> % :keboola :parent-type))
                        table-rows)))
      (runtime/log-strings "Skipping table" table-name "with non data columns" csv-header))))

(defn get-table-name [row]
  (-> row :keboola :table-name))

(defn filter-table-rows [table-name rows]
  (filter #(= table-name (get-table-name %)) rows))

(defn create-write-channels [rows file-path-prefix]
  (let [sample (take 3000 rows)
        tables-names (set (map #(get-table-name %) sample))]
    (runtime/log-strings "found tables" tables-names)
    (map #(async/thread (write-one-table % (filter-table-rows % rows) file-path-prefix))
         tables-names)))
