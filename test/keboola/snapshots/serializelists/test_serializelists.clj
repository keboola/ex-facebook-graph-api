(ns keboola.snapshots.serializelists.test-serializelists
  (:require [keboola.snapshots.serializelists.apicalls :as apicalls]
            [clojure.test :as t :refer :all]
            [keboola.snapshots.outdirs-check :as outdirs-check]
            [keboola.test-utils.core :as test-utils]
            [keboola.facebook.extractor.sync-actions :refer [disable-log-token]]
            [keboola.facebook.extractor.output :refer [reset-columns-map]]
            [keboola.facebook.extractor.core :refer [prepare-and-run]]
            )
  (:use clj-http.fake))

(deftest serializelists-test
  (let [tmp-dir (.getPath (test-utils/mk-tmp-dir! "serializelists"))]
    (disable-log-token)
    (println "testing dir:" tmp-dir)
    (println "expected dir:" "test/keboola/snapshots/serializelists")
    (test-utils/copy-config-tmp "test/keboola/snapshots/serializelists" tmp-dir)
    (with-global-fake-routes-in-isolation
      apicalls/recorded
      (reset-columns-map)
      (prepare-and-run tmp-dir)
      (outdirs-check/is-equal "test/keboola/snapshots/serializelists" tmp-dir)
      )))