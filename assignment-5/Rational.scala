object MyApp extends App {
	val r1 = new Rational(3, 4);
	val r2 = new Rational(5,8);
	val r3 = new Rational(2,7)
	val x = r1-r2-r3;
	println(r1);
	println(r2);
	println(x)
}

class Rational(n:Int, d:Int) {
	require(d>0, "Denom must be greater than 0");
	def numer=n/gcd(Math.abs(n),d)
	def denom=d/gcd(Math.abs(n),d)
	def this(n:Int)=this(n, 1)

	private def gcd(a:Int, b:Int):Int = if(b==0) a else gcd(b, a%b)

	def +(r:Rational) = new Rational(this.numer*r.denom+this.denom*r.numer, this.denom*r.denom);
	def -(r:Rational)=this+r.neg
	
	def neg=new Rational(-this.numer, this.denom)

	override def toString = numer+"/"+denom
}