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

(def cannot-include-error
  {:request-time 21463, :repeatable? false, :protocol-version {:name "HTTP", :major 1, :minor 1}, :streaming? true, :chunked? false, :reason-phrase "Internal Server Error", :headers {}, :orig-content-encoding nil, :status 400, :length 108, :body "{\"error\":{\"code\":1,\"message\":\"(#100) Cannot include account_id, account_name, ad_id, ad_name, adset_id, adset_name, campaign_id, campaign_name, impressions, clicks, spend, reach in summary param because they weren't there while creating the report run. All available values are:\"}}"})


(def unknown-error-response
  {:request-time 30136, :repeatable? false, :protocol-version {:name "HTTP", :major 1, :minor 1}, :streaming? true, :chunked? false, :reason-phrase "Internal Server Error", :headers {}, :orig-content-encoding nil, :status 500, :length 77, :body "{\"error\":{\"code\":1,\"message\":\"An unknown error occurred\",\"error_subcode\":99}}", :trace-redirects ["https://graph.facebook.com/v2.8/adsblablabla"]})

(def something-went-wrong-error-response
  {:request-time 30136, :repeatable? false, :protocol-version {:name "HTTP", :major 1, :minor 1}, :streaming? true, :chunked? false, :reason-phrase "Internal Server Error", :headers {}, :orig-content-encoding nil, :status 500, :length 77, :body "<html lang=\"en\" id=\"facebook\">\n  <head>\n    <title>Facebook | Error</title>\n    <meta charset=\"utf-8\">\n    <meta http-equiv=\"cache-control\" content=\"no-cache\">\n    <meta http-equiv=\"cache-control\" content=\"no-store\">\n    <meta http-equiv=\"cache-control\" content=\"max-age=0\">\n    <meta http-equiv=\"expires\" content=\"-1\">\n    <meta http-equiv=\"pragma\" content=\"no-cache\">\n    <meta name=\"robots\" content=\"noindex,nofollow\">\n    <style>\n      html, body {\n        color: #141823;\n        background-color: #e9eaed;\n        font-family: Helvetica, Lucida Grande, Arial,\n                     Tahoma, Verdana, sans-serif;\n        margin: 0;\n        padding: 0;\n        text-align: center;\n      }\n\n      #header {\n        height: 30px;\n        padding-bottom: 10px;\n        padding-top: 10px;\n        text-align: center;\n      }\n\n      #icon {\n        width: 30px;\n      }\n\n      h1 {\n        font-size: 18px;\n      }\n\n      p {\n        font-size: 13px;\n      }\n\n      #footer {\n        border-top: 1px solid #ddd;\n        color: #9197a3;\n        font-size: 12px;\n        padding: 5px 8px 6px 0;\n      }\n    </style>\n  </head>\n  <body>\n    <div id=\"header\">\n      <a href=\"//www.facebook.com/\">\n        <img id=\"icon\" src=\"//static.facebook.com/images/logos/facebook_2x.png\" />\n      </a>\n    </div>\n    <div id=\"core\">\n      <h1 id=\"sorry\">Sorry, something went wrong.</h1>\n      <p id=\"promise\">\n        We're working on it and we'll get it fixed as soon as we can.\n      </p>\n      <p id=\"back-link\">\n        <a id=\"back\" href=\"//www.facebook.com/\">Go Back</a>\n      </p>\n      <div id=\"footer\">\n        Facebook\n        <span id=\"copyright\">\n          &copy; 2018\n        </span>\n        <span id=\"help-link\">\n          &#183;\n          <a id=\"help\" href=\"//www.facebook.com/help/\">Help Center</a>\n        </span>\n      </div>\n    </div>\n    <script>\n      document.getElementById('back').onclick = function() {\n        if (history.length > 1) {\n          history.back();\n          return false;\n        }\n      };\n\n      // Adjust the display based on the window size\n      if (window.innerHeight < 80 || window.innerWidth < 80) {\n        // Blank if window is too small\n        document.body.style.display = 'none';\n      };\n      if (window.innerWidth < 200 || window.innerHeight < 150) {\n        document.getElementById('back-link').style.display = 'none';\n        document.getElementById('help-link').style.display = 'none';\n      };\n      if (window.innerWidth < 200) {\n        document.getElementById('sorry').style.fontSize = '16px';\n      };\n      if (window.innerWidth < 150) {\n        document.getElementById('promise').style.display = 'none';\n      };\n      if (window.innerHeight < 150) {\n        document.getElementById('sorry').style.margin = '4px 0 0 0';\n        document.getElementById('sorry').style.fontSize = '14px';\n        document.getElementById('promise').style.display = 'none';\n      };\n    </script>\n  </body>\n</html>"})

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
  {"https://graph.facebook.com/v2.8/always_media_error?token=asd"
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
         (rand-nth [unexpected-error-response unknown-error-response reduce-data-response something-went-wrong-error-response cannot-include-error]))))})

