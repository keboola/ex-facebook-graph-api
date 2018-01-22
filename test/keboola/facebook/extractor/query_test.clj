(ns keboola.facebook.extractor.query-test
  (:require [keboola.facebook.extractor.query :as sut]
            [clojure.test :refer :all]))

(deftest test-query-contains-insights?
  (is (not (sut/query-contains-insights? {})))
  (is (not (sut/query-contains-insights? {:fields "asasd"})))
  (is (not (sut/query-contains-insights? {:fields "asasd" :path "asdfff"})))
  (is (not (sut/query-contains-insights? {:fields "" :path nil})))
  (is (not (sut/query-contains-insights? {:fields nil :path nil})))
  (is (not (sut/query-contains-insights? {:fields nil :path ""})))
  (is (sut/query-contains-insights? {:fields nil :path "insights"}))
  (is (sut/query-contains-insights? {:fields "asdasdasd,insights" :path "insights"}))
  (is (sut/query-contains-insights? {:fields "asdasdasd,insights" :path "feed"}))
  (is (sut/query-contains-insights? {:fields "asdasdasd,insights" :path nil}))
  (is (sut/query-contains-insights? {:fields nil :path "insights"})))
