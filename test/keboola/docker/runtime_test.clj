(ns keboola.docker.runtime-test
  (:require [keboola.docker.runtime :as sut]
            [clojure.test :as t :refer [deftest]]
            [keboola.test-utils.core :refer [prints-error? prints-msg?]]))
            

(deftest test-log-error
  (prints-error? sut/log-error "asd" "fff")
  (prints-error? sut/log-error "asd")
  (prints-error? sut/log-error ""))
  


(deftest test-log-strings
  (prints-msg? sut/log-strings "asd" "asd")
  (prints-msg? sut/log-strings "asf")
  (prints-msg? sut/log-strings "")
  (prints-msg? sut/log-strings))
  
