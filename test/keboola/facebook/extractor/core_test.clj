(ns keboola.facebook.extractor.core-test
  (:require [keboola.facebook.extractor.core :as sut]
            [clojure.test :refer :all]
            [slingshot.slingshot :refer [throw+]]))
(deftest test-treat-exception
  (with-redefs [keboola.docker.runtime/app-error (fn [_] "app error")]
    (is (= "app error" (sut/treat #(throw "aaa"))))
    (is (= "app error" (sut/treat #(throw+ "aaa"))))
    (is (= "app error" (sut/treat #(throw+ {:a "aaa"}))))))
