#!/usr/bin/env boot
(set-env!
 :source-paths #{"src" "test"}
 :dependencies '[
                 [org.clojure/clojure "1.9.0-alpha14"]
                 [cheshire "5.6.3"]
                 [clj-http "3.3.0"]
                 [clojure-csv/clojure-csv "2.0.1"]
                 [org.clojure/tools.cli "0.3.5"]
                 [semantic-csv "0.1.0"]
                 [org.clojure/test.check "0.9.0"]
                 [org.clojure/core.async "0.2.395"]
                 [adzerk/boot-test "1.1.2" :scope "test"]
                 [clj-time "0.12.2"]
                 ])
(require '[keboola.facebook.insights-extractor.core])
(require '[adzerk.boot-test :refer :all])
(deftask run-insights
  "run insights extractor"
  [x args VAL  str "arguments string for main- function"]
  (if-not args
    (do (boot.util/fail "arguments string x is requried. ")
        (*usage*)))
  ((resolve 'keboola.facebook.insights-extractor.core/-main) args)
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
