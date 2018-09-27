(ns keboola.docker.state
  (:require [cheshire.core :refer [generate-string parse-string]]
            [clojure.string :refer [trim]]
            [keboola.docker.state-protocol :as protocol]
            [keboola.docker.config :refer [default-dir check-path]]))

(defrecord NoopState []
  protocol/IState
  (load [this content-path] {})
  (save [this content content-path] nil))

(defrecord JsonFileState [dir-path root-content-path]
   protocol/IState
  (load [this content-path]
    (let [path (str (check-path  (:dir-path this)) "in/state.json")
          file-exists (.exists (java.io.File. path))
          file-content (if file-exists (slurp path) "{}")
          state-path (concat (:root-content-path this) content-path)
          parsed-state (parse-string file-content true)]
      (get-in parsed-state state-path)))
  (save [this content content-path]
    (let [path (str (check-path  (:dir-path this)) "out/state.json")
          file-exists (.exists (java.io.File. path))
          file-content (if file-exists (slurp path) "{}")
          state-path (concat (:root-content-path this) content-path)
          parsed-state (parse-string file-content true)
          updated-content (assoc-in parsed-state state-path content)]
      (spit path (generate-string updated-content)))))

(defn make-json-state-file
  ([use-state? root-content-path dir-path]
   (if use-state?
     (JsonFileState. dir-path root-content-path)
     (NoopState.))))
