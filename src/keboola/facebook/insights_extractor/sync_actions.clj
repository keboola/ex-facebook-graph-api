(ns keboola.facebook.insights-extractor.sync-actions
  (:require [keboola.facebook.api.request :as request]
            [cheshire.core :refer [generate-string]]
            [keboola.docker.runtime :refer [log]])
  )


(defn accounts [credentials config]
  (let [token (:token credentials)
        accounts (mapv #(dissoc % :access_token) (request/get-accounts token))]
    (log (generate-string accounts))))
