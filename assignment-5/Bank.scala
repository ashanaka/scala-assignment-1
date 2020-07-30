object MyApp2 extends App {

	val a1 = new Account("acc1", 1, 200);
	val a2 = new Account("acc2", 2, 50);
	println("\nTransaction between two accounts");
	println(a1.balance);
	println(a2.balance);
	a1.transfer(a2, 100);
	println(a1.balance);
	println(a2.balance);

	var bank:List[Account] = List(new Account("971234567V", 1234, 100), new Account("981234567V", 5678, -50), new Account("991234567V", 123, 400.5), new Account("961234567V", 456, -3.3));
	println("\nAll negetive accounts")
	Account.negetiveAcc(bank).foreach(println);
	println(Account.sumAll(bank));

	println("\nFinal interests of all accounts")
	val finals = Account.finalInterest(bank);
	finals.foreach(x=>print(x+" | "));
}

object Account {
	def negetiveAcc(a:List[Account]): List[Account] = a.filter(_.balance<0)
	def sumAll(a:List[Account]): Double = a.map(_.balance).sum
	def finalInterest = (list:List[Account])=>list.map(x=>(if(x.balance>0) x.balance*0.05d else x.balance*0.01d));

}

class Account (id:String, n:Int, b:Double) {
	val nic:String = id;
	val acnumber:Int = n;
	var balance:Double = b;

	def withdraw(a:Double) = this.balance = this.balance-a
	def deposit(a:Double) = this.balance+a
	def transfer(a:Account, b:Double):Unit = {
		this.balance = this.balance - b;
		a.balance = a.balance + b;
	}

	

	override def toString = "["+":"+acnumber + ":"+ balance+ "]"
}

