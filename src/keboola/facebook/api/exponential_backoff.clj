(ns keboola.facebook.api.exponential-backoff
  (:require [keboola.docker.runtime :as runtime]))

(def time-slot-ms 1000)
(def truncate 6) ; sleep for 64 seconds at most (2^6)
(def MAX_WAIT_TIME (* 1000 60 60 24)) ; poll for 24 hours at most

(defn with-exp-backoff [action!]
  (loop [c 0
         waited 0]
    (let [slot (* time-slot-ms (dec (Math/pow 2 c)))]
      (when (> waited MAX_WAIT_TIME)
        (runtime/user-error (str "Polling timeout exceeded:" waited)))
      (Thread/sleep slot)
      (when (not (action!))
        (recur (if (>= c truncate) c (inc c)) (+ waited slot))))))

(defn- try-n-times [f n]
  (if (zero? n)
    (f)
    (try
      (f)
      (catch Throwable _
        (Thread/sleep (* 1000 10))
        (try-n-times f (dec n))))))

(defn try-3-times [f]
  (try-n-times f 3))
