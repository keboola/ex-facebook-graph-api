(ns keboola.http.client
  (:require [clj-http.client :as http]
            ))

(def MAX_TRY_COUNT 4)

; retry handler for IOExceptions
(defn- retry-handler [ex try-count http-context]
  (Thread/sleep (* 1000 (Math/pow try-count 2)))
  (if (> MAX_TRY_COUNT try-count) true false)
  )

(defn- make-request [method url & rest]
  ;(println url rest (assoc (apply hash-map rest) :retry-handler
                                        ;retry-handler))
  ; (println rest)
  (method url (assoc (apply hash-map rest) :retry-handler retry-handler))
  )

(defn GET [url & rest]
  (apply make-request http/get url rest)
  )


;(def memo-create-client (memoize http/create-client))

; (def memo-create-client (memoize http/create-client))

;; (defn default-client
;;   "makes a default async client for the http comms"
;;   []
;;   (memo-create-client :follow-redirects false :request-timeout -1))
