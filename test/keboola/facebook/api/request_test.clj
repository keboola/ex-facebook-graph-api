(ns keboola.facebook.api.request-test
  (:require [keboola.facebook.api.request :as sut]
            [keboola.test-utils.core :refer [test-and-check]]
            [clojure.spec.alpha :as s]
            [slingshot.slingshot :refer [try+ throw+]]
            [clojure.test :as t :refer :all])
  (:use clj-http.fake))

(deftest test-make-url
  (is (test-and-check `sut/make-url 10)))

(deftest test-update-url-with-limit
  (let [testfn sut/update-url-with-limit
        stemurl "https://graphapi.com"
        params "?token=aa&ff=ss"
        paramswithlimit (str params "&limit=1&ccc=dd")
        multilimitparams (str paramswithlimit "&limit=2")]
    (is (= (testfn stemurl "25") (str stemurl "?limit=25")))
    (is (= (testfn stemurl 25) (str stemurl "?limit=25")))
    (is (= (testfn (str stemurl params) "25") (str stemurl params "&limit=25")))
    (is (= (testfn (str stemurl paramswithlimit) "25") (str stemurl params "&limit=25&ccc=dd")))
    (is (= (testfn (str stemurl multilimitparams) "25") (str stemurl paramswithlimit "&limit=25")))))


(def reduce-data-response
  {:request-time 21463, :repeatable? false, :protocol-version {:name "HTTP", :major 1, :minor 1}, :streaming? true, :chunked? false, :reason-phrase "Internal Server Error", :headers {}, :orig-content-encoding nil, :status 500, :length 108, :body "{\"error\":{\"code\":1,\"message\":\"Please reduce the amount of data you're asking for, then retry your request\"}}"})

(def error-400-response
  {:request-time 21463, :repeatable? false, :protocol-version {:name "HTTP", :major 1, :minor 1}, :streaming? true, :chunked? false, :reason-phrase "Internal Server Error", :headers {}, :orig-content-encoding nil, :status 400, :length 108, :body "{\"error\":{\"code\":1,\"message\":\"There cannot be more than 93 days (8035200 s) between since and until\"}}"})

(def unknown-error-response
  {:request-time 30136, :repeatable? false, :protocol-version {:name "HTTP", :major 1, :minor 1}, :streaming? true, :chunked? false, :reason-phrase "Internal Server Error", :headers {}, :orig-content-encoding nil, :status 500, :length 77, :body "{\"error\":{\"code\":1,\"message\":\"An unknown error occurred\",\"error_subcode\":99}}", :trace-redirects ["https://graph.facebook.com/v2.8/adsblablabla"]})

(def unexpected-error-response
  {:request-time 30136, :repeatable? false, :protocol-version {:name "HTTP", :major 1, :minor 1}, :streaming? true, :chunked? false, :reason-phrase "Internal Server Error", :headers {}, :orig-content-encoding nil, :status 500, :length 77, :body "{\"error\":{\"code\":2,\"message\":\"An unexpected error has occurred. Please retry your request later.\",\"is_transient\":true}}", :trace-redirects ["https://graph.facebook.com/v2.8/adsblablabla"]})

(def success-response
  {:request-time 30, :repeatable? false, :protocol-version {:name "HTTP", :major 1, :minor 1}, :streaming? true, :chunked? false, :headers {}, :orig-content-encoding nil, :status 200, :length 77, :body "{}", :trace-redirects ["https://graph.facebook.com/v2.8/adsblablabla"]})

(def media-posted-before-error-response
  {:request-time 30, :repeatable? false, :protocol-version {:name "HTTP", :major 1, :minor 1}, :streaming? true, :chunked? false, :headers {}, :orig-content-encoding nil, :status 400, :length 77, :body "{\"error\":{\"message\":\"Invalid parameter\",\"type\":\"OAuthException\",\"code\":100,\"error_data\":{\"blame_field_specs\":[[\"\"]]},\"error_subcode\":2108006,\"is_transient\":false,\"error_user_title\":\"Media Posted Before Business Account Conversion\",\"error_user_msg\":\"The media was posted before the most recent time that the user's account was converted to a business account from a personal account.\",\"fbtrace_id\":\"BYNS8WYLLD3\"}}"})

(def error-count (atom 0))
(defn set-error-count [new-count] (reset! error-count new-count))
(defn dec-error-count [] (set-error-count (dec @error-count)))



(def apimocks-templates
  {
   "https://graph.facebook.com/v2.8/always_media_error?token=asd"
   (fn [req]
     media-posted-before-error-response)
   "https://graph.facebook.com/v2.8/always_400?token=aa"
   (fn [req]
     error-400-response)
   "https://graph.facebook.com/v2.8/always_200?token=aa"
   (fn [req]
     success-response)
   "https://graph.facebook.com/v2.8/always_unknown_error_fail?token=aa"
   (fn [req]
     unknown-error-response)
   "https://graph.facebook.com/v2.8/fail_on_error_count_and_decrement?token=aa"
   (fn [req]
     (if (= @error-count 0)
       success-response
       (do
         (dec-error-count)
         (rand-nth [unexpected-error-response unknown-error-response reduce-data-response]))))})


(deftest test-400-response
  (with-global-fake-routes-in-isolation
    apimocks-templates
    (try+
      (sut/make-get-request "https://graph.facebook.com/v2.8/always_400?token=aa")
      (catch Object e
        (is (= (:status e) 400))))))

(defn generate-apimocks [max-limit]
  (into {} (mapcat
            (fn [[k v]]
              (map (fn [i] [(str k "&limit=" i) v]) (range 1 max-limit)))
            apimocks-templates)))

(deftest make-get-request-500-200-test
  (with-global-fake-routes-in-isolation
    (generate-apimocks 101)
    (set-error-count 7)
    (is (= 200 (:status (sut/make-get-request "https://graph.facebook.com/v2.8/fail_on_error_count_and_decrement?token=aa&limit=25"))))))

(deftest make-get-request-200-test
  (with-global-fake-routes-in-isolation
    (generate-apimocks 101)
    (is (= 200 (:status (sut/make-get-request "https://graph.facebook.com/v2.8/always_200?token=aa&limit=20"))))))

(deftest test-media-posted-before-error-response
  (with-global-fake-routes-in-isolation
    apimocks-templates
    (try+
     (let [response (sut/make-get-request "https://graph.facebook.com/v2.8/always_media_error?token=asd")]
       (is (contains? response :body))
       (is (contains? response :status))
       (is (= 200 (:status response)))
       (is (empty? (:body response)))))))
