(ns keboola.facebook.api.specs
  (:require [clojure.spec :as s]
            [clojure.string :refer [blank?]]
            [clojure.test.check.generators :as gen]))

(defn not-blank? [s]  ((complement blank?) s))
(s/def ::key (s/and string? not-blank?))

(s/def ::table-value (s/or :int int? :string string?))
(s/def ::id (s/and string? (complement blank?)))
(s/def ::parent-type string?)
(s/def ::parent-id ::id)
(s/def ::table-name string?)

(s/def ::keboola (s/keys :req-un [::parent-id ::parent-type ::table-name]))
(s/def ::fb-table-row-core (s/keys :req-un [::id ::keboola]))

(s/def ::fb-scalars (s/every-kv keyword? ::table-value :max-count 5))

(s/def ::fb-table-row
  (s/with-gen
    (s/or ::fb-scalars ::fb-table-row-core)
    #(gen/fmap (partial apply into) (gen/tuple (s/gen ::fb-table-row-core) (s/gen ::fb-scalars)))))

(s/def ::columns (s/every-kv string?
                             (s/coll-of (s/or :string string? :keyword keyword?) :distinct true)))

(s/def parent-types (s/coll-of ::parent-type :kind set? :distinct true))

(s/def ::cnt pos-int?)
