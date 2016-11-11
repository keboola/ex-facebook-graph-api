(ns keboola.utils.json-to-csv
  (:require [semantic-csv.core :as csv]
            ))

(defn write [path header body]
  (csv/spit-csv path {:header header} body)
  )
