(ns keboola.facebook.insights-extractor.core
  (:require [clojure.tools.cli :refer [parse-opts]]
            [keboola.docker.config :as docker-config]
            [keboola.docker.runtime :as docker-runtime]
            [clojure.string :as string])
  (:gen-class))

(def cli-options  [["-d" "--dataDir path" "Path to data directory e.g. /data"]])

(defn usage [options-summary]
  (->> ["Keboola Facebook Insights Extractor"
        "Usage: program-name options"
        "Options:"
        options-summary]
       (string/join \newline)))

(defn run [credentials parameters out-dir]

  )

(defn prepare-and-run [datadir]
  (let [ parameters (docker-config/parameters datadir)
         credentials (docker-config/user-credentials datadir)]
    (cond
      (empty? credentials) (docker-runtime/error "Missing facebook credentials")
      (empty? (:token credentials)) (docker-runtime/error "Missing facebook token")
      )
    (run credentials parameters (docker-config/out-dir-path datadir))))

(defn -main [& args]
  (let [{:keys [options summary errors] :as parsed-args} (parse-opts args cli-options)]
    (cond
      (not-empty errors) (docker-runtime/error (string/join \newline errors))
      (empty? (:dataDir options)) (docker-runtime/error (usage summary)))
    (prepare-and-run (:dataDir options))
    ))
