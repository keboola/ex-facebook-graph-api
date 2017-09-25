(ns keboola.regression-tests.pageinsights.test-pageinsights
  (:require [clj-http.fake :refer :all]
            [clojure.test :as t :refer :all]
            [keboola.facebook.extractor.output :refer [reset-columns-map]]
            [keboola.facebook.insights-extractor.core :refer [prepare-and-run]]
            [keboola.facebook.insights-extractor.sync-actions
             :refer
             [disable-log-token]]
            [keboola.regression-tests.outdirs-check :as outdirs-check]
            [keboola.regression-tests.pageinsights.apicalls :as apicalls]
            [keboola.test-utils.core :as test-utils]))

(deftest pageinsights-test
  (let [tmp-dir (.getPath (test-utils/mk-tmp-dir! "pageinsights"))]
    (disable-log-token)
    (println "testing dir:" tmp-dir)
    (println "expected dir:" "test/keboola/regression_tests/pageinsights")
    (test-utils/copy-config-tmp "test/keboola/regression_tests/pageinsights" tmp-dir)
    (with-global-fake-routes-in-isolation
      apicalls/recorded
      (reset-columns-map)
      (prepare-and-run tmp-dir)
      (outdirs-check/is-equal "test/keboola/regression_tests/pageinsights" tmp-dir)
      )))
