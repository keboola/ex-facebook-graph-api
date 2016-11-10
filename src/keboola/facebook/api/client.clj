(ns keboola.facebook.api.client
  (:require [keboola.http.client :as http])
  )

(def graph-api-url "https://graph.facebook.com/")
(def default-version "v2.8")

(defn get-next-page-url [response]
  (get-in response [:body :paging :next]))

(defn get-response-data [response]
  (get-in response [:body :data])
  )

(defn collect-result [response]
  (lazy-seq
   (if (get-next-page-url response)
     (concat (get-response-data response)
             (collect-result (http/GET (get-next-page-url response)))))))


(defn make-url [path & {:keys [version]}]
  (str graph-api-url (or version default-version) "/" path))


(defn get-request [access-token path & {:keys [query version]}]
  (collect-result
   (http/GET
    (make-url path :version version)
    :query-params (assoc query :access_token token)
    )))
