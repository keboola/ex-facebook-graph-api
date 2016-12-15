(ns keboola.utils.json-to-csv-test
  (:require [keboola.utils.json-to-csv :as sut]
            [keboola.test-utils.core :refer [test-and-check]]
            [clojure.test :refer :all]))

(deftest test-replace-dash
  (is (test-and-check `sut/replace-dash 50)))

(deftest test-prepare-kw-map
  (is (test-and-check `sut/prepare-kw-map 50)))

(deftest test-underscorize
  (is (test-and-check `sut/underscorize 50)))
