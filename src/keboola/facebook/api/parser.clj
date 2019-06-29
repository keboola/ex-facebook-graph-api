(ns keboola.facebook.api.parser
  (:require   [clojure.spec.alpha :as s]
              [keboola.facebook.api.specs :as ds]
              [keboola.docker.runtime :refer [app-error]]
              [clj-time.core :as t]
              [clj-time.format :refer [formatter unparse]]
              [clojure.string :as string]))

(defn relative-days-timestamp [days]
  (unparse (formatter "YYYY-MM-dd") (t/plus (t/now) (t/days (Integer/parseInt days)))))

(defn preparse-fields [fields-str]
  (string/replace fields-str #"%%days:-?\d+%%"
                  #(relative-days-timestamp (re-find #"-?\d+" %))))

(s/fdef nested-object?
        :args (s/cat :object (s/or :nested (s/keys :req-un [::ds/data])
                                   :simple ::ds/fb-object))
        :ret boolean?
        :fn (fn [val]
              (if (= :simple (-> val :args :object first))
                (= false (-> val :ret))
                (= true (-> val :ret)))))
(defn nested-object?
  "Returns true if objet is map and contains :data keyword"
  [object]
  (and (map? object) (contains? object :data)))

(defn extract-summary [object-name object row params]
  (if (contains? object :summary)
    {
     :name "summary"
     :data {:data [(:summary object)]}
     :parent-id (or (:id row) (:parent-id params))
     :fb-graph-node (str (:fb-graph-node params) "_" object-name)}))



(s/fdef get-nested-objects
        :args (s/cat :body-data ::ds/data
                     :params ::ds/keboola)
        :ret (s/coll-of map? :into []))
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

(s/fdef flatten-value-object
        :args (s/cat :key1 string?
                     :object-value (s/or :scalar ::ds/table-value :object ::ds/simple-object))
        :ret (s/* ::ds/key1-key2-value))

(defn flatten-value-object
  "flattens object values and prepends and prepend key1"
  [key1 object-value]
  (cond
    (map? object-value) (map (fn [[key2 val]] {:key1 key1 :key2 (name key2) :value val})
                             object-value)
    :else (list {:key1 key1 :key2 "" :value object-value})))

(s/fdef flatten-array-value
        :args (s/cat :item (s/or :scalar ::ds/table-value :object ::ds/complex-object)
                     :end_time ::ds/end_time)
        :ret (s/* (s/merge (s/keys :req-un [::ds/end_time]) ::ds/key1-key2-value)))

(defn flatten-array-value [item end_time]
  (map
   #(assoc % :end_time end_time)
   (cond
     (map? item) (mapcat (fn [[key1 val]] (flatten-value-object (name key1) val)) item)
     :else (list {:key1 "" :key2 "" :value item}))))

(def ads-action-stats-types #{:actions :properties
                              :action_values :canvas_component_avg_pct_view
                              :cost_per_10_sec_video_view :cost_per_action_type :cost_per_unique_action_type
                              :unique_actions :video_10_sec_watched_actions :video_15_sec_watched_actions
                              :video_30_sec_watched_actions :video_avg_pct_watched_actions
                              :video_avg_percent_watched_actions :video_avg_sec_watched_actions
                              :video_avg_time_watched_actions :video_complete_watched_actions
                              :video_p100_watched_actions :video_p25_watched_actions
                              :video_p50_watched_actions :video_p75_watched_actions
                              :video_p95_watched_actions :website_ctr :website_purchase_roas :outbound_clicks :conversions})
#_(s/fdef flatten-array
        :args (s/cat :array (s/coll-of ::ds/insights) :array-name (s/or :val :values))
        :ret (s/* (s/map-of keyword? ::ds/table-value)))
(defn flatten-array
  "flattens array of object with same structure prefixing its keys with array-name
  returns list of key-value pairs"
  [array array-name]
  (cond (= array-name :values)
        (mapcat #(flatten-array-value (:value %) (:end_time %)) array)
        (some? (ads-action-stats-types array-name))
        (map #(assoc % :ads_action_name (name array-name)) array)
        (and (= array-name :media) (empty? array)) '()
        :else (app-error (str "unsuported array:" array-name array))))

(s/fdef filter-scalars
        :args (s/cat :row (s/map-of keyword? (s/or :scalar ::ds/table-value
                                                   :object map?
                                                   :seq sequential?)))
        :ret (s/map-of keyword? ::ds/table-value))
(defn filter-scalars [row]
  (into {} (filter (fn [[k v]]
                     (and (-> v map? not) (-> v sequential? not)))
                   row)))

(s/fdef filter-flatten-objects
        :args (s/cat :row ::ds/complex-object)
        :ret (s/map-of keyword? ::ds/table-value))
(defn filter-flatten-objects
  [row]
  (let [simple-objects (filter (fn [[k v]] (and (-> v map?) (-> v nested-object? not))) row)]
    (apply hash-map
           (mapcat (fn [[object-name object]]
                     (mapcat (fn [[k v]]
                               (list (keyword (str (name object-name) "_" (name k))) v))
                             object))
                   simple-objects))))
