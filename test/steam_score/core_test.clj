(ns steam-score.core-test
  (:require [clojure.test :refer :all]
            [steam-score.core :refer :all]))

(deftest handler-fn
  (testing "returns results"
    (is (=
          {:status "ok"}
          (handle-event {:a :map})))))
