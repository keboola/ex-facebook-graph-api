(ns keboola.facebook.api.parser
  (:require   [clojure.spec :as s]
              [keboola.facebook.api.specs :as ds]
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
                (= true (-> val :ret) ))))
(defn nested-object?
  "Returns true if objet is map and contains :data keyword"
  [object]
  (and (map? object) (contains? object :data)))

(s/fdef get-nested-objects
        :args (s/cat :body-data ::ds/data
                     :params ::ds/keboola)
        :ret (s/coll-of map? :into []))
(defn get-nested-objects
  "Traverse body-data array and take out nested-object like structures.
  Return array of objects with keys :name :data :parent-id :parent-type "
  [body-data params]
  (reduce
   (fn [memo, row]
     (if-let [objects (reduce-kv (fn [m k v]
                                   (if (nested-object? v)
                                     (conj m
                                           {:name (name k)
                                            :data v
                                            :parent-id (or (:id row) (:parent-id params))
                                            :parent-type (str (:parent-type params) "_" (name k))
                                            }) m))
                                 [] row)]
       (concat memo objects)
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

(s/fdef flatten-array
        :args (s/cat :array (s/coll-of ::ds/insights))
        :ret (s/* (s/map-of keyword? ::ds/table-value)))
(defn flatten-array
  "flattens array of object with same structure prefixing its keys with array-name
  returns list of key-value pairs"
  [array]
  (mapcat #(flatten-array-value (:value %) (:end_time %)) array))

(s/fdef filter-scalars
        :args (s/cat :row (s/map-of keyword? (s/or :scalar ::ds/table-value
                                                   :object map?
                                                   :seq sequential?)))
        :ret (s/map-of keyword? ::ds/table-value))
(defn filter-scalars [row]
  (into {} (filter (fn [[k v]]
                     (and (-> v map? not) (-> v sequential? not))
                     ) row)))

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
