(ns keboola.facebook.api.parser-test
  (:require [keboola.facebook.api.parser :as sut]
            [clojure.test :refer :all]
            [clojure.spec :as s]
            [keboola.test-utils.core :refer [test-and-check]]
            [clojure.test.check.clojure-test :refer [defspec]]
            [clojure.test.check.properties :as prop]))

#_(defspec test-unfold-nested-sequence 4
  (prop/for-all [coll table-data-gen]
                (let [test-value (sut/unfold-nested-sequence coll)]
                  (and
                     (not (reduced? test-value))
                     (every? map? test-value)))))

#_(defn foo-test [x]  x)
#_(s/fdef foo-test :args (s/cat :x some?) :ret some?)
