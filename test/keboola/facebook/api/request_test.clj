(ns keboola.facebook.api.request-test
  (:require [keboola.facebook.api.request :as sut]
            [keboola.test-utils.core :refer [test-and-check]]
            [clojure.spec :as s]
            [clojure.test :as t :refer :all]))

(deftest test-make-url
  (is (test-and-check `sut/make-url 10)))
