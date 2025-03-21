(defproject org.clojars.john-shaffer/lein-tools-deps "0.4.6-1"
  :description "Leiningen plugin to load :dependencies from deps.edn instead."
  :url "https://github.com/insilica/lein-tools-deps"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/tools.deps.alpha "0.7.541"]]
  ;:plugins [[thomasa/mranderson "0.4.8"]]
  :eval-in-leiningen true
  :min-lein-version "2.8.1")
