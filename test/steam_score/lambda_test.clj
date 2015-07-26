(ns steam-score.lambda-test
  (:require [clojure.test :refer :all]
            [steam-score.lambda :refer :all])
  (:import [steam-score.lambda.GameAchievementPercentages]
           [com.amazonaws.services.lambda.runtime RequestStreamHandler]))

(deftest lambda-exists
  (testing "has the right interface"
    (is (instance?
          com.amazonaws.services.lambda.runtime.RequestStreamHandler
          (new steam-score.lambda.GameAchievementPercentages)))))
