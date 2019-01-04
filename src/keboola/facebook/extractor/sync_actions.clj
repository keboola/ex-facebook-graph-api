(ns keboola.facebook.extractor.sync-actions
  (:require [keboola.facebook.api.request :as request]
            [cheshire.core :refer [generate-string]]
            [slingshot.slingshot :refer [try+ throw+]]
            [keboola.docker.config :as docker-config]
            [keboola.docker.runtime :refer [log]]))

(def log-token? (atom true))
(defn disable-log-token [] (reset! log-token? false))

(defn accounts [credentials config]
  (try+
   (let [token (docker-config/get-fb-token credentials)
         version (-> config :parameters :api-version)
         accounts (mapv #(dissoc % :access_token) (request/get-accounts token :version version))]
     (log (generate-string accounts)))
   (catch Object e
     (log (generate-string {:code (:status e 500) :error (:body e)})))))


(defn adaccounts [credentials config]
  (try+
   (let [token (docker-config/get-fb-token credentials)
         version (-> config :parameters :api-version)
         accounts (request/get-adaccounts token :version version)]
     (log (generate-string accounts)))
   (catch Object e
     (log (generate-string {:code (:status e 500) :error (:body e)}))))
  )

(defn igaccounts [credentials config]
  (try+
   (let [token (docker-config/get-fb-token credentials)
         version (-> config :parameters :api-version)
         accounts (request/get-igaccounts token :version version)
         ig-accounts (filter #(contains? % :instagram_business_account) accounts)
         result (map #(assoc (select-keys % [:name :category]) :id (-> % :instagram_business_account :id) :fb_page_id (:id %)) ig-accounts)]
     (log (generate-string result)))
   (catch Object e
     (log (generate-string {:code (:status e 500) :error (:body e)}))))
  )


(defn log-debug-token [app-token credentials prepend-message]
  (try+
   (if @log-token?
     (let [input-token (docker-config/get-fb-token credentials)
           response-data (:data (request/debug-token app-token input-token))
           result (dissoc response-data :app_id)]
       (log (str prepend-message (generate-string result)))))
   (catch Object e
     (log (generate-string {:message "Failed to log token info" :error (:body e)})))))
