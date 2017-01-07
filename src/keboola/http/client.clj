(ns keboola.http.client
  (:require [clj-http.client :as http]
            [clojure.string :as str]
            [keboola.docker.runtime :as runtime]))

(def MAX_TRY_COUNT 4)

(def fb-requests-count (atom 0))

; retry handler for IOExceptions
(defn- retry-handler [ex try-count http-context]
  (Thread/sleep (* 1000 (Math/pow try-count 2)))
  (if (> MAX_TRY_COUNT try-count) true false))

(defn check-fb-requests [url]
  (if (str/starts-with? url "https://graph.facebook.com")
    (do
      (swap! fb-requests-count inc)
      (if (= 0 (mod @fb-requests-count 500)) (runtime/log-strings "Made" @fb-requests-count "requests to facebook api so far.")))))

(defn- make-request [method url & rest]
  (check-fb-requests url)
  (method url (assoc (apply hash-map rest) :retry-handler retry-handler))
  )

(defn GET [url & rest]
  ;(println "paging")
  (apply make-request http/get url rest)
  )

(defn POST [url & rest ]
  (apply make-request http/post url rest)
  )

;(def memo-create-client (memoize http/create-client))

; (def memo-create-client (memoize http/create-client))

;; (defn default-client
;;   "makes a default async client for the http comms"
;;   []
;;   (memo-create-client :follow-redirects false :request-timeout -1))
