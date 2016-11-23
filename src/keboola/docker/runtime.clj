(ns keboola.docker.runtime
  )

(defn exit [status]
  (System/exit status)
  )

(defn log-error [& error-msg]
  (binding [*out* *err*]
    (apply println error-msg))
  )

(defn error [error-msg]
  (log-error error-msg)
  (exit 1)
  )

(defn log-strings [& strings]
  (apply println strings))

(defn log [what]
  (println what)
  )
