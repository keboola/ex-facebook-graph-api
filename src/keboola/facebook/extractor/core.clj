(ns keboola.facebook.extractor.core
  (:gen-class)
  (:require [clojure.string :as string]
            [clojure.tools.cli :refer [parse-opts]]
            [keboola.docker.config :as docker-config]
            [keboola.docker.runtime
             :as
             docker-runtime
             :refer
             [app-error log log-error-and-exit log-strings user-error]]
            [keboola.facebook.extractor.query :as query]
            [keboola.facebook.extractor.sync-actions :as sync-actions]
            [keboola.http.client :refer [fb-requests-count]]
            [keboola.utils.json-to-csv :as csv]
            [keboola.docker.state :refer [make-json-state-file]]
            [slingshot.slingshot :refer [throw+ try+]]))

(def cli-options  [["-d" "--dataDir path" "Path to data directory e.g. /data"]])

(defn usage [options-summary]
  (->> ["Keboola Facebook Graph Api Extractor"
        "Usage: program-name options"
        "Options:"
        options-summary]
       (string/join \newline)))

(defn treat [fn-to-treat]
  (try+
   (fn-to-treat)
   (catch #(and (some? (:status %)) (number? (:status %)) (<= 400 (:status %) 550)) e
     (let [msg (:body e)]
       (if (.contains msg "User request limit reached")
         (log-error-and-exit (str "REQUEST LIMIT REACHED. Up to now extracted data will be uploaded to storage." msg))
         (user-error (str "Facebook api error:" msg)))))
   (catch Object e
     (app-error (str "unexpected error:" e)))))

(defn make-accounts-csv [parameters out-dir]
  (let [filepath (str out-dir "accounts")
        accounts (:accounts parameters)
        header (vec (set (apply concat (map #(keys (dissoc (second %) :access_token)) accounts)))) ;[:id :name :category]
        data (into [] (map (fn [[k v]] (select-keys v header)) accounts))]
    (log "writing accounts table")
    (csv/write filepath header data)))

(defn run [credentials parameters out-dir app-access-token datadir]
  (let [version (:api-version parameters)
        prepare-state (fn [query] (make-json-state-file (:merge-state-columns query) [:queries (keyword (:id query)) :tables] datadir))
        all-ids (apply str (interpose "," (map name (keys (:accounts parameters)))))]
    (make-accounts-csv parameters out-dir)
    (sync-actions/log-debug-token app-access-token credentials "Access token info:")
    (dorun (map (fn  [query]
                  (if (:disabled query)
                    (log-strings "Skipping query" (:name query))
                                        ; else run query:
                    (query/run-query (assoc query :api-version version) all-ids credentials out-dir (prepare-state query))))
                (:queries parameters))))
  (log-strings "Finished, total count of requests to facebook api:" @fb-requests-count))

(defn prepare-and-run [datadir]
  (let [ parameters (docker-config/parameters datadir)
        config (docker-config/config datadir)
        action (:action config)
        app-access-token (docker-config/app-access-token datadir)
        out-dir-path (docker-config/out-dir-path datadir)
        credentials (docker-config/user-credentials datadir)]
    (cond
      (empty? credentials) (docker-runtime/user-error "Missing facebook credentials")
      (empty? (:token credentials)) (docker-runtime/user-error "Missing facebook token"))
    (case action
      "debugtoken" (sync-actions/log-debug-token app-access-token credentials nil)
      "accounts" (sync-actions/accounts credentials config)
      "adaccounts" (sync-actions/adaccounts credentials config)
      "igaccounts" (sync-actions/igaccounts credentials config)
      (treat  #(run credentials parameters out-dir-path app-access-token datadir)))))

(defn -main [& args]
  (let [{:keys [options summary errors] :as parsed-args} (parse-opts args cli-options)]
    (cond
      (not-empty errors) (docker-runtime/user-error (string/join \newline errors))
      (empty? (:dataDir options)) (docker-runtime/user-error (usage summary)))
    (prepare-and-run (:dataDir options))))
