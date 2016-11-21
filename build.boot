#!/usr/bin/env boot
(set-env!
 :source-paths #{"src" "test"}
 :dependencies '[
                 [org.clojure/clojure "1.8.0"]
                 [cheshire "5.6.3"]
                 [clj-http "3.3.0"]
                 [clojure-csv/clojure-csv "2.0.1"]
                 [org.clojure/tools.cli "0.3.5"]
                 [com.taoensso/timbre "4.7.4"]
                 [semantic-csv "0.1.0"]
                 [org.clojure/core.async "0.2.395"]
                 ])

(deftask run-insights
  "run insights extractor"
  [d datadir path str "data directory path"]
  (if-not datadir
    (do (boot.util/fail "data directory path is requried. ")
        (*usage*)))
  ((resolve 'keboola.facebook.insights-extractor.core/-main) datadir)
  )

(deftask build-insights
  "Builds an uberjar of insights extractor that can be run with java -jar"
  []
  (comp
   (aot :all true)
   (pom :project 'exinsights
        :version "0.0.1")
   (uber)
   (jar :main 'keboola.facebook.insights-extractor.core)
   (target :dir #{"targetinsights"})))

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
