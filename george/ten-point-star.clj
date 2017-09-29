;;ten-point-star
(reset)
(def steps 50 )
(def angle30 30)
(def angle90 90)
  
(println "side is: " steps)
(println "angle is: " angle45)
  
(defn function1 [] 
  (forward steps)
  (left angle90)
  (forward steps)
  (right 54)
)

(rep 10 
     (function1)
)

(hide)