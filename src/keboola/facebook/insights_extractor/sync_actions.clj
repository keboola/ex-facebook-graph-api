(ns keboola.facebook.insights-extractor.sync-actions
  (:require [keboola.facebook.api.request :as request]
            [cheshire.core :refer [generate-string]]
            [slingshot.slingshot :refer [try+ throw+]]
            [keboola.docker.runtime :refer [log]]))

(def log-token? (atom true))
(defn disable-log-token [] (reset! log-token? false))

(defn accounts [credentials config]
  (let [token (:token credentials)
        accounts (mapv #(dissoc % :access_token) (request/get-accounts token))]
    (log (generate-string accounts))))


(defn adaccounts [credentials config]
  (let [token (:token credentials)
        accounts (request/get-adaccounts token)]
    (log (generate-string accounts))))

(defn log-debug-token [app-token credentials prepend-message]
  (try+
   (if @log-token?
     (let [input-token (:token credentials)
           response-data (:data (request/debug-token app-token input-token))
           result (dissoc response-data :app_id)]
       (log (str prepend-message (generate-string result)))))
   (catch Object e
     (log (generate-string {:message "Failed to log token info" :error e})))
   ))
