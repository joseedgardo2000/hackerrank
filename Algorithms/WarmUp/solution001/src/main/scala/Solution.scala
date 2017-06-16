object Solution{
    def main(args: Array[String]) {
	   try{
		    println(solveMeFirst())
		} catch {
		    case x:NumberFormatException => println("Introduce un numero primero, da enter, introduce el otro numero y da nuevamente enter")
			case y:Throwable => println("Error desconocido: " + y)
		} 
		
	}
	
	def solveMeFirst():Int = {
		println("Introduce 2 números: ")
		val numbers:List[String] = io.Source.stdin.getLines().take(2).toList
		return numbers.map(_.toInt).sum
	}
}