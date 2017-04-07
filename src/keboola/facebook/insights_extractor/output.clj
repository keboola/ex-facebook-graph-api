(ns keboola.facebook.insights-extractor.output
  (:require [keboola.utils.json-to-csv :as csv]
            [keboola.docker.runtime :as runtime]
            [keboola.docker.config :refer [mkdirp]]
            [clojure.string :refer [split]]
            [clj-time.coerce :refer [to-long]]
            [clj-time.core :refer [now]]
            [slingshot.slingshot :refer [try+ throw+]]
            [clojure.core.async :as async :refer [onto-chan >! <! >!! <!! go chan buffer close! thread alts! alt!! alts!! timeout]]
            [clojure.java.io :as io]))

(def chan-buffer-size 300)
(def sample-rows-count 3000)

(defn delete-file-if-empty [file-path]
  (if (= 0 (.length (io/file file-path)))
    (io/delete-file file-path)))

(defn delete-dir-if-empty [dir-path]
  (let [dir-contents (.list (io/file dir-path))]
    (if (empty? dir-contents)
      (io/delete-file dir-path))))

(defn sort-columns [columns]
  (let [prefered-columns [:id :ex-account-id :fb-graph-node :parent-id :name :key1 :key2 :ads_action_name :action_type :action_reaction :value :period :end_time :title ]
        used-prefered-columns (filter (set columns) prefered-columns)
        other-columns (filter #(not ((set used-prefered-columns) %)) columns)]
    (concat used-prefered-columns (sort other-columns))))

(def TABLES-SPECIFIC-PK-MAP
  {
   "insights" ["age" "country" "dma" "gender" "frequency_value" "hourly_stats_aggregated_by_advertiser_time_zone" "hourly_stats_aggregated_by_audience_time_zone" "impression_device" "place_page_id" "placement" "publisher_platform" "platform_position" "device_platform" "product_id" "region"]
   })
(defn get-primary-key [table-columns table-name]
  (let [basic-pk ["parent_id"]
        all-tables-pk ["id" "key1" "key2" "end_time" "account_id" "campaign_id" "date_start" "date_stop" "ads_action_name" "action_type" "action_reaction"]
        table-only-pk  (TABLES-SPECIFIC-PK-MAP table-name #{})
        extended-pk (concat all-tables-pk table-only-pk)]
    (concat basic-pk
            (filter
             (fn [column] (some #(= % (keyword column)) table-columns))
             extended-pk))))

(defn get-table-name [row]
  (-> row :keboola :table-name))

(defn add-id-coloumns [row]
  (assoc row
         :ex-account-id (-> row :keboola :ex-account-id)
         :parent-id (-> row :keboola :parent-id)
         :fb-graph-node (-> row :keboola :fb-graph-node)))

(def columns-map (atom {}))
(defn reset-columns-map [] (reset! columns-map {}))

(defn write-manifest [manifest-path columns is-write? table-name]
  (if is-write?
    (let [manifest {:incremental true :primary_key (get-primary-key columns table-name) :columns columns}]
      (if (not (contains? @columns-map manifest-path))
        (do
          (runtime/save-manifest manifest-path manifest)
          (swap! columns-map assoc manifest-path columns))))))



(defn prepare-header [rows manifest-path]
  (let [columns (set (mapcat #(-> % (dissoc :keboola) keys) rows))
        all-columns (conj columns :parent-id :fb-graph-node :ex-account-id)
        new-columns (sort-columns all-columns)
        has-data-columns (not-empty (disj (set new-columns) :id :ex-account-id :fb-graph-node :parent-id))
        saved-columns (@columns-map manifest-path)]
    (if has-data-columns ;else return nil -> no data to write
      (if saved-columns ;else returns new-columns
        (if (= saved-columns new-columns) ;else throws error
          ; return saved columns from previous query
          saved-columns
          ;else throw error on columns mismatch
          (throw+ (str "columns mismatch, original write columns: " saved-columns " ,current write columns: " new-columns)))
        ; else return newly computed columns
        new-columns))
    ; by default return nil saying we have no data to save
    ))

(defn flush-buffer [csv-file manifest-path table-name memo]
  (let [first-write? (:first-write? memo)
        header (if first-write?
                 (prepare-header (:buffer memo) manifest-path)
                 (:header memo))]
    (if header
      (do
        (write-manifest manifest-path header first-write? table-name)
        (csv/write-to-file csv-file header (:buffer memo) false)
        (if (= (mod (:cnt memo) (* chan-buffer-size 20)) 0)
          (runtime/log-strings "Written" (:cnt memo) "rows to" table-name))
        ;return header
        header)
      ; else has only ids columns return nil header
      (do
        (if first-write? (runtime/log-strings "Skipping table" table-name "containing only id and parent-id columns"))
        nil))))

(defn process-row [row csv-file manifest-path table-name memo]
  (if (= (count (:buffer memo)) chan-buffer-size)
    (let [header (flush-buffer csv-file manifest-path table-name memo)]
      {:cnt (inc (:cnt memo)) :header header :buffer (list row) :first-write? false})
    ;else part
    {:cnt (inc (:cnt memo))
     :header (:header memo)
     :buffer (conj (:buffer memo) row)
     :first-write? (:first-write? memo)}))

(defn create-write-thread [table-name input-ch out-dir qname-prefix]
  (async/thread
    (try+
     (let [kbc-table-name (if (= (last (split qname-prefix #"_")) table-name)
                            qname-prefix
                            (str qname-prefix "_" table-name))
           sliced-dir-path (str out-dir kbc-table-name)
           sliced-file-name (str (to-long (now)))
           sliced-file-path (str sliced-dir-path "/" sliced-file-name)]
       (mkdirp sliced-dir-path)
       (with-open [out-file (io/writer sliced-file-path)]
         (loop [memo {:cnt 0 :buffer '() :header {} :first-write? true}]
           (let [row (<!! input-ch)]
             (if (some? row)
               (recur (process-row row out-file sliced-dir-path table-name memo))
               ;; else input-ch has closed -> don't call recur,
               (if (some? (flush-buffer out-file sliced-dir-path table-name memo))
                 (runtime/log-strings "Total written" (:cnt memo) "rows to table" table-name))
               ;; thread terminates
               ))))
       (delete-file-if-empty sliced-file-path)
       (delete-dir-if-empty  sliced-dir-path))
     ; return true as succesfull finish of thread
     {:return true}
     (catch Object e
       {:return false :error (str "failed write " table-name  " with error: " e)}
       ))))

(defn create-tables-map [tables-names value-fn]
  (apply hash-map (mapcat #(list % (value-fn %)) tables-names)))

(defn close-channels [table-map thread-chans-vec error-strategy]
  (doseq [[_ c] table-map]
    (close! c))
  (while (when-let [return-value (async/<!! (async/merge thread-chans-vec))]
           (if-not (:return return-value)
             (cond
               (= error-strategy :throw-on-false-return) (throw+ (:error return-value))
               (= error-strategy :log-on-false-return) (runtime/log-error (:error return-value))))
           return-value)))


(defn write-rows [rows out-dir qname-prefix]
  (let [sample (take sample-rows-count rows)
        tables-names (set (map #(get-table-name %) sample))
        tables-chans (create-tables-map tables-names (fn [_] (chan)))
        threads-chans (create-tables-map tables-names #(create-write-thread % (tables-chans %) out-dir qname-prefix))
        thread-chans-vec (mapv #(second %) threads-chans)]
    (runtime/log-strings "found tables" tables-names)
    (try+
     (doseq [row rows]
       (let [table-name (get-table-name row)
             output-chan (tables-chans table-name)
             output-row (add-id-coloumns row)
             put-result (alt!! (timeout (* 30 1000)) :timed-out
                               [[output-chan output-row]] :sent)]
         (if (= put-result :timed-out)
           (throw+ (str "There was an error writing to table " table-name " data:" output-row)))))
     (catch Object _
       (close-channels tables-chans thread-chans-vec :log-on-false-return)
       (throw+)))
    (close-channels tables-chans thread-chans-vec :throw-on-false-return)))
