(ns keboola.facebook.api.parser
  (:require
   [keboola.docker.runtime :refer [app-error]]
   [clj-time.core :as t]
   [clojure.data.json :as json]
   [clj-time.format :refer [formatter unparse]]
   [clojure.string :as string]))

(defn relative-days-timestamp [days]
  (unparse (formatter "YYYY-MM-dd") (t/plus (t/now) (t/days (Integer/parseInt days)))))

(defn preparse-fields [fields-str]
  (string/replace fields-str #"%%days:-?\d+%%"
                  #(relative-days-timestamp (re-find #"-?\d+" %))))

(defn nested-object?
  "Returns true if objet is map and contains :data keyword"
  [object]
  (and (map? object) (contains? object :data)))

(defn extract-summary [object-name object row params]
  (if (contains? object :summary)
    {:name "summary"
     :data {:data [(:summary object)]}
     :parent-id (or (:id row) (:parent-id params))
     :fb-graph-node (str (:fb-graph-node params) "_" object-name)}))

(defn get-nested-objects
  "Traverse body-data array and take out nested-object like structures.
  Return array of objects with keys :name :data :parent-id :fb-graph-node "
  [body-data params]
  (reduce
   (fn [memo, row]
     (if-let [objects (reduce-kv (fn [m k v]
                                   (if (nested-object? v)
                                     (conj m
                                           {:name (name k)
                                            :data v
                                            :parent-id (or (:id row) (:parent-id params))
                                            :fb-graph-node (str (:fb-graph-node params) "_" (name k))}

                                           (extract-summary (name k) v row params)) m))
                                 [] row)]
       (concat memo (keep identity objects))
       memo))
   [] body-data))

(defn flatten-value-object
  "flattens object values and prepends and prepend key1"
  [key1 object-value]
  (cond
    (map? object-value) (map (fn [[key2 val]] {:key1 key1 :key2 (name key2) :value val})
                             object-value)
    :else (list {:key1 key1 :key2 "" :value object-value})))

(defn flatten-array-value
  "Flattens a single values array entry into key1/key2/value rows.
  Supports both old format (value is a map) and new Facebook API breakdown
  format where breakdown fields are siblings of value and end_time."
  ([item end_time]
   (flatten-array-value item end_time {}))
  ([item end_time breakdown-fields]
   (map
    #(merge % {:end_time end_time} breakdown-fields)
    (cond
      (map? item) (mapcat (fn [[key1 val]] (flatten-value-object (name key1) val)) item)
      :else (list {:key1 (or (first (vals breakdown-fields)) "")
                   :key2 (if (> (count breakdown-fields) 1)
                           (second (vals breakdown-fields))
                           "")
                   :value item})))))

(def ads-action-stats-types #{:actions :properties :conversion_values
                              :action_values :canvas_component_avg_pct_view
                              :cost_per_10_sec_video_view :cost_per_action_type :cost_per_unique_action_type
                              :unique_actions :video_10_sec_watched_actions :video_15_sec_watched_actions
                              :video_30_sec_watched_actions :video_avg_pct_watched_actions
                              :video_avg_percent_watched_actions :video_avg_sec_watched_actions
                              :video_avg_time_watched_actions :video_complete_watched_actions
                              :video_p100_watched_actions :video_p25_watched_actions
                              :video_p50_watched_actions :video_p75_watched_actions :cost_per_conversion :cost_per_outbound_click
                              :video_p95_watched_actions :website_ctr :website_purchase_roas :purchase_roas :outbound_clicks :conversions :video_play_actions :video_thruplay_watched_actions})

(def serialized-lists-types #{:issues_info :frequency_control_specs})

(defn extract-breakdown-fields
  "Extracts breakdown fields from a values array entry.
  Breakdown fields are any fields that are not :value or :end_time.
  Returns a map of breakdown field names (as strings) to their values."
  [entry]
  (let [known-keys #{:value :end_time}]
    (into {} (keep (fn [[k v]]
                     (when-not (known-keys k)
                       [(name k) (str v)]))
                   entry))))

(defn flatten-array
  "flattens array of object with same structure prefixing its keys with array-name
  returns list of key-value pairs"
  [array array-name]
  (cond (= array-name :values)
        (mapcat #(let [breakdowns (extract-breakdown-fields %)
                       breakdown-keys (sort (keys breakdowns))
                       key1 (if (seq breakdown-keys) (get breakdowns (first breakdown-keys)) nil)
                       key2 (if (> (count breakdown-keys) 1) (get breakdowns (second breakdown-keys)) nil)
                       breakdown-map (cond-> {}
                                       key1 (assoc :key1 key1)
                                       key2 (assoc :key2 key2))]
                   (flatten-array-value (:value %) (:end_time %) breakdown-map)) array)
        (some? (ads-action-stats-types array-name))
        (map #(assoc % :ads_action_name (name array-name)) array)
        (some? (serialized-lists-types array-name))
        (list (assoc {} array-name (json/write-str array)))
        (and (= array-name :media) (empty? array)) '()
        :else (app-error (str "unsuported array:" array-name array))))

(defn filter-scalars [row]
  (into {} (filter (fn [[k v]]
                     (and (-> v map? not) (-> v sequential? not)))
                   row)))

(defn filter-flatten-objects
  [row]
  (let [simple-objects (filter (fn [[k v]] (and (-> v map?) (-> v nested-object? not))) row)]
    (apply hash-map
           (mapcat (fn [[object-name object]]
                     (mapcat (fn [[k v]]
                               (list (keyword (str (name object-name) "_" (name k))) v))
                             object))
                   simple-objects))))
