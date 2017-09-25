(ns keboola.regression-tests.adsinsights.test-adsinsights
  (:require [clj-http.fake :refer :all]
            [clojure.test :as t :refer :all]
            [keboola.facebook.extractor.output :refer [reset-columns-map]]
            [keboola.facebook.insights-extractor.core :refer [prepare-and-run]]
            [keboola.regression-tests.adsinsights.apicalls :as apicalls]
            [keboola.regression-tests.outdirs-check :as outdirs-check]
            [keboola.test-utils.core :as test-utils]))

(deftest adsinsights-test
  (let [tmp-dir (.getPath (test-utils/mk-tmp-dir! "adsinsights"))]
    (println "testing dir:" tmp-dir)
    (println "expected dir:" "test/keboola/regression_tests/adsinsights")
    (test-utils/copy-config-tmp "test/keboola/regression_tests/adsinsights" tmp-dir)
    (with-global-fake-routes-in-isolation
      apicalls/recorded
      (reset-columns-map)
      (prepare-and-run tmp-dir)
      (outdirs-check/is-equal "test/keboola/regression_tests/adsinsights" tmp-dir)
      )))