(ns sprint-slack-command.handler
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (POST "/command" [Payload payload] (str payload)))

(def app
  (-> (handler/api app-routes)
      (middleware/wrap-json-body)
      (middleware/wrap-json-response)))
