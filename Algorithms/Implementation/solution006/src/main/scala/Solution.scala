import java.util.Scanner

object Solution {
	
	def capturaCuadros(pScanner: Scanner):Array[Int] = {
		val n = pScanner.nextInt
		val cuadros:Array[Int] = new Array[Int](n)
		for(i <- 0 to n - 1){
			cuadros(i) = pScanner.nextInt
		}
		cuadros
	}
	
	def capturaParams(pScanner:Scanner):Map[Char, Int] = {
		var params:Map[Char, Int] = Map[Char,Int]()
		params += ('d' -> pScanner.nextInt) // Sumatoria a cumplir
		params += ('m' -> pScanner.nextInt)	// Números consecutivos
		params
	}
	
	def numFormasDarPiezaChocolate(pConsecutivos:Int, pSuma:Int, pBarraChocolate:Array[Int]):Int = {
		var numFormas:Int = 0
		for(i <- 0 to pBarraChocolate.length - pConsecutivos){
			var suma:Int = 0
			for(j <- i to i + pConsecutivos - 1){
				suma += pBarraChocolate(j)
			}
			if(pSuma == suma) numFormas +=1
		}
		numFormas
	}
	
	def main(args:Array[String]):Unit = {
		val scanner = new Scanner(System.in)
		val cuadros = capturaCuadros(scanner)
		val params  = capturaParams(scanner)
		print(numFormasDarPiezaChocolate(params('m'), params('d'), cuadros))
	}
}