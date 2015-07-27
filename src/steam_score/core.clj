(ns steam-score.core
    (:require [amazonica.aws.kinesis :refer [put-records]]
              [amazonica.aws.s3 :refer [get-object]]))

(defn handle-event
    [event]
    (println "Got the following event: " (pr-str event))
    {:status "ok"})
