(ns keboola.facebook.extractor.choose-token-test
  (:require  [clojure.test :refer :all]
             [keboola.facebook.extractor.query :refer [choose-token]])
  (:use clj-http.fake))

(def accounts-response {:request-time 261, :repeatable? false, :protocol-version {:name "HTTP", :major 1, :minor 1}, :streaming? true, :chunked? false, :reason-phrase "OK", :headers {"Content-Type" "text/javascript; charset=UTF-8", "Access-Control-Allow-Origin" "*", "X-FB-Debug" "fXQt79Gaetuj2SncCSgnNZCuKuyJMtzr2dHtTs1lGouuGx3Jpm777iP4+pYPIbRkbb0jGfIMQftbtMN3e/mBBw==", "facebook-api-version" "v3.1", "Strict-Transport-Security" "max-age=15552000; preload", "Connection" "close", "Pragma" "no-cache", "Expires" "Sat, 01 Jan 2000 00:00:00 GMT", "x-fb-rev" "4368033", "ETag" "\"2ee48088b20f04459ee2c5ef75f40d8138ef6ecf\"", "x-fb-trace-id" "AxSI8JAYFqD", "Date" "Mon, 01 Oct 2018 09:34:22 GMT", "Vary" "Accept-Encoding", "Cache-Control" "private, no-cache, no-store, must-revalidate", "x-app-usage" "{\"call_count\":0,\"total_cputime\":0,\"total_time\":0}"}, :orig-content-encoding nil, :status 200, :body "{\"data\":[{\"access_token\":\"pagetoken1\",\"category\":\"Community\",\"category_list\":[{\"id\":\"2612\",\"name\":\"blabla\"}],\"name\":\"page1\",\"id\":\"1017786331693295\",\"tasks\":[\"ANALYZE\",\"ADVERTISE\",\"MODERATE\",\"CREATE_CONTENT\",\"MANAGE\"]},{\"access_token\":\"pagetoken2\",\"category\":\"Community\",\"category_list\":[{\"id\":\"2612\",\"name\":\"4h0CG\"}],\"name\":\"0xk3z\",\"id\":\"1960059394258217\",\"tasks\":[\"ANALYZE\",\"ADVERTISE\",\"MODERATE\",\"CREATE_CONTENT\",\"MANAGE\"]},{\"access_token\":\"pagetoken3\",\"category\":\"Business Consultant\",\"category_list\":[{\"id\":\"179672275401610\",\"name\":\"n2DCf\"},{\"id\":\"2211\",\"name\":\"boKMN\"}],\"name\":\"PInBh\",\"id\":\"177057932317550\",\"tasks\":[\"ANALYZE\"]}],\"paging\":{\"cursors\":{\"before\":\"MTAxNzc4NjMzMTY5MzI5NQZDZD\",\"after\":\"MTc3MDU3OTMyMzE3NTUw\"}}}"})


(def usertoken "XXXTOKEN")

(def api-mock
  {
   "https://graph.facebook.com/v3.1/me/accounts?access_token=XXXTOKEN"
   (fn [req]
     accounts-response)})


(deftest test-choose-token
  (with-global-fake-routes-in-isolation
    api-mock
    (is (= usertoken (choose-token "foo" usertoken "v3.1")))
    (is (= "pagetoken1" (choose-token "1017786331693295" usertoken "v3.1")))))

(deftest test-choose-token-fallback
  (is (= "othertoken" (choose-token "1017786331693295" "othertoken" "v3.1"))))
