(ns keboola.facebook.api.request
  (:require [keboola.http.client :as client])
  )

(def graph-api-url "https://graph.facebook.com/")
(def default-version "v2.8")

(defn get-next-page-url [response]
  (get-in response [:body :paging :next]))

(defn get-response-data [response]
  (get-in response [:body :data])
  )

(defn collect-result [response api-fn]
  (lazy-seq
   (if (get-next-page-url response)
     (concat (get-response-data response)
             (collect-result (api-fn (get-next-page-url response)) api-fn)))))


(defn make-url [path & {:keys [version]}]
  (str graph-api-url (or version default-version) "/" path))


(defn get-request [access-token path & {:keys [query version]}]
  (let [query-params (assoc query :access_token access-token)
        request-fn (fn [url] (client/GET url :query-params query-params :as :json))]
      (collect-result
       (request-fn (make-url path :version version))
       request-fn
       )))
