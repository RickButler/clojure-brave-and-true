(ns three.core)

;literals
1
"a string"
["a" "vector" "of" "strings"]

;lisp goodness function is the first item in parens arguments come after
(+ 1 2 3)

(str "It was the panda " "in the library " "with a dust buster")

;conditonals
(if true
  "By Zeus's hammer!"
  "By Aquaman's trident!")

(if false
  "By Zeus's hammer!"
  "By Aquaman's trident!")

;with no second term if returns nil
(if false
  "By Odin's Elbow!")

;use do to run multiple things
(if true
  (do (println "Success!")
      "By Zeus's hammer!")
  (do (println "Failure!")
      "By Aquaman's trident!"))

;when is a combination of if/do with only the true condtion executing a do
(when true
  (println "Success!")
  "abra cadabra")

;checking for nil, everything but nil and false are true
(nil? 1)

(nil? nil)

;everything but nil false is true
(if "bears eat beets"
  "bears beets Battlestar Galactica")

;nil evaluates to false
(if nil
  "This won't be the result because nil is falsey"
  "nil is falsey")

;equality operator
(= 1 1)

(= nil nil)

(= 1 2)

;returns first true value. keyword evals to true (it's not nil or false)
(or false nil :large_I_mean_venti :why_cant_I_just_say_large)

;both are false so returns last value
(or (= 0 1) (= "yes" "no"))

;returns last value
(or nil)

;and returns the last truthy value
(and :free_wifi :hot_coffee)

;and returns the first flase value
(and :feelin_super_cool nil false)

;define bind a name to a value
(def failed-protagonist-names
  ["Larry Potter" "Doreen the Explorer" "The Incredible Bulk"])

failed-protagonist-names

;define severity keyword as mild
(def severity :mild)
;define an error message
(def error-message "OH GOD! IT'S A DISASTER! WE'RE ")
;compare severity to mild then re-def message
(if (= severity :mild)
  (def error-message (str error-message "MILDLY INCONVENIENCED!"))
  (def error-message (str error-message "DOOOOOOOMED!")))

;run it twice and it appends, don't re-def stuff kind of anti-pattern for lisp
error-message

;alternative, create a function duh. functions are first class citizens
(defn error-message
  [severity]
  (str "OH GOD! IT'S A DISASTER! WE'RE "
       (if (= severity :mild)
         "MILDLY INCONVENIENCED!"
         "DOOOOOOOMED!")))

(error-message :mild)
(error-message :doomed?)

;Datastructures

;Strings, nothing to see here, move along, move along...
"Lord Voldemort"
"\"He who must not be named\""
"\"Great cow of Moscow!\" - Hermes Conrad"

(def name "Chewbacca")
(str "\"Uggllglglglglglglglll\" - " name)

;an empty map
{}

;a map with keys and values
{:first-name "Charlie"
 :last-name "McFishwich"}

;an association of a string to a function
{"string-key" +}

;a more complex map with nested values
{:name {:first "John" :middle "Jacob" :last "Jingleheimerschmidt"}}

;create a hash map dynamically with a function
(hash-map :a 1 :b 2)

;accessing values inside a map
(get {:a 0 :b 1} :b)

(get {:a 0 :b {:c "ho hum"}} :b)

;accessing a non existant value inside a map returns nil
(get {:a 0 :b 1} :c)

;the last param to get is a defaultn

;get in will allow you to access nested values in the map with a vector
(get-in {:a 0 :b {:c "ho hum"}} [:b :c])

(vector? [1 2])















