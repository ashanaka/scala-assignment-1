object Ceasar_chiper{
	
	def main(args:Array[String]) = {

		var letters  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		var userInput = scala.io.StdIn.readLine();
		userInput.foreach{i=>print(E(i, 3, letters))};

		userInput = scala.io.StdIn.readLine();
		userInput.foreach{i=>print(D(i, 3, letters))};
	}

	val E = (c:Char, key:Int, a:String)=> if(c != ' ') a((a.indexOf(c.toUpper)+key)%a.size) else {
		" ";
	 };


	val D = (c:Char, key:Int, a:String)=> if(c != ' ') a((a.size+(a.indexOf(c.toUpper)-key))%a.size) else {
		" ";
	 };

}