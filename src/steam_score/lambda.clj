(ns steam-score.lambda
  (:require [uswitch.lambada.core :refer [deflambdafn]]
            [steam-score.core :refer [handle-event]]
            [clojure.data.json :as json]
            [clojure.java.io :as io]))

(deflambdafn steam-score.lambda.GameAchievementPercentages
  [in out ctx]
  (let  [event (json/read (io/reader in))
         res (handle-event event)]
    (json/write res (io/writer out))))
