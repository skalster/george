;; Square
(reset)
(left 90) (forward 50)
(left 90) (forward 50)
(left 90) (forward 50)
(left 90) (forward 50)
;; Square with rep
(reset)
(def steps 50)
(def rightAngle 90)
(rep 4
     (left rightAngle) (forward steps)
 )
(hide)