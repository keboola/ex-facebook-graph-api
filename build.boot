#!/usr/bin/env boot
(set-env!
 :source-paths #{"src" "test"}
 :dependencies '[[adzerk/boot-test "1.2.0" :scope "test"]
                 [seancorfield/boot-tools-deps "0.1.4"]
                 ])

(require '[adzerk.boot-test :as boot-test]
         '[boot-tools-deps.core :refer [deps]])

(deftask test
  "Runs tests"
  []
  (comp (deps :aliases [:test])
        (boot-test/test)))

(deftask run-extractor
  "run extractor"
  [x args VAL  str "arguments string for main- function"]
  (comp
   (deps)
   (if-not args
     (do (boot.util/fail "arguments string x is requried. ")
         (*usage*))))
  (require '[keboola.facebook.extractor.core])
  ((resolve 'keboola.facebook.extractor.core/-main) args))

(deftask generate-test
  "given data dir with config.json, this task runs extraktor,
record api calls, create snapshot tests with recrded api calls and compare result dirs"
  [d data VAL str "name of directory in test/keboola/snapshots containing config.json"
   s skip-token    bool "skip token anonymization in config.json"]
  (if-not data
    (do (boot.util/fail "arguments string d is requried. ")
        (*usage*)))
  (require '[keboola.snapshots.core])
  ((resolve 'keboola.snapshots.core/generate-test) data (not skip-token)))

(deftask regenerate-snapshots [f dirfilter VAL str "regexp to filter dirs to process"]
  (require '[keboola.snapshots.core])
  ((resolve 'keboola.snapshots.core/regenerate-all-snapshot-dirs) dirfilter))

(deftask build
  "Builds an uberjar extractor that can be run with java -jar"
  []
  (comp
   (deps)
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
