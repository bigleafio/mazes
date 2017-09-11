(ns maze.grid)

(defn emptygrid [x y]
	)o

(defrecord Cell [row col ])

class Cell
attr_reader :row, :column

attr_accessor :north, :south, :east, :west

(defrecord Address [street city state zip])

(def stu (Person. "Stu" "Halloway"
									(Address. "200 N Mangum"
														"Durham"
														"NC"
														27701)))

(defn empty-maze
	"Creates a rectangular empty maze of the specified width
and height."
	[w h]
	(vec (repeat w (vec (repeat h nil)))))

 fed
