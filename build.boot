#!/usr/bin/env boot
(set-env!
 :source-paths #{"src" "test"}
 :dependencies '[
                 [org.clojure/clojure "1.9.0-beta1"]
                 [cheshire "5.8.0"]
                 [clj-http "3.7.0"]
                 [clojure-csv/clojure-csv "2.0.1"]
                 [de.ubercode.clostache/clostache "1.4.0"]
                 [org.clojure/tools.cli "0.3.5"]
                 [semantic-csv "0.2.0"]
                 [org.clojure/data.csv "0.1.4"]
                 [org.clojure/test.check "0.9.0"]
                 [org.clojure/core.async "0.3.443"]
                 [adzerk/boot-test "1.2.0" :scope "test"]
                 [clj-http-fake "1.0.3"]
                 [slingshot "0.12.2"]
                 [clj-time "0.14.0"]])

(require '[keboola.facebook.extractor.core])
(require '[keboola.snapshots.core])
(require '[adzerk.boot-test :refer :all])

(deftask run-extractor
  "run extractor"
  [x args VAL  str "arguments string for main- function"]
  (if-not args
    (do (boot.util/fail "arguments string x is requried. ")
        (*usage*)))
  ((resolve 'keboola.facebook.extractor.core/-main) args))

(deftask generate-test
  "given data dir with config.json, this task runs extraktor,
record api calls, create snapshot tests with recrded api calls and compare result dirs"
  [d data VAL str "name of directory in test/keboola/snapshots containing config.json"
   s skip-token    bool "skip token anonymization in config.json"]
  (if-not data
    (do (boot.util/fail "arguments string d is requried. ")
        (*usage*)))
  ((resolve 'keboola.snapshots.core/generate-test) data (not skip-token)))

(deftask regenerate-snapshots [f dirfilter VAL str "regexp to filter dirs to process"]
  ((resolve 'keboola.snapshots.core/regenerate-all-snapshot-dirs) dirfilter))

(deftask build
  "Builds an uberjar extractor that can be run with java -jar"
  []
  (comp
   (aot :all true)
   (pom :project 'ex-fb-graph-api
        :version "1.0")
   (uber)
   (jar :main 'keboola.facebook.extractor.core)
   (target :dir #{"target"})))

(deftask start-docker-repl
  "run repl server on 1111 port"
  []
  (require 'boot.repl)
  (swap! boot.repl/*default-dependencies*
         concat '[[cider/cider-nrepl "0.15.1"]])
  (swap! boot.repl/*default-middleware*
         conj 'cider.nrepl/cider-middleware)
  (repl :bind "0.0.0.0" :port 1111)
  )

(defn -main [& args]
  (println "Hello Tomas"))
