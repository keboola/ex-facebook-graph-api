(ns keboola.http.client
  (:require [clj-http.client :as http]
            [clojure.string :as str]
            [keboola.http.recording :refer [record-request]]
            [keboola.docker.runtime :as runtime]))

(def MAX_TRY_COUNT 4)

(def fb-requests-count (atom 0))

; retry handler for IOExceptions
(defn retry-handler [ex try-count http-context]
  (if (> MAX_TRY_COUNT try-count)
    (do
      (Thread/sleep (* 1000 (Math/pow try-count 2)))
      (runtime/log-strings "retrying request[" (str try-count) "]")
      true)
    ; else return false
    false))

(defn check-fb-requests [url]
  (if (str/starts-with? url "https://graph.facebook.com")
    (do
      (swap! fb-requests-count inc)
      (if (= 0 (mod @fb-requests-count 500)) (runtime/log-strings "Made" @fb-requests-count "requests to facebook api so far.")))))

(defn- make-request [method url & rest]
  (check-fb-requests url)
  (method url (assoc (apply hash-map rest) :retry-handler retry-handler)))

(defn GET [url & rest]
  (let [response (apply make-request http/get url rest)]
    (record-request response :get url rest)))
    ; (println "response" response)


(defn POST [url & rest]
  (let [response (apply make-request http/post url rest)]
    (record-request response :post url rest)))
