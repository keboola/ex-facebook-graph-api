(ns keboola.snapshots.core
  (:require [cheshire.core :refer [generate-stream]]
            [clj-http.fake :refer [with-global-fake-routes-in-isolation]]
            [clojure.test :as t :refer :all]
            clostache.parser
            [keboola.docker.config :refer [load-config user-credentials]]
            [keboola.facebook.extractor.core :refer [prepare-and-run]]
            [keboola.facebook.extractor.output :refer [reset-columns-map]]
            [keboola.http.client :refer [GET]]
            [keboola.http.recording
             :refer
             [recording
              reset-recording
              save-current-recording
              turn-recording-off
              turn-recording-on]]
            [keboola.test-utils.core :as test-utils])
  (:import java.io.File))

(defn create-test-file [dir-path ns-name recording-ns test-name]
  (let [test-file-path (str dir-path "/" "test" "_" test-name ".clj")
        test-ns (str ns-name ".test-" test-name)
        template {:ns-name test-ns
                  :apicalls-ns recording-ns
                  :test-name test-name
                  :dir-path dir-path}
        test-content-template (slurp "test/keboola/snapshots/template.mustache")
        test-file-content (clostache.parser/render test-content-template template)]
    (with-open [w (clojure.java.io/writer test-file-path)]
      (.write w test-file-content))))

(defn clean-test-directory [dirpath]
  (println "cleaning test directory " dirpath)
  (let [files (.listFiles (File. dirpath))
        filtered-files (filter #(not= (.getName %) "config.json") files)]
    (doseq [f filtered-files]
      (if (.isDirectory f)
        (test-utils/delete-recursively f)
        (clojure.java.io/delete-file f)))))

(defn save-token-to-config! [dirpath token]
  (let [config (load-config dirpath)
        oauth-data-path [:authorization :oauth_api :credentials :#data]
        anonymized-oauth-data (str "{\"token\":\"" token "\"}")
        anonymized-config (assoc-in config oauth-data-path anonymized-oauth-data)
        path (str dirpath "/config.json")]
    (println "saving token" (subs token 0 2) " into " dirpath)
    (generate-stream anonymized-config (clojure.java.io/writer path) {:pretty true})))

(defn anonymize-config-token [dirpath]
  (save-token-to-config! dirpath "XXTOKENXX"))

(defn get-token-from-env [component-id]
  (let [env-name
        ({
          "keboola.ex-facebook" "FB_TOKEN"
          "keboola.ex-facebook-ads" "FB_ADS_TOKEN"
          } component-id)]
    (System/getenv env-name)))

(defn save-config-token-from-env [dirpath]
  (let [config (load-config dirpath)
        component-id (get-in config [:authorization :oauth_api :id])
        token (get-token-from-env component-id)]
    (if token
      (do (println "Read token from env for " component-id)
          (save-token-to-config! dirpath token))
      (println "No token read for" component-id))))

(defn generate-test
  ([dirname] (generate-test dirname true))
  ([dirname anonymize-token?]
   (let [clj-compliant-name (clojure.string/replace dirname #"_" "-")
         ns-name (str "keboola.snapshots." clj-compliant-name)
         dir-path (str "test/keboola/snapshots/" dirname)
         recording-path (str "test/keboola/snapshots/" dirname "/apicalls.clj")
         recording-ns (str ns-name ".apicalls")]

     (turn-recording-on)
     (clean-test-directory dir-path)
     (reset-recording)
     (reset-columns-map)
     (prepare-and-run dir-path)
     (println "saving apicalls in " dirname)
     (save-current-recording recording-path recording-ns (:token (user-credentials dir-path)))
     (println "creating test file " clj-compliant-name)
     (create-test-file dir-path ns-name recording-ns clj-compliant-name)
     (turn-recording-off)
     (if anonymize-token? (anonymize-config-token dir-path)))))

(defn regenerate-all-snapshot-dirs
  ([] (regenerate-all-snapshot-dirs nil))
  ([dirfilter]
   (let [snapshot-dirs (filter #(.isDirectory %) (.listFiles (File. "test/keboola/snapshots")))
         dir-names (map #(.getName %) snapshot-dirs)
         filter-regexp (re-pattern (or dirfilter ""))
         dirs-filtered (filter #(re-find filter-regexp %) dir-names)]

     (println "found snapshot dirs(" dirfilter "):" dirs-filtered)
     (doseq [dname dirs-filtered]
       (generate-test dname)))))
