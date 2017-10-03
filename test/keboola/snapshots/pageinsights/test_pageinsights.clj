(ns keboola.snapshots.pageinsights.test-pageinsights
  (:require [clj-http.fake :refer :all]
            [clojure.test :as t :refer :all]
            [keboola.facebook.extractor.core :refer [prepare-and-run]]
            [keboola.facebook.extractor.output :refer [reset-columns-map]]
            [keboola.facebook.extractor.sync-actions :refer [disable-log-token]]
            [keboola.snapshots.outdirs-check :as outdirs-check]
            [keboola.snapshots.pageinsights.apicalls :as apicalls]
            [keboola.test-utils.core :as test-utils]))

(deftest pageinsights-test
  (let [tmp-dir (.getPath (test-utils/mk-tmp-dir! "pageinsights"))]
    (disable-log-token)
    (println "testing dir:" tmp-dir)
    (println "expected dir:" "test/keboola/snapshots/pageinsights")
    (test-utils/copy-config-tmp "test/keboola/snapshots/pageinsights" tmp-dir)
    (with-global-fake-routes-in-isolation
      apicalls/recorded
      (reset-columns-map)
      (prepare-and-run tmp-dir)
      (outdirs-check/is-equal "test/keboola/snapshots/pageinsights" tmp-dir)
      )))
