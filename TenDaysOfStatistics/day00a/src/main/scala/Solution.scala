import java.util.Scanner
import scala.util.Sorting.quickSort

object Solution{
	
	def capturaValores(pScanner:Scanner):Array[Int] = {
		val n:Int = pScanner.nextInt
		val valores:Array[Int] = new Array[Int](n)
		
		for(i <- 0 to n - 1){
			valores(i) = pScanner.nextInt()
		}
		quickSort(valores)
		println(valores.mkString(" "))
		valores
	}
	
	def media(pValores:Array[Int]):Float = {
		val sumatoria:Float = pValores.reduce((acc,valor) => acc + valor)
		
		sumatoria / pValores.length.toFloat
	}
	
	def mediana(pValores:Array[Int]):Float = {
		var indiceMedio:Int = pValores.length / 2
		
		if(pValores.length % 2 == 1){
			pValores(indiceMedio)
		} else {
			(pValores(indiceMedio-1).toFloat + pValores(indiceMedio).toFloat)/2
		}
		
	}
	
	def moda(pValores:Array[Int]):Int = {
		// Para estraer con las funciones de coleccion
		val modaVal = pValores.groupBy(elemento => elemento).toSeq.sortBy(elemento => elemento._1).maxBy(tupla => {tupla._2.length})._1
		
        		
		modaVal
	}
	
	def main(args:Array[String]):Unit = {
		val scanner = new Scanner(System.in)
		val valores:Array[Int] = capturaValores(scanner)
		println(media(valores))
		println(mediana(valores))
		println(moda(valores))
	}
}