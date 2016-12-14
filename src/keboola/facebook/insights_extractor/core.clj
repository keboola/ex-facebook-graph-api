(ns keboola.facebook.insights-extractor.core
  (:gen-class)
  (:require [clojure.tools.cli :refer [parse-opts]]
            [keboola.docker.config :as docker-config]
            [keboola.docker.runtime :as docker-runtime]
            [keboola.facebook.insights-extractor.query :as query]
            [keboola.facebook.insights-extractor.sync-actions :as sync-actions]
            [keboola.utils.json-to-csv :as csv]
            [keboola.docker.runtime :refer [log]]
            [clojure.string :as string]))

(def cli-options  [["-d" "--dataDir path" "Path to data directory e.g. /data"]])

(defn usage [options-summary]
  (->> ["Keboola Facebook Insights Extractor"
        "Usage: program-name options"
        "Options:"
        options-summary]
       (string/join \newline)))

(defn make-accounts-csv [parameters out-dir]
  (let [filepath (str out-dir "accounts")
        header [:id :name :category]
        accounts (:accounts parameters)
        data (into [] (map (fn [[k v]] (select-keys v header)) accounts))]
    (log "writing accounts table")
    (csv/write filepath header data)))

(defn run [credentials parameters out-dir]
  (make-accounts-csv parameters out-dir)
  (mapv #(query/run-query % credentials out-dir) (:queries parameters))
  )


(defn prepare-and-run [datadir]
  (let [ parameters (docker-config/parameters datadir)
         config (docker-config/config datadir)
         action (:action config)
         credentials (docker-config/user-credentials datadir)]
    (cond
      (empty? credentials) (docker-runtime/error "Missing facebook credentials")
      (empty? (:token credentials)) (docker-runtime/error "Missing facebook token")
      )
    (case action
      "accounts" (sync-actions/accounts credentials config)
      (run credentials parameters (docker-config/out-dir-path datadir)))))

(defn -main [& args]
  (let [{:keys [options summary errors] :as parsed-args} (parse-opts args cli-options)]
    (cond
      (not-empty errors) (docker-runtime/error (string/join \newline errors))
      (empty? (:dataDir options)) (docker-runtime/error (usage summary)))
    (prepare-and-run (:dataDir options))
    ))
