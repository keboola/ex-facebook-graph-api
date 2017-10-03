(ns keboola.snapshots.feedsummary.test-feedsummary
  (:require [keboola.snapshots.feedsummary.apicalls :as apicalls]
            [clojure.test :as t :refer :all]
            [keboola.snapshots.outdirs-check :as outdirs-check]
            [keboola.test-utils.core :as test-utils]
            [keboola.facebook.extractor.sync-actions :refer [disable-log-token]]
            [keboola.facebook.extractor.output :refer [reset-columns-map]]
            [keboola.facebook.extractor.core :refer [prepare-and-run]]
            )
  (:use clj-http.fake))

(deftest feedsummary-test
  (let [tmp-dir (.getPath (test-utils/mk-tmp-dir! "feedsummary"))]
    (disable-log-token)
    (println "testing dir:" tmp-dir)
    (println "expected dir:" "test/keboola/snapshots/feedsummary")
    (test-utils/copy-config-tmp "test/keboola/snapshots/feedsummary" tmp-dir)
    (with-global-fake-routes-in-isolation
      apicalls/recorded
      (reset-columns-map)
      (prepare-and-run tmp-dir)
      (outdirs-check/is-equal "test/keboola/snapshots/feedsummary" tmp-dir)
      )))