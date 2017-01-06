(ns keboola.facebook.insights-extractor.output
  (:require [keboola.utils.json-to-csv :as csv]
            [keboola.docker.runtime :as runtime]
            [clojure.core.async :as async :refer [onto-chan >! <! >!! <!! go chan buffer close! thread alts! alts!! timeout]]
            [clojure.java.io :as io]))

(defn sort-columns [columns]
  (let [prefered-columns [:id :account-id :parent-type :parent-id :name :key1 :key2 :value :period :end_time :title]
        used-prefered-columns (filter (set columns) prefered-columns)
        other-columns (filter #(not ((set used-prefered-columns) %)) columns)]
    (concat used-prefered-columns (sort other-columns))))

(defn get-primary-key [table-columns]
  (let [basic-pk ["id" "parent-id"]
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

(defn write-manifest [file-path columns is-write?]
  (if is-write?
    (let [manifest {:incremental true :primary_key (get-primary-key columns)}]
      (runtime/save-manifest file-path manifest))))

(defn prepare-header [rows]
  (let [columns (set (mapcat #(-> % (dissoc :keboola) keys) rows))
        all-columns (conj columns :parent-id :parent-type :account-id)]
    (sort-columns all-columns)))

(defn flush-buffer [csv-file file-path memo]
  ;(println "FLUSHING" file-path (count (:buffer memo)) (:cnt memo))
  (let [first-write? (:first-write? memo)
        header (if first-write? (prepare-header (:buffer memo)) (:header memo))]
      (write-manifest file-path header first-write?)
      (csv/write-to-file csv-file header (:buffer memo) first-write?)
      header))

(defn add-id-coloumns [row]
  (assoc row
         :account-id (-> row :keboola :account-id)
         :parent-id (-> row :keboola :parent-id)
         :parent-type (-> row :keboola :parent-type)))

(defn process-row [row csv-file file-path memo]
  (if (or (= (count (:buffer memo)) 300))
    (let [header (flush-buffer csv-file file-path (update memo :buffer #(conj % row)))]
      {:cnt (inc (:cnt memo)) :header header :buffer '() :first-write? false})
    ;else part
    {:cnt (inc (:cnt memo))
     :header (:header memo)
     :buffer (conj (:buffer memo) row)
     :first-write? (:first-write? memo)}))

(defn create-write-thread [table-name input-ch file-path-prefix]
  (async/thread
    (let [file-path (str file-path-prefix "_" table-name)]
      (with-open [out-file (io/writer file-path)]
          (loop [memo {:cnt 0 :buffer '() :header {} :first-write? true}]
            (let [row (<!! input-ch)]
              (if (some? row)
                (recur (process-row row out-file file-path memo))
                ;; else input-ch has closed -> don't call recur,
                (do
                  (flush-buffer out-file file-path (update memo :buffer #(conj % row)))
                  (runtime/log-strings "Written" (:cnt memo) (count (:buffer memo)) "rows to table " table-name))
                ;; thread terminates
                )))))
    ; return true as succesfull finish of thread
    true))

(defn create-tables-map [tables-names value-fn]
  (apply hash-map (mapcat #(list % (value-fn %)) tables-names)))

(defn close-table-channels [table-map]
  (doseq [[_ c] table-map]
    (close! c)))

(defn write-rows [rows file-path-prefix]
  (let [sample (take 2000 rows)
        tables-names (set (map #(get-table-name %) sample))
        tables-chans (create-tables-map tables-names (fn [_] (chan)))
        threads-chans (create-tables-map tables-names #(create-write-thread % (tables-chans %) file-path-prefix))]
    (runtime/log-strings "found tables" tables-names)
    (dorun (map-indexed
            (fn [idx row]
              (let [table-name (get-table-name row)
                    output-chan (tables-chans table-name)]
                (>!! output-chan (add-id-coloumns row))
                (if (= 0 (mod idx 5000)) (runtime/log-strings "Processed" idx "rows"))
                )) rows))
    (close-table-channels tables-chans)
    (every? true? (map (fn [[_ c]] async/<!! c) threads-chans))
    ))
