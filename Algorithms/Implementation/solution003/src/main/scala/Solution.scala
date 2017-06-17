import java.util.Scanner

object Solution{
    def capturaEntrada(pScanner:Scanner):Map[String, Int] = {
		var valores:Map[String, Int] = Map()
		
		valores += ("x1" -> pScanner.nextInt())
		valores += ("v1" -> pScanner.nextInt())
		valores += ("x2" -> pScanner.nextInt())
		valores += ("v2" -> pScanner.nextInt())
		
		valores
	}
	
	def canguroAlcanza(pValores:Map[String, Int]):String = {
		
		if(pValores("x2") > pValores("x1") && pValores("v2") >= pValores("v1")){// ||
		  // pValores("x1") > pValores("x2") && pValores("v1") > pValores("v2") ) {
			"NO"
		} else { 
			val m = (pValores("x2")-pValores("x1"))%(pValores("v1")-pValores("v2")) 
			if(m==0){
				"YES"
			} else {
				"NO"
			}
		}
	}
	
	def main(args:Array[String]):Unit = {
		val scanner = new Scanner(System.in)
		val valores = capturaEntrada(scanner)
		println(canguroAlcanza(valores))
		
	}
}
