object Assignment{  
    def main(args: Array[String]) = { 
    	
        printf(convert(35).toString + " F\n")
        printf(volume(5).toString + " Units\n");
    	printf(shop(60).toString + "/=\n")    
    }

    //problem-1
    def convert(deg:Double) = {
		deg*1.8000 + 32.00 	
    } 

    //problem-2
    def volume(rad:Double) = {
    	4*math.Pi*rad*rad*rad/3	
    }

    //problem-3
    def shop(num:Int) = {
    	bookPrice(num) + shippingCost(num) - discount(num)
    	
    }
    def discount(amount:Double):Double = amount*0.4
    def shippingCost(x:Int):Double = {
    	if(x > 50){
    		3*x + (x-50)*0.75
    	}else{
    		3*x 
    	}
    }
    def bookPrice(x:Int):Double = x*24.95
    
}
