(ns keboola.http.client-test
  (:require [keboola.http.client :as sut]
            [clojure.test :refer :all]))

(deftest test-retry-handler
  (is (sut/retry-handler nil 1 nil))
  (is (not (sut/retry-handler nil 4 nil))))
