(ns keboola.regression-tests.ads.test-ads
  (:require [keboola.regression-tests.ads.apicalls :as apicalls]
            [clojure.test :as t :refer :all]
            [keboola.regression-tests.outdirs-check :as outdirs-check]
            [keboola.test-utils.core :as test-utils]
            [keboola.facebook.insights-extractor.sync-actions :refer [disable-log-token]]
            [keboola.facebook.insights-extractor.output :refer [reset-columns-map]]
            [keboola.facebook.insights-extractor.core :refer [prepare-and-run]]
            )
  (:use clj-http.fake))

(deftest ads-test
  (let [tmp-dir (.getPath (test-utils/mk-tmp-dir! "ads"))]
    (disable-log-token)
    (println "testing dir:" tmp-dir)
    (println "expected dir:" "test/keboola/regression_tests/ads")
    (test-utils/copy-config-tmp "test/keboola/regression_tests/ads" tmp-dir)
    (with-global-fake-routes-in-isolation
      apicalls/recorded
      (reset-columns-map)
      (prepare-and-run tmp-dir)
      (outdirs-check/is-equal "test/keboola/regression_tests/ads" tmp-dir)
      )))
