object Solution{

	def timeConversion(cadena: String):String = {
		val meridiano = cadena.substring(cadena.length() - 2)
		var result = cadena
		if(meridiano == "AM" || meridiano == "PM"){
		   val subHora = cadena.substring(0, cadena.length() - 2)
		   val horaElemens = subHora.split(":")
		    meridiano match{
			case "AM" => if(horaElemens(0)=="12") horaElemens(0)="00"
			case "PM" => horaElemens(0) = if(horaElemens(0)!="12") (horaElemens(0).toInt + 12).toString else horaElemens(0)
		   }
		   result = horaElemens.mkString(":")
		} 
		
		result
	}

	def main(args:Array[String]) = {
		val scanner = new java.util.Scanner(System.in)
		var cadena = scanner.nextLine() 
		val result = timeConversion(cadena)
		println(result)
		
		
	}
}