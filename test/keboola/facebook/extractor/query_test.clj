(ns keboola.facebook.extractor.query-test
  (:require [keboola.facebook.extractor.query :as sut]
            [keboola.facebook.extractor.query-parser :as query-parser]
            [keboola.test-utils.core :as test-utils]
            [clojure.java.io :as io]
            [keboola.facebook.api.request-test :refer [media-posted-before-error-response]]
            [clojure.test :refer :all])
  (:use clj-http.fake)
  (:import [java.time LocalDate]
           [java.time.format DateTimeFormatter]))

(def ^:dynamic *tmpdir* "")

(defn setup-tmpdir [f]
  (binding [*tmpdir* (test-utils/mk-tmp-dir! "exfbtestquery")]
    (f)
    (test-utils/recursive-delete *tmpdir*)))

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

(deftest test-query-path-feed?
  (is (not (sut/query-path-feed? {})))
  (is (not (sut/query-path-feed? {:path "ratings" :fields "feed"})))
  (is (sut/query-path-feed? {:path "feed" :fields "insights"}))
  (is (sut/query-path-feed? {:path "me/feed" :fields "insights"})))

(deftest test-query-path-posts?
  (is (not (sut/query-path-posts? {})))
  (is (not (sut/query-path-posts? {:path "ratings" :fields "feed"})))
  (is (not (sut/query-path-posts? {:path "feed" :fields "insights"})))
  (is (sut/query-path-posts? {:path "posts" :fields "insights"}))
  (is (sut/query-path-posts? {:path "me/posts" :fields "insights"}))
  (is (sut/query-path-posts? {:path "me/published_posts" :fields "insights"}))
  (is (sut/query-path-posts? {:path "published_posts" :fields "insights"})))

(deftest test-query-need-userinfo?
  (is (not (sut/query-need-userinfo? {})))
  (is (not (sut/query-need-userinfo? {:path "ratings" :fields "feed"})))
  (is (sut/query-need-userinfo? {:path "likes" :fields "insights"}))
  (is (sut/query-need-userinfo? {:path "" :fields "likes"}))
  (is (sut/query-need-userinfo? {:path "me/feed" :fields "from"})))

(defn empty-dir? [path]
  (let [file (io/file path)]
    (assert (.exists file))
    (assert (.isDirectory file))
    (-> file .list empty?)))

(deftest test-media-posted-before-error-response-query
  (let [query {:name "mediatest" :version "v2.11" :query {:path "media" :ids "123" :fields "fields" :since "now" :until "now"}}
        token "token"
        out-dir *tmpdir*]
    (println *tmpdir*)
    (with-global-fake-routes-in-isolation
      {"https://graph.facebook.com/v2.11/media?path=media&ids=123&fields=fields&since=now&until=now&access_token=token"
       (fn [req]
         media-posted-before-error-response)}
      (sut/run-nested-query token out-dir query)
      (is (empty-dir? *tmpdir*)))))

(use-fixtures :once setup-tmpdir)



