(ns keboola.facebook.extractor.output-test
  (:require [clojure.test :refer :all]
            [keboola.facebook.extractor.output :as sut]))

(defn test-pk [value expected]
  (let [complete-expected (conj expected "parent_id")]
    (is (= (count value) (count complete-expected)))
    (is (= (set value) (set complete-expected)))))

(deftest test-primary-key
  (test-pk (sut/get-primary-key ["id"] "" {} false) [])
  (test-pk (sut/get-primary-key [:id] "" {} false) ["id"])
  (test-pk (sut/get-primary-key ["foo"] "" {} false) [])
  (test-pk (sut/get-primary-key [:foo] "" {} false) [])
  (test-pk (sut/get-primary-key [:id :key] "" {} false) ["id"])
  (test-pk (sut/get-primary-key [:id :key1 :foo :key2] "insights" {} false) ["id" "key1" "key2"])
  (test-pk (sut/get-primary-key [:id :placement :device_platform :foo :key2 :age :ad_id :adset_id] "insights" {} false) ["id" "placement" "key2" "age" "device_platform"])
  (test-pk (sut/get-primary-key [:id :placement :device_platform :foo :key2 :age :ad_id :adset_id :date_start :date_stop] "insights" {} true) ["id" "placement" "key2" "age" "device_platform" "date_stop" "date_start" "ad_id" "adset_id"])
  (test-pk (sut/get-primary-key [:id :placement :foo :key2 :age :region :country :gender] "asdasfoo" {} false) ["id" "key2"])
  (test-pk (sut/get-primary-key [:id :key1 :foo :key2] "" {} false) ["id" "key1" "key2"])
  (test-pk (sut/get-primary-key [:id :key1 :foo :key2] "" {:path ""} false) ["id" "key1" "key2"])
  (test-pk (sut/get-primary-key [:id :key1 :foo :key2 :ad_id] "" {:path ""} false) ["id" "key1" "key2" "ad_id"])
  (test-pk (sut/get-primary-key [:id :key1 :foo :key2 :ad_id :adset_id] "" {:path ""} false) ["id" "key1" "key2" "ad_id"])
  (test-pk (sut/get-primary-key [:id :key1 :foo :key2 :adset_id] "" {:path ""} false) ["id" "key1" "key2" "adset_id"])
  (test-pk (sut/get-primary-key [:id :key1 :foo :key2 :ad_id] "" {:path "ads"} false) ["id" "key1" "key2"])
  (test-pk (sut/get-primary-key [:id :key1 :foo :key2 :reviewer_id] "ratings" {} false) ["id" "key1" "key2" "reviewer_id"]))
