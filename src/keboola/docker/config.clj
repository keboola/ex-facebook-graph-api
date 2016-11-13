(ns keboola.docker.config
  (:require [cheshire.core :refer [parse-string]]))

(def default-dir "/data/")

(defn check-path [path]
  (if (clojure.string/ends-with? path "/")
    path
    (str path "/")))

(defn- load-config-once
  ([] (load-config-once default-dir))
  ([datadir]
   (let [dirpath (check-path datadir)
         file-content (slurp (str dirpath "config.json"))]
     (parse-string file-content true))))

(def load-config (memoize load-config-once))

(defn out-dir-path [filename]
  (str (check-path (str default-dir "out/tables")) filename)
  )


(defn parameters [& datadir]
  (:parameters (apply load-config datadir))
  )

(defn user-credentials [& datadir]
  (let
      [data (get-in
             (apply load-config datadir)
             [:authorization :oauth_api :credentials :#data])]
    (parse-string data true))
  )
