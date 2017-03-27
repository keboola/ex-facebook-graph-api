(ns keboola.regression-tests.core
  (:require [keboola.http.client :refer [GET]]
            [keboola.http.recording :refer [reset-recording recording save-current-recording turn-recording-on turn-recording-off]]
            [keboola.facebook.insights-extractor.core :refer [prepare-and-run]]
            [keboola.docker.config :refer [user-credentials]]
            [keboola.facebook.insights-extractor.output :refer [reset-columns-map]]
            [keboola.test-utils.core :as test-utils]
            [clojure.test :as t :refer :all]
            [clostache.parser]
            [clj-http.fake :refer [with-global-fake-routes-in-isolation]]))

#_(deftest foo-test
  (with-global-fake-routes-in-isolation
    apicalls
    (println (GET "https://google.com/apps/ab" :query-params {:path "feed",
       :fields
       "caption,message,created_time,type,description,likes{name,username},comments{message,created_time,from,likes{name,username}}",
       :ids "177057932317550",
       :access_token "XXTOKENXX",
       :since "",
       :until ""}))))

(defn create-test-file [dir-path ns-name recording-ns test-name]
  (let [test-file-path (str dir-path "/" "test" "_" test-name ".clj")
        test-ns (str ns-name ".test-" test-name)
        template {:ns-name test-ns
                  :apicalls-ns recording-ns
                  :test-name test-name
                  :dir-path dir-path}
        test-content-template (slurp "test/keboola/regression_tests/template.mustache")
        test-file-content (clostache.parser/render test-content-template template)]
    (with-open [w (clojure.java.io/writer test-file-path)]
      (.write w test-file-content))))

(defn generate-test [dirname]
  (let [clj-compliant-name (clojure.string/replace dirname #"_" "-")
        ns-name (str "keboola.regression-tests." clj-compliant-name)
        dir-path (str "test/keboola/regression_tests/" dirname)
        recording-path (str "test/keboola/regression_tests/" dirname "/apicalls.clj")
        recording-ns (str ns-name ".apicalls")
        ]
    (turn-recording-on)
    (reset-recording)
    (reset-columns-map)
    (prepare-and-run dir-path)
    (save-current-recording recording-path recording-ns (:token (user-credentials dir-path)))
    (create-test-file dir-path ns-name recording-ns clj-compliant-name)
    (turn-recording-off)))
