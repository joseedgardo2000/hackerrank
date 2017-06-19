import java.util.Scanner
import java.text.DecimalFormat

object Solution{
	
	def capturaValores(pNumVal:Int, pScanner:Scanner):Array[Float] = {
		val valores = new Array[Float](pNumVal)
		for(i <- 0 to pNumVal - 1){
			valores(i) = pScanner.nextFloat
		}
		valores
	}
	
	def mediaPonderada(pValores:Array[Float], pPesos:Array[Float]):Float = {
		var sumaPonderada:Float = 0
		var sumaPesos:Float     = 0
		for(i <- 0 to pValores.length -1){
			sumaPonderada += pValores(i) * pPesos(i)
			sumaPesos     += pPesos(i)
		}
		sumaPonderada/sumaPesos
	}
	
	def main(args:Array[String]):Unit = {
		val scanner = new Scanner(System.in)
		val n       = scanner.nextInt
		val valores = capturaValores(n,scanner)
		val pesos   = capturaValores(n, scanner)
		val formato = new DecimalFormat("#.0")
		
		println(formato.format(mediaPonderada(valores, pesos)))
		
	}
}