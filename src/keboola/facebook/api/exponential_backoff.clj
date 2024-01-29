(ns keboola.facebook.api.exponential-backoff
  (:require [keboola.docker.runtime :as runtime]))

(def time-slot-ms 100)
(def truncate 5)
(def MAX_WAIT_TIME (* 1000 60 60 2))

(defn with-exp-backoff [action!]
  (loop [c 0
         waited 0]
    (let [slot (* time-slot-ms (dec (Math/pow 2 c)))]
      (when (> waited MAX_WAIT_TIME)
        (runtime/user-error "Polling timeout exceeded:" waited))
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
