object Assignment2{  
    def main(args: Array[String]) = { 
    	xyzCompany() 
    }

    //problem-1
    def xyzCompany() = {
		var total:Double = 0
        total = normalSalary(40) + otSalary(20) - tax(normalSalary(40)) - tax(otSalary(20))
        printf("Total Salary " + total + "/=\n")
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


}