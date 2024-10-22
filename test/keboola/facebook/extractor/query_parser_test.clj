(ns keboola.facebook.extractor.query-parser-test
  (:require [clojure.test :refer :all]
            [keboola.facebook.extractor.query-parser :as sut])
  (:import [java.time LocalDate]
           [java.time.format DateTimeParseException]
           [java.time.format DateTimeFormatter]))


(deftest test-parse-parameters
  (testing "parse-parameters function"
    ;; Test with multiple parameters
    (is (= (sut/parse-parameters "param1=value1&param2=value2")
           {"param1" "value1", "param2" "value2"}))
    (is (= (sut/parse-parameters "time_ranges=value1&date_preset=last_3d")
           {"time_ranges" "value1", "date_preset" "last_3d"}))
    ;; ;; Test with a single parameter
    (is (= (sut/parse-parameters "param1=value1")
           {"param1" "value1"}))
    ;; ;; Test with empty string
    (is (= {}
           (sut/parse-parameters "")))
    ;; Test with parameter without value
    (is (= (sut/parse-parameters "param1=&param2=value2")
           {"param1" "", "param2" "value2"}))
    ;; Test with duplicate parameter names
    (is (= (sut/parse-parameters "param1=value1&param1=value2")
           {"param1" "value2"}))  ;; The last value should overwrite
    ;; Test with value containing equal sign
    (is (= (sut/parse-parameters "param1=value1=value2")
           {"param1" "value1=value2"}))
    ;; Test with parameter without equal sign
    (is (= (sut/parse-parameters "param1")
           {"param1" nil}))
    ;; Test with parameters having empty keys or values
    (is (= (sut/parse-parameters "=value1&param2=")
           {"" "value1", "param2" ""}))))


(deftest test-parse-time-ranges
  (testing "parse-time-ranges function"
    ;; Test with single time range
    (is (= [{:since "2024-08-10", :until "2024-08-13"}]
           (sut/parse-time-ranges "[{'since':'2024-08-10','until':'2024-08-13'}]")))
    ;; Test with multiple time ranges
    (is (= [{:since "2024-08-10", :until "2024-08-10"}
            {:since "2024-08-11", :until "2024-08-11"}
            {:since "2024-08-12", :until "2024-08-12"}
            {:since "2024-08-13", :until "2024-08-13"}]
           (sut/parse-time-ranges "[{'since':'2024-08-10','until':'2024-08-10'},{'since':'2024-08-11','until':'2024-08-11'},{'since':'2024-08-12','until':'2024-08-12'},{'since':'2024-08-13','until':'2024-08-13'}]")))
    ;; Test with empty string
    (is (= []
           (sut/parse-time-ranges "")))
    ;; Test with invalid JSON (should throw an exception)
    (is (thrown? Exception
                 (sut/parse-time-ranges "[{'since':'2024-08-10','until':'2024-08-13'")))
    ;; Test with nil input (should return nil)
    (is (= []
           (sut/parse-time-ranges nil)))))



(deftest test-date-range
  (testing "date-range function"
    ;; Test with start and end dates being the same
    (is (= [(LocalDate/parse "2024-08-10")]
           (sut/date-range "2024-08-10" "2024-08-10")))
    ;; Test with start date before end date
    (is (= [(LocalDate/parse "2024-08-10")
            (LocalDate/parse "2024-08-11")
            (LocalDate/parse "2024-08-12")]
           (sut/date-range "2024-08-10" "2024-08-13")))
    ;; Test with start date after end date (should return an empty sequence)
    (is (= []
           (sut/date-range "2024-08-13" "2024-08-10")))
    ;; Test with invalid date format (should throw an exception)
    (is (thrown? DateTimeParseException
                 (sut/date-range "2024/08/10" "2024/08-13")))
    ;; Test with nil inputs (should throw an exception)
    (is (thrown? NullPointerException
                 (sut/date-range nil "2024-08-13")))
    (is (thrown? NullPointerException
                 (sut/date-range "2024-08-10" nil)))
    ;; Test with large date range
    (is (= (map #(LocalDate/parse %)
                ["2024-01-01" "2024-01-02" "2024-01-03" "2024-01-04"])
           (sut/date-range "2024-01-01" "2024-01-05")))))

(deftest test-expand-time-ranges
  (testing "expand-time-ranges function"
    ;; Test with a single time range
    (let [input [{:since "2024-08-10" :until "2024-08-13"}]
          expected [{:since "2024-08-10" :until "2024-08-10"}
                    {:since "2024-08-11" :until "2024-08-11"}
                    {:since "2024-08-12" :until "2024-08-12"}]]
      (is (= expected (sut/expand-time-ranges input))))
    ;; Test with multiple time ranges
    (let [input [{:since "2024-08-10" :until "2024-08-11"}
                 {:since "2024-08-13" :until "2024-08-14"}]
          expected [{:since "2024-08-10" :until "2024-08-10"}
                    {:since "2024-08-13" :until "2024-08-13"}]]
      (is (= expected (sut/expand-time-ranges input))))
    ;; Test with start date equal to end date
    (let [input [{:since "2024-08-10" :until "2024-08-10"}]
          expected [{:since "2024-08-10" :until "2024-08-10"}]]
      (is (= expected (sut/expand-time-ranges input))))
    ;; Test with start date after end date (should return empty list)
    (let [input [{:since "2024-08-13" :until "2024-08-10"}]
          expected []]
      (is (= expected (sut/expand-time-ranges input))))
    ;; Test with empty input
    (let [input []
          expected []]
      (is (= expected (sut/expand-time-ranges input))))))


