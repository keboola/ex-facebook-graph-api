(ns keboola.facebook.api.parser)


(defn reduce-result-sequence [data reduce-fn & init-memo]
  (loop [item (first data)
         coll (rest data)
         memo (if (some? init-memo) (apply identity init-memo))]
    (do
      (cond
        (:stop memo) memo
        (map? item) (recur (first coll) (rest coll) (reduce-fn item memo))
        (sequential? item) (recur (first item) (concat (rest item) coll) memo)
        :else memo
        ))
    ))


(defn get-x-items [x item memo]
  (if-let [cnt (:cnt memo)]
    (cond
      (= x cnt) (assoc memo :stop true :items (cons item (:items memo) ))
      :else  {:cnt (inc cnt) :stop false :items (cons item (:items memo))})
    {:cnt 1 :stop false :items (lazy-seq)}
    )
  )




(defn parse-and-write [
                       {:keys
                        [
                         parse-id
                         parent-id
                         parent-type
                         body-name
                         body-data
                         out-path
                         ]}]
  ;; get or create channel(name)
  ;; while body data
  ;; get one row
  ;; filter row strings only and put to channell
  ;; if row contains object then recur parse(objectName, rowId, parent-type_name, object)

  nil
  )
