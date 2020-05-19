object Assignment{  
    def main(args: Array[String]) = {  
        convert(35.0) 
    }

    def convert(deg:Double) = {
		var far:Double = 0
		far = deg*1.8000 + 32.00 
		printf(deg.toString + " degrees is equal to " + far.toString + " F")
    } 
}
