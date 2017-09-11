(ns mazes.core
	(:gen-class))

(defn -main
	"I don't do a whole lot ... yet."
	[& args]
	(println "Hello, World!"))

(def frame (java.awt.Frame.))

(.setVisible frame true)

(.setSize frame (java.awt.Dimension. 200 200))

(def gfx (.getGraphics frame))

(.fillRect gfx 100 100 50 75)
(.setColor gfx (java.awt.Color. 255 128 0))
(.fillRect gfx 100 150 75 50)

(defn xors [max-x max-y]
	(for [x (range max-x) y (range max-y)]
		[x y (bit-xor x y)]))

(doseq [[x y xor] (xors 200 200)]
	(.setColor gfx (java.awt.Color. xor xor xor))
	(.fillRect gfx x y 1 1))
