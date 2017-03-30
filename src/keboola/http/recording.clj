(ns keboola.http.recording
  (:require [clojure.walk :refer [postwalk postwalk-demo]]
            [cheshire.core :refer [generate-string]]
            ))

(def recording (atom '()))
(def do-recording? (atom false))

(defn reset-recording [] (reset! recording '()))

(defn turn-recording-on [] (reset! do-recording? true))
(defn turn-recording-off [] (reset! do-recording? false))

(def VALID-CHARS
(map char (concat (range 48 58) ; 0-9
(range 66 91) ; A-Z
(range 97 123)))) ; a-z

(defn random-char []
(nth VALID-CHARS (rand (count VALID-CHARS))))

(defn random-str [length]
  (apply str (take length (repeatedly random-char))))


(def keywords-to-anonymize #{:name :story :caption :message :description :title})
(defn- anonymize-item [item]
  (if (and
       (vector? item)
       (= (count item) 2)
       (keywords-to-anonymize (first item)))
    ;return anonymized string value for key value pair where key is
    ;from keywords-to-anonymize
    [(first item) (random-str 5)]
    ; else return item untouched
    item))

(defn anonymize-map [m]
  (postwalk anonymize-item m))

(defn record-request [response method url request-rest]
  #_(println (pr-str request-rest))
  (if @do-recording?
    (let [request-base {:method method :address url}
          request (merge request-base (apply hash-map request-rest))
          anonymized-response (update-in response [:body] anonymize-map)
          body-string-response (update-in anonymized-response [:body] generate-string)]
      (swap! recording conj {:response body-string-response
                             :request request})
      anonymized-response)
    response))

(defn replace-token [item token]
  (if (string? item)
    (clojure.string/replace item token "XXTOKENXX")
    item))

(defn pprint [what]
  (with-out-str (clojure.pprint/pprint what)))

(defn prepare-recording [token]
  (apply str (mapcat (fn [r]
                       (let [request (postwalk #(replace-token % token) (:request r))
                             response (postwalk #(replace-token % token) (:response r))]
                         [(pprint request)
                          (str "(fn [req]" (pprint response) ")")]))
                     @recording)))

(defn save-current-recording [path namespace-name token-to-replace]
  (let [ns-str (str "(ns " namespace-name ")\n")
        recording-str (str "\n{\n" (prepare-recording token-to-replace) "\n}")]
    (with-open [w (clojure.java.io/writer path)]
      (.write w (str ns-str (str "(def recorded " recording-str ")"))))
    ))
