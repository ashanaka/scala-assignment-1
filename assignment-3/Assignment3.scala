object Assignment3{
    def main(args: Array[String]):Unit = {
        fibonacciSeq(10)
        println(addAllEven(10))
        println(isEven(9))
        println(addition(5))
        primeSeq(20) 
        prime(3)
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

    //problem-3
    def addition(n:Int):Int = n match {
        case 1 => 1
        case _ => n + addition(n-1)
    }

    //problem-4
    def isEven(n:Int):Boolean = n match {
        case 0 => true
        case _ => isOdd(n-1)
    }
    def isOdd(n:Int):Boolean = !(isEven(n))

    //problem-5
    def addAllEven(n:Int):Int = n match {
        case x if(x==0) => 0
        case x if(isEven(x)) => n + addAllEven(n-1)
        case x => addAllEven(n-1)
    }

    //problem-6
    def fibonacci(n:Int):Int = n match{
        case 0 => 0
        case x if x==1 => 1
        case _ => fibonacci(n-1) + fibonacci(n-2)
    }
    def fibonacciSeq(n:Int):Unit = {
        if(n>0) fibonacciSeq(n-1)
        println(fibonacci(n))
    }
}