(deftest test-generate-parameters-for-dates
  (testing "generate-parameters-for-dates function with single quotes"
    ;; Test with basic parameters and time-range
    (let [parameters-map {"time_increment" "1"
                          "breakdowns" "product_id"
                          "date_preset" "last_7d"}
          time-range {:since "2024-08-10" :until "2024-08-10"}
          expected "time_increment=1&breakdowns=product_id&time_ranges=[{'since':'2024-08-10','until':'2024-08-10'}]"]
      (is (= expected (sut/generate-parameters-for-dates parameters-map time-range))))

    ;; Test with parameters containing existing time_ranges (should replace time_ranges)
    (let [parameters-map {"time_increment" "1"
                          "breakdowns" "product_id"
                          "time_ranges" "[{'since':'2024-08-10','until':'2024-08-13'}]"}
          time-range {:since "2024-08-10" :until "2024-08-13"}
          expected "time_increment=1&breakdowns=product_id&time_ranges=[{'since':'2024-08-10','until':'2024-08-13'}]"]
      (is (= expected (sut/generate-parameters-for-dates parameters-map time-range))))

    ;; Test with parameters without date_preset
    (let [parameters-map {"time_increment" "1"
                          "breakdowns" "product_id"}
          time-range {:since "2024-08-10" :until "2024-08-10"}
          expected "time_increment=1&breakdowns=product_id&time_ranges=[{'since':'2024-08-10','until':'2024-08-10'}]"]
      (is (= expected (sut/generate-parameters-for-dates parameters-map time-range))))

    ;; Test with parameters containing date_preset and other parameters
    (let [parameters-map {"time_increment" "1"
                          "breakdowns" "product_id"
                          "date_preset" "last_3d"
                          "level" "ad"}
          time-range {:since "2024-08-10" :until "2024-08-12"}
          expected "time_increment=1&breakdowns=product_id&level=ad&time_ranges=[{'since':'2024-08-10','until':'2024-08-12'}]"]
      (is (= expected (sut/generate-parameters-for-dates parameters-map time-range))))

    ;; Test with empty parameters-map
    (let [parameters-map {}
          time-range {:since "2024-08-10" :until "2024-08-10"}
          expected "time_ranges=[{'since':'2024-08-10','until':'2024-08-10'}]"]
      (is (= expected (sut/generate-parameters-for-dates parameters-map time-range))))))


(deftest test-date-preset-to-days
  (testing "date-preset-to-days function"
    ;; Test with known date_preset values
    (is (= 3 (sut/date-preset-to-days "last_3d")))
    (is (= 7 (sut/date-preset-to-days "last_7d")))
    (is (= 30 (sut/date-preset-to-days "last_30d")))
    ;; Test with unknown date_preset value
    (is (= nil (sut/date-preset-to-days "last_5d")))
    ;; Test with nil input
    (is (= nil (sut/date-preset-to-days nil)))
    ;; Test with empty string
    (is (= nil (sut/date-preset-to-days "")))))


(deftest test-get-past-date
  (testing "get-past-date function with reference-date parameter"
    (let [formatter (DateTimeFormatter/ofPattern "yyyy-MM-dd")
          reference-date (LocalDate/of 2024 10 22)] ; Fixed reference date: 2024-10-22
      ;; Test with 0 days ago (should return the reference date)
      (is (= "2024-10-22" (sut/get-past-date 0 reference-date)))
      ;; Test with 1 day ago
      (is (= "2024-10-21" (sut/get-past-date 1 reference-date)))
      ;; Test with 7 days ago
      (is (= "2024-10-15" (sut/get-past-date 7 reference-date)))
      ;; Test with 3 days ago
      (is (= "2024-10-19" (sut/get-past-date 3 reference-date)))
      ;; Test with negative days (future date)
      (is (= "2024-10-25" (sut/get-past-date -3 reference-date)))
      ;; Test with large number of days
      (is (= "2023-10-22" (sut/get-past-date 366 reference-date))))

    (testing "get-past-date function without reference-date (uses LocalDate/now)"
      ;; Since LocalDate/now is used, this test is date-sensitive.
      ;; We'll test that the function returns the same date as calculated here.
      (let [days 5
            formatter (DateTimeFormatter/ofPattern "yyyy-MM-dd")
            expected-date (.format (.minusDays (LocalDate/now) days) formatter)]
        (is (= expected-date (sut/get-past-date days)))))))