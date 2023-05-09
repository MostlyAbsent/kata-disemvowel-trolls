(ns kata-disemvowel-trolls.core-test
  (:require [clojure.test :refer :all]
            [kata-disemvowel-trolls.core :refer :all]))

(deftest Testing...
  (is (= (disemvowel "This website is for losers LOL!") "Ths wbst s fr lsrs LL!"))
)
