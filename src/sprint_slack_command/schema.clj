(ns sprint-slack-command.schema
  (:require [schema.core :as s]))

(s/schema Payload
  {:token        s/Str
   :team         Team
   :enterprise   Enterprise
   :channel      Channel
   :user         User
   :command      s/Str
   :text         s/Str
   :response_url s/Str
   :trigger_id   s/Str})

(s/schema Team
  {:team_id     s/Str
   :team_domain s/Str})

(s/schema Enterprise
  {:enterprise_id   s/Str
   :enterprise_name s/Str})

(s/schema Channel
  {:channel_id   s/Str
   :channel_name s/Str})

(s/schema User
  {:user_id   s/Str
   :user_name s/Str})
