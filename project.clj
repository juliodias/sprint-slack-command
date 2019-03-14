(defproject sprint-slack-command "1.0"
  :description "Slack command to your Sprint"
  :url "https://github.com/juliodias/sprint-slack-command"
  :min-lein-version "2.0.0"

  :dependencies [[org.clojure/clojure "1.10.0"]
                 [prismatic/schema "1.1.0"]
                 [compojure "1.6.1"]
                 [ring/ring-defaults "0.3.2"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler sprint-slack-command.handler/app}

  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}})
