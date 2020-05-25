object Assignment2{  
    def main(args: Array[String]) = { 
    	
        printf(xyzCompany(40, 20).toString + "/=\n")
        printf(profit(5).toString + "/=\n")
    }

    //problem-1
    def xyzCompany(nHours:Double, otHours:Double) = {
		normalSalary(nHours) + otSalary(otHours) - tax(normalSalary(nHours)) - tax(otSalary(otHours))
        
    }
    def normalSalary(hours:Double):Double = {
        hours*150.0
    } 
    def otSalary(hours:Double):Double = {
        hours*75.0
    }
    def tax(sal:Double):Double = {
        sal*0.4
    }

    //problem-2
    def attendees(price:Int):Int = {
        120 + (15-price)/5*20
    }
    def revenue(price:Int):Int = {
        attendees(price)*price
    }
    def cost(price:Int):Int = {
        500 + attendees(price)
    }
    def profit(price:Int):Int = {
        revenue(price) - cost(price)
    }
}