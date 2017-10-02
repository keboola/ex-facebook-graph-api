(ns keboola.snapshots.outdirs-check
  (:require [clojure.test :as t :refer :all]
            [cheshire.core :refer [parse-string]])
  (:import java.io.File))


(defn list-dir [path]
  (let [dirs (.listFiles (File. path))]
    (zipmap (map #(.getName %) dirs) dirs)))

(defn filter-dirs [dir]
  (filter #(.isDirectory (second %)) dir))

(defn is-same-ls [expected actual]
  (let [expected-names (keys expected)
        actual-names (keys actual)]
    (is (= (set expected-names) (set actual-names)))))

(defn read-file [path]
  (with-open [r (clojure.java.io/reader path)]
    (doall (line-seq r))))

(defn parse-json [path]
  (let [file-content (slurp path)]
    (parse-string file-content true)))

(defn compare-manifests [expected-path actual-path]
  (let [expected (parse-json expected-path)
        actual (parse-json actual-path)
        expected-pk (:primary_key expected)
        actual-pk (:primary_key actual)
        actual-pk-set (set actual-pk)]
        
    (is (:incremental actual))
    (is (=  (:columns expected) (:columns actual)))
    (is (= (count actual-pk) (count actual-pk-set)))
    (is (= expected-pk actual-pk))))

(defn compare-file-content [[f1 f2]]
  (let [f1path (.getAbsolutePath f1)
        f2path (.getAbsolutePath f2)
        f1-lines (set (read-file f1path))
        f2-lines (set (read-file f2path))
        diff (clojure.set/difference f1-lines f2-lines)]
    #_(println "comparing" f1path "vs." f2path)
    (is (empty? diff) (str "files are not same:" f1path " vs " f2path ". Difference:" diff))))

(defn compare-sliced-dir [expected actual]
  (let [a (sort-by #(.getName %) (.listFiles expected))
        b (sort-by #(.getName %) (.listFiles actual))
        pairs-to-compare (zipmap a b)]
    (is (= (count a) (count b)))
    (doseq [pair pairs-to-compare]
      (compare-file-content pair))))

(defn filter-manifests [dir]
  (into {} (filter #(re-matches #".*\.manifest$" (first %)) dir)))

(defn is-equal [expected-dir actual-dir]
  (let
      [exptected-tables-path (str expected-dir "/out/tables")
       actual-tables-path (str actual-dir "/out/tables")
       ls-expected (list-dir exptected-tables-path)
       ls-actual (list-dir actual-tables-path)]
    (is-same-ls ls-expected ls-actual)
    (doseq [manifest-name (keys (filter-manifests ls-expected))]
      (compare-manifests (ls-expected manifest-name) (ls-actual manifest-name)))
    (doseq [dir-name (keys (filter-dirs ls-expected))]
      (compare-sliced-dir (ls-expected dir-name) (ls-actual dir-name)))))
