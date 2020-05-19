object Assignment{  
    def main(args: Array[String]) = { 
    	convert(35)
    	volume(5) 
        shop(50) 
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
    	val price:Double = 24.95
    	val discount:Double = 40/100
    	val shippingCost50:Double = 3
    	val shippingCostMore:Double = 0.75

    	var wholeSalePrice:Double = 0

    	if(num <= 50){
    		wholeSalePrice = (num*price) - (num*price)*discount + (num*shippingCost50)
    	}else{
    		wholeSalePrice = (num*price) - (num*price)*discount + (num-50)*shippingCostMore + 50*shippingCost50
    	}

    	printf("Total cost is " + wholeSalePrice.toString + "/=\n")
    }
}
