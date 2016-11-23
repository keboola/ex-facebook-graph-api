(ns keboola.test-utils.core
  (:require [clojure.test :refer [is]] )
  (:require [clojure.string])
  )

(defmacro with-err-str
  "Evaluates exprs in a context in which *err* is bound to a fresh
  StringWriter.  Returns the string created by any nested printing
  calls."
  {:added "1.0"}
  [& body]
  `(let [s# (new java.io.StringWriter)]
     (binding [*err* s#]
       ~@body
       (str s#))))

(defn prints-error? [error-fn & params]
  (is (= (clojure.string/trim (with-err-str (apply error-fn params))) (clojure.string/join " " params)))
  )

(defn prints-msg? [print-fn & params]
  (is (= (clojure.string/trim (with-out-str (apply print-fn params))) (clojure.string/join " " params))))
