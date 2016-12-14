(ns keboola.facebook.insights-extractor.sync-actions
  (:require [keboola.facebook.api.request :as request])
  )

(defn accounts [credentials config]
  (let [token (:token credentials)]
    (mapv #(dissoc % :access_token) (request/get-accounts token))))
