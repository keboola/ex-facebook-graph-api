(ns keboola.facebook.api.csv-writer)

(def writers (atom {}))

(defn write-csv []
  nil
  )

(defn- create-new-writer [name params]
  {
   :filepath "out-path/myquery_posts - out-path/parse-id_body-name"
   :parent-id: "parent-id xxx_yyy"
   :parent-type: "parent-type account_posts"
   :parse-fields true; dont write to csv only parse fields
   :fields {}; csv header
   :update-fn #(swap! writers assoc name %)
   :channel nil;(chan)
   }
  )

(defn get-writer [name params]
  (let [writer (@writers name)]
    (if (some? writer)
      writer
      ((swap! writers assoc name (create-new-writer name params)) name))))
