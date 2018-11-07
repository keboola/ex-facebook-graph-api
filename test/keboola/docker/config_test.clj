(ns keboola.docker.config-test
  (:require [keboola.docker.config :as sut]
            [clojure.test :as t :refer :all]
            [clojure.string :refer [trim ends-with? starts-with?]]
            [keboola.test-utils.core :as test-utils]))


(def ^:dynamic *tmpdir* "")

(defn setup-tmpdir [f]
  (binding [*tmpdir* (test-utils/mk-tmp-dir! "exfbtest")]
    (f)
    (test-utils/recursive-delete *tmpdir*)))

(defn trimmed? [str-val]
  (= (trim str-val) str-val))

(deftest test-check-path
  (are [test-value] (and (ends-with? test-value "/") (-> test-value (ends-with? "//") not ) (trimmed? test-value))
    (sut/check-path "asd")
    (sut/check-path "asd/")
    (sut/check-path " aa/")
    (sut/check-path " aa")))

(deftest test-out-dir-path
  (let [path (sut/out-dir-path (test-utils/mk-path *tmpdir* "."))]
    (is (and
         (trimmed? path)
         (ends-with? path "out/tables/")
         (.isDirectory (java.io.File. path))
         (.exists (java.io.File. path))))))

(deftest test-parameters
  (is (thrown? java.io.FileNotFoundException (sut/parameters))))

(deftest test-get-fb-token
  (is (empty? (sut/get-fb-token {})))
  (is (= "access_token" (sut/get-fb-token {:access_token "access_token" :token "token"})))
  (is (= "access_token" (sut/get-fb-token {:access_token "access_token"})))
  (is (= "token" (sut/get-fb-token {:token "token"}))))

(use-fixtures :once setup-tmpdir)
