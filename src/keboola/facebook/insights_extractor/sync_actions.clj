(ns keboola.facebook.insights-extractor.sync-actions
  (:require [keboola.facebook.api.request :as request]
            [cheshire.core :refer [generate-string]]
            [keboola.docker.runtime :refer [log]])
  )


(defn accounts [credentials config]
  (let [token (:token credentials)
        accounts (mapv #(dissoc % :access_token) (request/get-accounts token))]
    (log (generate-string accounts))))


(defn adaccounts [credentials config]
  (let [token (:token credentials)
        accounts (request/get-adaccounts token)]
    (log (generate-string accounts))))

(defn debug-token [app-token credentials]
  (let [input-token (:token credentials)
        response-data (:data (request/debug-token app-token input-token))
        result (dissoc response-data :app_id)]
      (log (generate-string result))))
