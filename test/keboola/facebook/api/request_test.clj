(ns keboola.facebook.api.request-test
  (:require [keboola.facebook.api.request :as sut]
            [keboola.test-utils.core :refer [test-and-check]]
            [clojure.spec :as s]
            [slingshot.slingshot :refer [try+ throw+]]
            [clojure.test :as t :refer :all])
  (:use clj-http.fake))

(deftest test-make-url
  (is (test-and-check `sut/make-url 10)))

(def unknown-error-response
  {:request-time 30136, :repeatable? false, :protocol-version {:name "HTTP", :major 1, :minor 1}, :streaming? true, :chunked? false, :reason-phrase "Internal Server Error", :headers {}, :orig-content-encoding nil, :status 500, :length 77, :body "{\"error\":{\"code\":1,\"message\":\"An unknown error occurred\",\"error_subcode\":99}}", :trace-redirects ["https://graph.facebook.com/v2.8/adsblablabla"]})

(def success-response
  {:request-time 30, :repeatable? false, :protocol-version {:name "HTTP", :major 1, :minor 1}, :streaming? true, :chunked? false, :headers {}, :orig-content-encoding nil, :status 200, :length 77, :body "{}", :trace-redirects ["https://graph.facebook.com/v2.8/adsblablabla"]}
  )

(def error-count (atom 0))
(defn set-error-count [new-count] (reset! error-count new-count))
(defn dec-error-count [] (set-error-count (dec @error-count)))

(def apimocks
  {
   "https://graph.facebook.com/v2.8/always_unknown_error_fail"
   (fn [req]
     unknown-error-response)
   "https://graph.facebook.com/v2.8/fail_on_error_count_and_decrement"
   (fn [req]
     (if (= @error-count 0)
       success-response
       (do
         (dec-error-count)
         unknown-error-response)))
   })

(deftest make-paging-fn-test
  (let [call-url-fn (sut/make-paging-fn "")]
    (with-global-fake-routes-in-isolation
      apimocks
      (call-url-fn "https://graph.facebook.com/v2.8/always_unknown_error_fail")
      )))
