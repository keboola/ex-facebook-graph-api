(ns keboola.snapshots.adsinsights.test-adsinsights
  (:require [clj-http.fake :refer :all]
            [clojure.test :as t :refer :all]
            [keboola.facebook.extractor.core :refer [prepare-and-run]]
            [keboola.facebook.extractor.output :refer [reset-columns-map]]
            [keboola.snapshots.adsinsights.apicalls :as apicalls]
            [keboola.snapshots.outdirs-check :as outdirs-check]
            [keboola.test-utils.core :as test-utils]))

(deftest adsinsights-test
  (let [tmp-dir (.getPath (test-utils/mk-tmp-dir! "adsinsights"))]
    (println "testing dir:" tmp-dir)
    (println "expected dir:" "test/keboola/snapshots/adsinsights")
    (test-utils/copy-config-tmp "test/keboola/snapshots/adsinsights" tmp-dir)
    (with-global-fake-routes-in-isolation
      apicalls/recorded
      (reset-columns-map)
      (prepare-and-run tmp-dir)
      (outdirs-check/is-equal "test/keboola/snapshots/adsinsights" tmp-dir)
      )))