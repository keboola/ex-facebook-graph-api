(ns keboola.regression-tests.core
  (:require [keboola.http.client :refer [GET]]
            [keboola.http.recording :refer [reset-recording recording save-current-recording turn-recording-on turn-recording-off]]
            [keboola.facebook.insights-extractor.core :refer [prepare-and-run]]
            [keboola.docker.config :refer [user-credentials load-config]]
            [keboola.facebook.insights-extractor.output :refer [reset-columns-map]]
            [keboola.test-utils.core :as test-utils]
            [clojure.test :as t :refer :all]
            [clostache.parser]
            [cheshire.core :refer [generate-stream]]
            [clj-http.fake :refer [with-global-fake-routes-in-isolation]])
  (:import java.io.File))

#_(deftest foo-test
  (with-global-fake-routes-in-isolation
    apicalls
    (println (GET "https://google.com/apps/ab" :query-params {:path "feed",
       :fields
       "caption,message,created_time,type,description,likes{name,username},comments{message,created_time,from,likes{name,username}}",
       :ids "177057932317550",
       :access_token "XXTOKENXX",
       :since "",
       :until ""}))))

(defn create-test-file [dir-path ns-name recording-ns test-name]
  (let [test-file-path (str dir-path "/" "test" "_" test-name ".clj")
        test-ns (str ns-name ".test-" test-name)
        template {:ns-name test-ns
                  :apicalls-ns recording-ns
                  :test-name test-name
                  :dir-path dir-path}
        test-content-template (slurp "test/keboola/regression_tests/template.mustache")
        test-file-content (clostache.parser/render test-content-template template)]
    (with-open [w (clojure.java.io/writer test-file-path)]
      (.write w test-file-content))))

(defn clean-test-directory [dirpath]
  (let [files (.listFiles (File. dirpath))
        filtered-files (filter #(not= (.getName %) "config.json") files)]
    (doseq [f filtered-files]
      (if (.isDirectory f)
        (test-utils/delete-recursively f)
        (clojure.java.io/delete-file f)))))

(defn anonymize-config-token [dirpath]
  (let [config (load-config dirpath)
        oauth-data-path [:authorization :oauth_api :credentials :#data]
        anonymized-oauth-data "{\"token\":\"XXTOKENXX\"}"
        anonymized-config (assoc-in config oauth-data-path anonymized-oauth-data)
        path (str dirpath "/config.json")]
    (generate-stream anonymized-config (clojure.java.io/writer path) {:pretty true})))

(defn generate-test
  ([dirname] (generate-test dirname true))
  ([dirname anonymize-token?]
   (let [clj-compliant-name (clojure.string/replace dirname #"_" "-")
         ns-name (str "keboola.regression-tests." clj-compliant-name)
         dir-path (str "test/keboola/regression_tests/" dirname)
         recording-path (str "test/keboola/regression_tests/" dirname "/apicalls.clj")
         recording-ns (str ns-name ".apicalls")
         ]
     (turn-recording-on)
     (clean-test-directory dir-path)
     (reset-recording)
     (reset-columns-map)
     (prepare-and-run dir-path)
     (save-current-recording recording-path recording-ns (:token (user-credentials dir-path)))
     (create-test-file dir-path ns-name recording-ns clj-compliant-name)
     (turn-recording-off)
     (if anonymize-token? (anonymize-config-token dir-path))
     )))
