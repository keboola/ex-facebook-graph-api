(ns keboola.snapshots.campaignsinsights.test-campaignsinsights
  (:require [clj-http.fake :refer :all]
            [clojure.test :as t :refer :all]
            [keboola.facebook.extractor.core :refer [prepare-and-run]]
            [keboola.facebook.extractor.output :refer [reset-columns-map]]
            [keboola.snapshots.campaignsinsights.apicalls :as apicalls]
            [keboola.snapshots.outdirs-check :as outdirs-check]
            [keboola.test-utils.core :as test-utils]))

(deftest campaignsinsights-test
  (let [tmp-dir (.getPath (test-utils/mk-tmp-dir! "campaignsinsights"))]
    (println "testing dir:" tmp-dir)
    (println "expected dir:" "test/keboola/snapshots/campaignsinsights")
    (test-utils/copy-config-tmp "test/keboola/snapshots/campaignsinsights" tmp-dir)
    (with-global-fake-routes-in-isolation
      apicalls/recorded
      (reset-columns-map)
      (prepare-and-run tmp-dir)
      (outdirs-check/is-equal "test/keboola/snapshots/campaignsinsights" tmp-dir)
      )))