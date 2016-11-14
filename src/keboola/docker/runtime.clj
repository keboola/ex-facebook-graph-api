(ns keboola.docker.runtime
  (:require [taoensso.timbre :as timbre])
  )

(defn exit [status]
  (System/exit status)
  )

(defn log-error [error-msg]
  (binding [*out* *err*]
    (println error-msg))
  )

(defn error [error-msg]
  (log-error error-msg)
  (exit 1)
  )

(defn log-strings [strings]
  (println (apply str strings)))

(defn log [what]
  (println what)
  )
