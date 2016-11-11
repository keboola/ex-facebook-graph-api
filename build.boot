#!/usr/bin/env boot
(set-env!
 :source-paths #{"src" "test"}
 :dependencies '[
                 [org.clojure/clojure "1.8.0"]
                 [cheshire "5.6.3"]
                 [clj-http "3.3.0"]
                 [clojure-csv/clojure-csv "2.0.1"]
                 [semantic-csv "0.1.0"]
                 ])
(deftask feed
  "blabla"
  []
  (println "Test feed")
  "asdasdasd"
  )

(deftask start-docker-repl
  "run repl server on 1111 port"
  []
  (require 'boot.repl)
  (swap! boot.repl/*default-dependencies*
         concat '[[cider/cider-nrepl "0.15.0-SNAPSHOT"]])
  (swap! boot.repl/*default-middleware*
         conj 'cider.nrepl/cider-middleware)
  (repl :bind "0.0.0.0" :port 1111)
  )

(defn -main [& args]
  (println "Hello Tomas"))
