(ns keboola.utils.json-to-csv
  (:require [semantic-csv.core :as csv]
            [clojure.set :refer [rename-keys]]
            [clojure.spec :as s]
            [clojure.string]
            ))
; (mapcat #(conj '(:aa) %) (filter #(.contains (name %) "-") (keys {:a-id 2 :b 2}))) => (:a-id :aa)

(s/fdef replace-dash
        :args (s/cat :kw keyword?)
        :fn #(not (clojure.string/includes? (:ret %) "-"))
        :ret keyword?)
(defn replace-dash [kw]
  (keyword (clojure.string/replace (name kw) #"-" "_")))

(s/fdef prepare-kw-map
        :args (s/cat :m (s/map-of keyword? (s/or :string string? :int int?)))
        :fn (fn [val] (every? #(contains? (:ret val) %)
                       (-> val :args :m keys)))
        :ret (s/map-of keyword? keyword?))
(defn prepare-kw-map [m]
  (apply hash-map (mapcat #(conj '() (replace-dash %) %) (keys m))))

(s/fdef underscorize
        :args (s/cat :coll (s/coll-of
                            (s/map-of keyword? (s/or :string string? :int int?) :max-count 20)
                            :max-count 20))
:fn (fn [val]
              (every? (fn [m] (every? #(or
                                        (not (clojure.string/includes? (str %) "-"))
                                        (clojure.string/includes? (str %) "_"))
                                      (keys m)))
                      (:ret val)))
        :ret (s/coll-of (s/map-of keyword? (s/or :string string? :int int?))))
(defn underscorize [coll]
  (map #(rename-keys % (prepare-kw-map %)) coll))

(defn sort-header [header]
  (let [prefered-columns [:id :account-id :parent-type :parent-id :name :key1 :key2 :value :period :end_time :title]
        used-prefered-columns (filter (set header) prefered-columns)
        other-columns (filter #(not ((set used-prefered-columns) %)) header)]
    (concat used-prefered-columns (sort other-columns))))

(defn write [path header body]
  (csv/spit-csv path {:header (map replace-dash (sort-header header))} (underscorize body)))