(deftest test-retry-on-html-error
  (is  (sut/retry-exception? something-went-wrong-error-response)))

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
       (is (contains? (:body response) :data))
       (is (contains? response :status))
       (is (= 200 (:status response)))
       (is (empty? (-> response :body :data)))))))

(deftest test-get-next-page-url
  (let [response {:paging {:previous "https://graph.facebook.com/v16.0/17841401480255572/insights?access_token=XXX&pretty=0&since=1672915646&until=1675248446&metric=total_interactions&metric_type=total_value&period=day"
                           :next "https://graph.facebook.com/v16.0/17841401480255572/insights?access_token=XXX&pretty=0&since=1677581248&until=1679914048&metric=total_interactions&metric_type=total_value&period=day"}}]
    (is (nil? (sut/get-next-page-url response true false)))
    (is (= (sut/get-next-page-url response false false) "https://graph.facebook.com/v16.0/17841401480255572/insights?access_token=XXX&pretty=0&since=1677581248&until=1679914048&metric=total_interactions&metric_type=total_value&period=day")))

  (let [response {:paging {:previous "https://graph.facebook.com/v16.0/17841401480255572/insights?access_token=XXX&pretty=0&since=1672915646&until=1675248446&metric=total_interactions&metric_type=total_value&period=day"}}]
    (is (nil? (sut/get-next-page-url response true false)))
    (is (nil? (sut/get-next-page-url response false false))))

  (let [response {:paging {:next "someurl"}} :data []]
    (is (nil? (sut/get-next-page-url response false true))))

  (let [response {:paging {:next "someurl"}} :data [{:some "data"}]]
    (is (= "someurl" (sut/get-next-page-url response false true))))

  (let [response {:paging {:previous "https://graph.facebook.com/v16.0/17841401480255572/insights?access_token=XXX&pretty=0&metric=total_interactions&metric_type=total_value&period=day"
                           :next "https://graph.facebook.com/v16.0/17841401480255572/insights?access_token=XXX&pretty=0&metric=total_interactions&metric_type=total_value&period=day"}}]
    (is (= (sut/get-next-page-url response false false) "https://graph.facebook.com/v16.0/17841401480255572/insights?access_token=XXX&pretty=0&metric=total_interactions&metric_type=total_value&period=day")))

  (let [response {:paging {:previous "https://graph.facebook.com/v16.0/17841401480255572/insights?access_token=XXX&pretty=0&metric=total_interactions&metric_type=total_value&period=day"
                           :next "https://graph.facebook.com/v16.0/17841401480255572/insights?access_token=XXX&pretty=0&metric=reach&metric_type=total_value&period=day"}}]
    (is (= (sut/get-next-page-url response false false) "https://graph.facebook.com/v16.0/17841401480255572/insights?access_token=XXX&pretty=0&metric=reach&metric_type=total_value&period=day"))))
