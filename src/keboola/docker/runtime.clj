(ns keboola.docker.runtime
  (:require [cheshire.core :refer [generate-string]])
  )

(defn exit [status]
  (System/exit status)
  )

(defn log-error [& error-msg]
  (binding [*out* *err*]
    (apply println error-msg))
  )

(defn user-error [error-msg]
  (log-error error-msg)
  (exit 1)
  )

(defn app-error [error-msg]
  (log-error error-msg)
  (exit 2)
  )

(defn log-strings [& strings]
  (apply println strings))

(defn log [what]
  (println what))

(defn log-error-and-exit [what]
  (log-error what)
  (exit 0))

(defn save-manifest [csvfile-path body]
  (let [manifest (select-keys body [:destination :columns :incremental :primary_key :delimiter :enclosure])
        manifest-path (str csvfile-path ".manifest")]
    (spit manifest-path (generate-string manifest))))
