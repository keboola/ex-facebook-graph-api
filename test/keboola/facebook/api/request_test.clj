(ns keboola.facebook.api.request-test
  (:require [keboola.facebook.api.request :as sut]
            [keboola.test-utils.core :refer [test-and-check]]
            [clojure.spec :as s]
            [clojure.test :as t :refer :all]))

(deftest test-make-url
  (is (test-and-check `sut/make-url 10)))

(deftest test-nested-object?
  (is (test-and-check `sut/nested-object? 10))  )

(deftest test-get-nested-object
  (is (test-and-check `sut/get-nested-objects 10)))

(deftest test-flatten-object
  (is (test-and-check `sut/flatten-object 20)))

(deftest test-flatten-array
  (is (test-and-check `sut/flatten-array 20))
  )

(deftest test-filter-values
  (is (test-and-check `sut/filter-values 2)))
