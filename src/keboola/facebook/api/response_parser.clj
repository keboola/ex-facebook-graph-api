(ns keboola.facebook.api.response-parser)



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
