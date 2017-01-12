(ns keboola.facebook.api.parser-test
  (:require [keboola.facebook.api.parser :as sut]
            [clojure.test :refer :all]
            [clojure.spec :as s]
            [keboola.test-utils.core :refer [test-and-check]]
            [clojure.test.check.clojure-test :refer [defspec]]
            [clojure.test.check.properties :as prop]))

(deftest test-nested-object?
  (is (test-and-check `sut/nested-object? 10))  )

(deftest test-get-nested-object
  (is (test-and-check `sut/get-nested-objects 10)))

(deftest test-flatten-value-object
  (is (test-and-check `sut/flatten-value-object 20)))

(deftest test-flatten-array-value
  (is (test-and-check `sut/flatten-array-value 20)))

(deftest test-filter-scalars
  (is (test-and-check `sut/filter-scalars 20)))

(deftest test-filter-flatten-objects
  (is (test-and-check `sut/filter-flatten-objects 20)))

#_(deftest test-flatten-array
  (is (test-and-check `sut/flatten-array 10)))

#_(defspec test-unfold-nested-sequence 4
  (prop/for-all [coll table-data-gen]
                (let [test-value (sut/unfold-nested-sequence coll)]
                  (and
                     (not (reduced? test-value))
                     (every? map? test-value)))))

#_(defn foo-test [x]  x)
#_(s/fdef foo-test :args (s/cat :x some?) :ret some?)
