;; eight point star 
  (reset)
  (rep 2 
       (left 50)
       (forward 50)
       (right 60)
       (forward 50)
       (left 90)
       (forward 50)
       (right 60)
       (forward 50)
       
	   (left 120)
	   
       (forward 50)
       (right 60)
       (forward 50) 
       (left 90)
       (forward 50)
       (right 60)
       (forward 50)
       (left 50)
)
(hide)

;; eight point star with rep 

(reset)
(def steps 50 )
(def angle45 45)
(def angle90 90)
  
(println "side is: " steps)
(println "angle is: " angle45)
  
(defn function1 [] 
  (forward steps)
  (left angle90)
  (forward steps)
  (right angle45)
)

(rep 8 
     (function1)
)

(hide)