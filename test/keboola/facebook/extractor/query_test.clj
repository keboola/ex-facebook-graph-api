(ns keboola.facebook.extractor.query-test
  (:require [keboola.facebook.extractor.query :as sut]
            [keboola.test-utils.core :as test-utils]
            [clojure.java.io :as io]
            [keboola.facebook.api.request-test :refer [media-posted-before-error-response]]
            [clojure.test :refer :all])
  (:use clj-http.fake))

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
