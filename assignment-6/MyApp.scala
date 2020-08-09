object MyApp extends App {
	val p1 = Point(2,3)
	val p2 = Point(5,6)
	val p3 = p1.move(2,3)
	println(p1)
	println(p2)
	println(p3)

	val p4 = p1+p2
	println(p4)

	println(p1.distance(p2))
	println(p1.invert)
}

case class Point(a:Int, b:Int) {
	def x:Int = a
	def y:Int = b

	def move(dx:Int, dy:Int) = Point(this.x + dx, this.y + dy)

	def +(n1:Point) = Point(n1.x + this.x, n1.y + this.y)

	def distance(n1:Point) = Point(this.x - n1.x, this.y - n1.y)

	def invert() = Point(this.y, this.x)
}