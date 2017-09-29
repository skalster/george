;; Six point star
(reset)
(dotimes [i 2]
  (left 60)
  (forward 100)
  (right 60)
  (forward 100)
  (left 120)

  (forward 100)
  (right 60)
  (forward 100)
  (left 120)
  (forward 100)
  (right 60)
  (forward 100) 
  (left 60)

)
(hide)

;; Six point star with rep
;; Six point star
(reset)
(def steps 50 )
(def angle120 120)
(def angle60 60)
  
(println "side is: " steps)
(println "angle is: " angle120)
  
(defn function1 [] 
  (forward steps)
  (right angle60)
  (forward steps)
)

(rep 2
  (rep 3 
   (function1)
   (left angle120)
  )
)
(hide)


