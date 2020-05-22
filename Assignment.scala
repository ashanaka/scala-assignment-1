object Assignment{  
    def main(args: Array[String]) = { 
    	convert(35)
    	volume(5) 
        shop(60) 
    }

    def convert(deg:Double) = {
		var far:Double = 0
		far = deg*1.8000 + 32.00 
		printf(deg.toString + " degrees is equal to " + far.toString + " F\n")
    } 

    def volume(rad:Double) = {
    	var vol:Double = 0
    	vol = 4*math.Pi*rad*rad*rad/3
    	printf("Volume is " + vol.toString + " Units\n");
    }

    def shop(num:Int) = {
    	val total:Double = bookPrice(num) + shippingCost(num) - discount(num)
    	printf("Total price is " + total.toString + "/=\n")
    }

    def discount(amount:Double):Double = amount*0.4

    def shippingCost(x:Int):Double = {
    	var result:Double = 0
    	if(x > 50){
    		result = 3*x + (x-50)*0.75
    	}else{
    		result = 3*x 
    	}

    	return result
    }

    def bookPrice(x:Int):Double = x*24.95
}
