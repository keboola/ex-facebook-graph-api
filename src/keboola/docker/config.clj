(ns keboola.docker.config
  (:require [cheshire.core :refer [parse-string]]
            [clojure.string :refer [trim]]))


(def default-dir "/data/")

(defn check-path [path]
  (if (clojure.string/ends-with? path "/")
    (trim path)
    (str (trim path) "/")))

(defn- load-config-once
  ([] (load-config-once default-dir))
  ([datadir]
   (let [dirpath (check-path datadir)
         file-content (slurp (trim (str dirpath "config.json")))]
     (parse-string file-content true))))

(def load-config load-config-once)

(defn mkdirp [path]
  (let [dir (java.io.File. path)]
    (if-not (.exists dir)
      (.mkdirs dir))
    path))

(defn out-dir-path
  ([]
   (out-dir-path "./"))
  ([datadir]
   (let [result (mkdirp (str (check-path (trim datadir)) "out/tables/"))]
     result)))


(defn config [& datadir]
  (apply load-config datadir))


(defn parameters [& datadir]
  (:parameters (apply load-config datadir)))


(defn app-access-token [& datadir]
  (let
      [auth-info (get-in
                  (apply load-config datadir)
                  [:authorization :oauth_api :credentials])
       app-secret (:#appSecret auth-info)
       app-id (:appKey auth-info)]
    (str app-id "|" app-secret)))

(defn user-credentials [& datadir]
  (let
      [data (get-in
             (apply load-config datadir)
             [:authorization :oauth_api :credentials :#data])]
    (parse-string data true)))

(defn get-fb-token [user-credentials]
  (:access_token user-credentials (:token user-credentials)))


