(ns keboola.facebook.api.parser)


(defn reduce-result-sequence
  "traverse response from nested-request
  and calls given reducer reduceFn(item, memo) for each
  item in the response sequence.
  The response sequence(@data) is a sequence of either maps or seqs"
  [data reduce-fn & init-memo]
  (loop [item (first data)
         coll (rest data)
         memo (if (some? init-memo) (apply identity init-memo))]
    (cond
      (:stop memo) memo
      (map? item) (recur (first coll) (rest coll) (reduce-fn item memo))
      (sequential? item) (recur (first item) (concat (rest item) coll) memo)
      :else memo
      )))

;;;;********REDUCER Functions****
;;; use them as a param for reduce-result-sequence
;;; e.g (reduce-result-sequence data analyze)


(defn analyze
  "reducer fn - analyze items, returns all parent-types and tables columns used
  result {:parent-types <set_of_parent_types> :columns <map_of_tables_with_columns>}"
  [item memo]
  (let [
        parent-types (:parent-types memo {})
        parent-type-name (-> item :keboola :parent-type)
        parent-type-count (parent-types parent-type-name 0)]
    (get-columns item
     (assoc memo :parent-types (assoc parent-types parent-type-name (inc parent-type-count))))))


(defn get-columns
  "reducer fn - extract all columns used in items for each table used
  result sample: {:columns {posts: #{id, message, story, create_time}}}"
  [item memo]
  (let [
        table-row (dissoc item :keboola)
        table-name (-> item :keboola :table-name)
        columns (:columns memo {})
        table-columns (columns table-name #{})
        new-table-columns (clojure.set/union table-columns (into #{} (keys table-row)))
        new-columns (assoc columns table-name new-table-columns)
        ]
    (assoc memo :columns new-columns )))

(defn get-x-items
  "reducer fn - extracts x number of items and returns them under :items keyword.
  if x == 0 then never stop
  result: {:cnt <parsed_items_count> :stop true :items <lazy_seq_of_items>}"
  [x item memo]
  (if-let [cnt (:cnt memo)]
    (cond
      (= x cnt) (assoc memo :stop true :items (cons item (:items memo) ))
      :else  (assoc memo :cnt (inc cnt) :stop false :items (cons item (:items memo))))
    {:cnt 1 :stop false :items (lazy-seq)}))

(defn stop-after-x-items
  "reducer fn - make reducing fn stop after x items extracted.
  if x == 0 then never stop
  result: {:cnt <parsed_items_count> :stop true}"
  [x item memo]
  (if-let [cnt (:cnt memo)]
    (cond
      (= x cnt) (assoc memo :stop true )
      :else  (assoc memo :cnt (inc cnt) :stop false ))
    {:cnt 1 :stop false}))


(defn chain-fns
  "reducer fn - chains reducer fns and passes curent memo
  example: (chain-fns (partial stop-after-x-times 4) analyze) - will cala analyze on 4 items"
  [& fns]
  (fn [item memo]
    (loop [f (first fns)
           rest-fns (rest fns)
           current-memo memo
           ]
      (if (nil? f) current-memo
          (recur (first rest-fns) (rest rest-fns) (f item current-memo))))))


(defn reduce-and-analyze
  "reduce-sequence-result called with chained analyze and stop-after-x-items
  returns analyzed sequenced data same as analyze reduce fn"
  [data & max-items-count]
  (let [max-count (if (some? max-items-count) (apply identity max-items-count) 0)
        reduce-fn (chain-fns (partial stop-after-x-items max-items-count) analyze)]
    (reduce-result-sequence data reduce-fn)))

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
