(ns keboola.snapshots.ads.test-ads
  (:require [clj-http.fake :refer :all]
            [clojure.test :as t :refer :all]
            [keboola.facebook.extractor.core :refer [prepare-and-run]]
            [keboola.facebook.extractor.output :refer [reset-columns-map]]
            [keboola.facebook.extractor.sync-actions :refer [disable-log-token]]
            [keboola.snapshots.ads.apicalls :as apicalls]
            [keboola.snapshots.outdirs-check :as outdirs-check]
            [keboola.test-utils.core :as test-utils]))

(deftest ads-test
  (let [tmp-dir (.getPath (test-utils/mk-tmp-dir! "ads"))]
    (disable-log-token)
    (println "testing dir:" tmp-dir)
    (println "expected dir:" "test/keboola/snapshots/ads")
    (test-utils/copy-config-tmp "test/keboola/snapshots/ads" tmp-dir)
    (with-global-fake-routes-in-isolation
      apicalls/recorded
      (reset-columns-map)
      (prepare-and-run tmp-dir)
      (outdirs-check/is-equal "test/keboola/snapshots/ads" tmp-dir)
      )))
