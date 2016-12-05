(ns keboola.facebook.api.parser-test
  (:require [keboola.facebook.api.parser :as sut]
            [clojure.test :refer :all]
            [clojure.test.check :as tc]
            [clojure.test.check.clojure-test :refer [defspec]]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]
            [clojure.string :refer [blank?]]
            [clojure.spec :as s]
            [clojure.spec.test :as stest]
            ))

(def non-empty-string-gen (gen/not-empty gen/string))
(def table-value-gen (gen/one-of [gen/int non-empty-string-gen gen/boolean]))

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

(s/fdef sut/unfold-nested-sequence
        :args (s/cat
               :data (s/coll-of (s/coll-of ::fb-table-row :max-count 5) :min-count 1 :max-count 5))
        :ret (s/coll-of ::fb-table-row))

(defn test-and-check
  ([spec-test] (test-and-check spec-test 1000))
  ([spec-test num-tests]
   (let [result (->> (stest/check spec-test {:clojure.spec.test.check/opts {:num-tests num-tests}}) stest/summarize-results)]
     (= (:total result) (:check-passed result)))))

(deftest test-unfold-nested-sequence
  (is (test-and-check `sut/unfold-nested-sequence 20))  )



#_(defspec test-unfold-nested-sequence 4
  (prop/for-all [coll table-data-gen]
                (let [test-value (sut/unfold-nested-sequence coll)]
                  (and
                     (not (reduced? test-value))
                     (every? map? test-value)))))
(defn foo-test [x]  x)
(s/fdef foo-test :args (s/cat :x some?) :ret some?)
