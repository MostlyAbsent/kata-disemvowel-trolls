(ns kata-disemvowel-trolls.core
  (:require [clojure.string :as str]))

(defn disemvowel
  [string]
  (str/replace string #"(?i)[aeiou]" ""))