(deftest test-make-run-insights-query-with-time-range
  (testing "date_preset=last_3d"
    ;; Placeholder values for unimportant parameters
    (let [token "token"
          id "id"
          version "version"
          query {}
          ;; Parameters string as per your example
          parameters-str "time_increment=1&breakdowns=product_id&date_preset=last_3d"
          ;; Atom to capture calls to the mock function
          async-insights-request-calls (atom [])
          ;; Mock function to capture calls and parameters
          mock-async-insights-request-fn (fn [token id new-parameters version query]
                                           (swap! async-insights-request-calls conj
                                                  {:token token
                                                   :id id
                                                   :parameters new-parameters
                                                   :version version
                                                   :query query})
                                           ;; Return a mock result
                                           [{:data "mock-result"}])]

      ;; Call the function under test
      (let [results (sut/make-run-inishgts-query-with-time-range
                     mock-async-insights-request-fn
                     token
                     id
                     parameters-str
                     version
                     query)
            ;; Capture the calls made to the mock function
            calls @async-insights-request-calls
            num-calls (count calls)
            ;; Compute expected dates based on current date
            date-preset "last_3d"
            days (query-parser/date-preset-to-days date-preset) ;; Should be 3 for "last_3d"
            formatter (DateTimeFormatter/ofPattern "yyyy-MM-dd")
            today (LocalDate/now)
            start-date (query-parser/get-past-date days)
            ;; Generate dates including today
            dates (map #(.format % formatter)
                       (query-parser/date-range start-date (.format  today formatter)))
            expected-time-ranges (map (fn [date]
                                        {:since date
                                         :until date})
                                      dates)]

        ;; Verify the number of calls made matches expected number of dates
        (is (= num-calls (count expected-time-ranges))
            (str "Expected " (count expected-time-ranges) " calls to async-insights-request-fn, but got " num-calls))

        ;; Parse the parameters once for use in generating expected parameters
        (let [parameters-map (query-parser/parse-parameters parameters-str)]

          ;; Verify each call was made with the correct parameters
          (doseq [[call expected-time-range] (map vector calls expected-time-ranges)]
            (let [expected-parameters (query-parser/generate-parameters-for-dates parameters-map expected-time-range)]
              (is (= (:parameters call) expected-parameters)
                  (str "Expected parameters: " expected-parameters ", but got: " (:parameters call))))))

        ;; Optionally, verify that results contain the expected data
        (is (= results (apply concat (repeat num-calls [{:data "mock-result"}])))
            "Expected results to contain the mock data repeated for each call"))))
  (testing "time_ranges=[{'since':'2024-08-10','until':'2024-08-12'}]"
    ;; Placeholder values for unimportant parameters
    (let [token "token"
          id "id"
          version "version"
          query {}
          ;; Parameters string as per your example
          parameters-str "time_increment=1&breakdowns=product_id&time_ranges=[{'since':'2024-08-10','until':'2024-08-12'}]"
          ;; Atom to capture calls to the mock function
          async-insights-request-calls (atom [])
          ;; Mock function to capture calls and parameters
          mock-async-insights-request-fn (fn [token id new-parameters version query]
                                           (swap! async-insights-request-calls conj
                                                  {:token token
                                                   :id id
                                                   :parameters new-parameters
                                                   :version version
                                                   :query query})
                                           ;; Return a mock result
                                           [{:data "mock-result"}])]

      ;; Call the function under test
      (let [results (sut/make-run-inishgts-query-with-time-range
                     mock-async-insights-request-fn
                     token
                     id
                     parameters-str
                     version
                     query)
            ;; Capture the calls made to the mock function
            calls @async-insights-request-calls
            num-calls (count calls)
            ;; Compute expected dates based on current date
            time-ranges-str "[{'since':'2024-08-10','until':'2024-08-12'}]"
            time-ranges (query-parser/parse-time-ranges time-ranges-str)
            expected-time-ranges (query-parser/expand-time-ranges time-ranges)]

        ;; Verify the number of calls made matches expected number of dates
        (is (= num-calls (count expected-time-ranges))
            (str "Expected " (count expected-time-ranges) " calls to async-insights-request-fn, but got " num-calls))

        ;; Parse the parameters once for use in generating expected parameters
        (let [parameters-map (query-parser/parse-parameters parameters-str)]

          ;; Verify each call was made with the correct parameters
          (doseq [[call expected-time-range] (map vector calls expected-time-ranges)]
            (let [expected-parameters (query-parser/generate-parameters-for-dates parameters-map expected-time-range)]
              (is (= (:parameters call) expected-parameters)
                  (str "Expected parameters: " expected-parameters ", but got: " (:parameters call))))))

        ;; Optionally, verify that results contain the expected data
        (is (= results (apply concat (repeat num-calls [{:data "mock-result"}])))
            "Expected results to contain the mock data repeated for each call")))))