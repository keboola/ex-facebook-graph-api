(ns keboola.facebook.api.request
  (:require [keboola.http.client :as client])
  )

(def graph-api-url "https://graph.facebook.com/")
(def default-version "v2.8")

(defn get-next-page-url [response]
  ;(println "NEXT" (-> response type))
  (get-in response [:paging :nextr]))

(defn get-response-data [response]
  (get-in response [:data])
  )

(defn collect-result [response api-fn]
                                        ;(println (keys response) (:body (api-fn (get-next-page-url response))))
  (lazy-seq
   (if (get-next-page-url response)
     (concat (get-response-data response)
             (collect-result
              (:body (api-fn (get-next-page-url response)))
              api-fn
              )))))


(defn make-url [path & {:keys [version]}]
  (str graph-api-url (or version default-version) "/" path))


(defn get-request [access-token path & {:keys [query version]}]
  (let [query-params (assoc query :access_token access-token)
        request-fn (fn [url] (client/GET url :query-params query-params :as :json))]
    (collect-result
     (request-fn (make-url path :version version))
     request-fn
     )))


(defn get-nested-objects [body-data]
  (reduce
   (fn [memo, row]
     (if-let [
              object
              (reduce-kv (fn [m k v] (if (map? v) (hash-map :name k :data v) m)) nil row)]
       (conj memo (assoc object :id (:id row)))
       memo))
   [] body-data)
  )

(defn filter-values [row params]
  (reduce-kv (fn [memo k v]
               (if (-> v map? not)
                 (assoc memo k v )
                 memo)
               ) {:keboola params} row)
  ;(filter #(-> % second map? not) body-data)
  )


(defn page-and-collect [{:keys [request-id parent-id parent-type body-name body-data api-fn response] :as params} ]
  ;; (println
  ;;  (type body-data)
  ;;  body-name
  ;;  parent-type
  ;;  (set (flatten (map keys body-data)))
  ;;  parent-id
  ;;  request-id
  ;;  )
  (lazy-seq
   (concat
    (map #(filter-values % (dissoc params :body :api-fn)) body-data )
    (map (fn [nested-object]
              (page-and-collect (assoc params
                                       :parent-id (:id nested-object)
                                       :parent-type (str parent-type "_" (name (:name nested-object)))
                                       :body-name (name (:name nested-object))
                                       :body-data (:data (:data nested-object))
                                       :response (:data nested-object)
                                       )))
            (get-nested-objects body-data))
    (if (get-next-page-url response)
      (let [new-response (:body (api-fn (get-next-page-url response)))]
          (do
            ;;(println "PAGING" (get-next-page-url response))
            (page-and-collect (assoc params
                                     :body-data (:data new-response)
                                     :response new-response
                                     ))))
      )
    ;(map #(page-and-collect) (collect-fn request-id parent-id parent-type ))
    ;(page-and-collect this-params next-page)
    )))

(defn nested-request [access-token path & {:keys [query version]}]
  (let [query-params (assoc query :access_token access-token :method "GET")
        full-url (make-url path :version version)
        request-fn (fn [url] (client/POST url :form-params query-params :as :json))
        response (request-fn full-url)
        ]
                                        ;(println (map #(first %) (:body response)))
    (map
     #(hash-map
       :account-id (first %)
       :data (page-and-collect {:request-id "pokus"
                                :parent-id (first %)
                                :parent-type "account"
                                :body-name "account"
                                :body-data [(second %)]
                                :response (:body response)
                                :api-fn (fn [url] (client/GET url :query-params {:access_token access-token} :as :json))}
              ))
     (:body response))))
