(ns keboola.facebook.insights-extractor.output-test
  (:require [clojure.test :refer :all]
            [keboola.facebook.extractor.output :as sut]))

(defn test-pk [value expected]
  (let [complete-expected (conj expected "parent_id")]
    (is (= (count value) (count complete-expected)))
    (is (= (set value) (set complete-expected)))))

(deftest test-primary-key
  (test-pk (sut/get-primary-key ["id"] "") [])
  (test-pk (sut/get-primary-key [:id] "") ["id"])
  (test-pk (sut/get-primary-key ["foo"] "") [])
  (test-pk (sut/get-primary-key [:foo] "") [])
  (test-pk (sut/get-primary-key [:id :key] "") ["id"])
  (test-pk (sut/get-primary-key [:id :key1 :foo :key2] "insights") ["id" "key1" "key2"])
  (test-pk (sut/get-primary-key [:id :placement :device_platform :foo :key2 :age] "insights") ["id" "placement" "key2" "age" "device_platform"])
  (test-pk (sut/get-primary-key [:id :placement :foo :key2 :age :region :country :gender] "asdasfoo") ["id" "key2"])
  (test-pk (sut/get-primary-key [:id :key1 :foo :key2] "") ["id" "key1" "key2"]))
    
