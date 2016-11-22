(ns keboola.docker.config
  (:require [cheshire.core :refer [parse-string]]
            [clojure.string :refer [trim]]
            ))

(def default-dir "/data/")

(defn check-path [path]
  (if (clojure.string/ends-with? path "/")
    path
    (str path "/")))

(defn- load-config-once
  ([] (load-config-once default-dir))
  ([datadir]
   (let [dirpath (check-path datadir)
         file-content (slurp (trim (str dirpath "config.json")))]
     (parse-string file-content true))))

(def load-config (memoize load-config-once))

(defn mkdirp [path]
  (let [dir (java.io.File. path)]
    (if (.exists dir)
      path
      (.mkdirs dir))))

(defn out-dir-path [datadir]
  (let [result
        (mkdirp (str (check-path (trim datadir)) "out/tables/"))]
    result
    )
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
