(ns keboola.facebook.extractor.query-parser
  (:gen-class)
  (:require
   [clojure.string :as s]
   [clojure.data.json :as json])
  (:import [java.time LocalDate]
           [java.time.format DateTimeFormatter]))


;; Parses the parameters string into a map.
(defn parse-parameters [params-str]
  (if (empty? params-str)
    {}
    (->> (s/split params-str #"&")
         (map #(s/split % #"=" 2))
         (map (fn [[k v]] [k v]))
         (into {}))))

;; Parses the time_ranges parameter into a vector of maps.
(defn parse-time-ranges [time-ranges-str]
  (if (empty? time-ranges-str)
    []
    (let [json-str (s/replace time-ranges-str #"'" "\"")]
      (json/read-str json-str :key-fn keyword))))

;;  Generates a sequence of dates from start-date to end-date exclusive
(defn date-range [start-date end-date]
  (let [formatter (DateTimeFormatter/ofPattern "yyyy-MM-dd")
        start (LocalDate/parse start-date formatter)
        end (LocalDate/parse end-date formatter)]
    (cond
      ;; If start date is before end date, return dates up to but not including end date
      (.isBefore start end)
      (take-while (fn [date] (.isBefore date end))
                  (iterate #(.plusDays % 1) start))
      ;; If start date equals end date, return a sequence containing that date
      (.isEqual start end)
      [start]
      ;; If start date is after end date, return an empty sequence
      :else
      [])))

;; Generates a list of time ranges for each day within the given date range.
(defn generate-date-ranges [start-date end-date]

  (let [dates (date-range start-date end-date)]
    (map (fn [date]
           {:since (.toString date)
            :until (.toString date)})
         dates)))

;; Expands all time ranges into individual day ranges.
(defn expand-time-ranges [time-ranges]
  (mapcat (fn [time-range]
            (generate-date-ranges (:since time-range) (:until time-range)))
          time-ranges))

;; Generates a new parameters string with the updated time_range.
(defn generate-parameters-for-dates [parameters-map time-range]
  (let [time-ranges-json (json/write-str [time-range] :value-fn (fn [k v] (if (string? v) v (str v))))
        ;; Replace double quotes with single quotes
        time-ranges-json-single-quotes (s/replace time-ranges-json #"\"" "'")
        params-with-new-time-range (-> parameters-map
                                       (dissoc "date_preset")
                                       (assoc "time_ranges" time-ranges-json-single-quotes))]
    (->> params-with-new-time-range
         (map (fn [[k v]] (str k "=" v)))
         (s/join "&"))))

;;  Converts date_preset values to the number of days.
(defn date-preset-to-days [date-preset]
  (case date-preset
    "last_3d" 3
    "last_7d" 7
    "last_30d" 30
    nil))

;;"Returns the date string for 'days' days ago from the given reference date.
;; If reference-date is not provided, uses LocalDate/now."
(defn get-past-date
  ([days]
   (get-past-date days (LocalDate/now)))
  ([days reference-date]
   (let [formatter (DateTimeFormatter/ofPattern "yyyy-MM-dd")]
     (.format (.minusDays reference-date days) formatter))))