object Assignment3{
    def main(args: Array[String]):Unit = {
        primeSeq(20) 
        // prime(1)
    }

    //problem-1
    def prime(p:Int, n:Int = 2):Boolean = n match {
		case x if(p==x) => true
        case x if(gcd(p,x)>1) => false
        case x => prime(p, x+1)	
    }
    def gcd(a:Int, b:Int):Int = b match {
        case 0 => a
        case b if(b>a) => gcd(b, a)
        case _ => gcd(b, a%b)
    } 

    //problem-2
    def primeSeq(n:Int):Any = {
        
        if(prime(n)) println(n)
        if(n == 2)  0
        if(n>2) primeSeq(n-1)
    }
}
// Assignment3.main(args)
