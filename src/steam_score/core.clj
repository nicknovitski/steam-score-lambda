(ns steam-score.core)

(defn handle-event
    [event]
    (println "Got the following event: " (pr-str event))
    {:status "ok"})
