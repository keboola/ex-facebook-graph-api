(ns keboola.facebook.insights-extractor.output
  (:require [keboola.utils.json-to-csv :as csv]
            [keboola.docker.runtime :as runtime]
            [slingshot.slingshot :refer [try+ throw+]]
            [clojure.core.async :as async :refer [onto-chan >! <! >!! <!! go chan buffer close! thread alts! alts!! timeout]]
            [clojure.java.io :as io]))

(def chan-buffer-size 300)
(def sample-rows-count 3000)

(defn delete-file-if-empty [file-path]
  (if (= 0 (.length (io/file file-path)))
    (io/delete-file file-path)))

(defn sort-columns [columns]
  (let [prefered-columns [:id :account-id :fb-graph-node :parent-id :name :key1 :key2 :value :period :end_time :title]
        used-prefered-columns (filter (set columns) prefered-columns)
        other-columns (filter #(not ((set used-prefered-columns) %)) columns)]
    (concat used-prefered-columns (sort other-columns))))

(defn get-primary-key [table-columns]
  (let [basic-pk ["id" "parent_id"]
        extended-pk ["key1" "key2" "end_time"]]
    (concat basic-pk (filter (fn [column] (some #(= % (keyword column)) table-columns)) extended-pk))))

(defn get-table-name [row]
  (-> row :keboola :table-name))

(defn add-id-coloumns [row]
  (assoc row
         :account-id (-> row :keboola :account-id)
         :parent-id (-> row :keboola :parent-id)
         :fb-graph-node (-> row :keboola :fb-graph-node)))

(defn write-manifest [file-path columns is-write?]
  (if is-write?
    (let [manifest {:incremental true :primary_key (get-primary-key columns)}]
      (runtime/save-manifest file-path manifest))))

(defn prepare-header [rows]
  (let [columns (set (mapcat #(-> % (dissoc :keboola) keys) rows))
        all-columns (conj columns :parent-id :fb-graph-node :account-id)]
    (sort-columns all-columns)))

(defn flush-buffer [csv-file file-path table-name memo]
  (let [first-write? (:first-write? memo)
        header (if first-write? (prepare-header (:buffer memo)) (:header memo))
        has-data-columns (not-empty (disj (set header) :id :account-id :fb-graph-node :parent-id))]
    (if has-data-columns
      (do
        (write-manifest file-path header first-write?)
        (csv/write-to-file csv-file header (:buffer memo) first-write?)
        (if (= (mod (:cnt memo) (* chan-buffer-size 3)) 0)
          (runtime/log-strings "Written" (:cnt memo) "rows to" table-name))
        ;return header
        header)
      ; else has only ids columns
      (do
        (if first-write? (runtime/log-strings "Skipping table" table-name "containing only id and parent-id columns"))
        nil))))

(defn process-row [row csv-file file-path table-name memo]
  (if (= (count (:buffer memo)) chan-buffer-size)
    (let [header (flush-buffer csv-file file-path table-name memo)]
      {:cnt (inc (:cnt memo)) :header header :buffer (list row) :first-write? false})
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
                (recur (process-row row out-file file-path table-name memo))
                ;; else input-ch has closed -> don't call recur,
                (if (some? (flush-buffer out-file file-path table-name memo))
                  (runtime/log-strings "Total written" (:cnt memo) "rows to table" table-name))
                ;; thread terminates
                ))))
      (delete-file-if-empty file-path))
    ; return true as succesfull finish of thread
    true))

(defn create-tables-map [tables-names value-fn]
  (apply hash-map (mapcat #(list % (value-fn %)) tables-names)))

(defn close-channels [table-map thread-chans-vec]
  (doseq [[_ c] table-map]
    (close! c))
  (while (async/<!! (async/merge thread-chans-vec))))


(defn write-rows [rows file-path-prefix]
  (let [sample (take sample-rows-count rows)
        tables-names (set (map #(get-table-name %) sample))
        tables-chans (create-tables-map tables-names (fn [_] (chan)))
        threads-chans (create-tables-map tables-names #(create-write-thread % (tables-chans %) file-path-prefix))
        thread-chans-vec (mapv #(second %) threads-chans)]
    (runtime/log-strings "found tables" tables-names)
    (try+
     (doseq [row rows]
       (let [table-name (get-table-name row)
             output-chan (tables-chans table-name)]
         (>!! output-chan (add-id-coloumns row))))
     (catch Object _
       (close-channels tables-chans thread-chans-vec)
       (throw+)))
    (close-channels tables-chans thread-chans-vec)))
