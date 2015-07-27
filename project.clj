(defproject steam-score "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/data.json "0.2.6"]
                 [org.clojure/test.check "0.7.0"]
                 [uswitch/lambada "0.1.0"]
                 [amazonica "0.3.29"]]
  :main ^:skip-aot steam-score.core
  :target-path "target/%s"
  :uberjar-name "steam-score-lambda.jar"
  :profiles {:uberjar {:aot :all}
             :test {:aot [steam-score.lambda]}})
