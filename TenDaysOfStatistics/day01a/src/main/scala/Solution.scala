import java.util.Scanner
import scala.util.Sorting.quickSort
import java.text.DecimalFormat

object Solution{
	
	def capturaDatos(pScanner:Scanner): Array[Float] = {
		val n       = pScanner.nextInt
		val valores = new Array[Float](n)
		for(i <- 0 to n - 1){
			valores(i) = pScanner.nextFloat
		}
		quickSort(valores)
		println(valores.mkString(" "))
		valores
	}
	
	def medianaEnRango(pA:Int, pB:Int, pDatos:Array[Float]):(Float, Int, Int) = {
		val res    = new Array[(Float, Int, Int)](3)
		val rango  = pA + pB
		val indice:Int = rango/2
		if(rango%2 == 0){
			(pDatos(indice), indice - 1,indice + 1)
		} else{
			((pDatos(indice) + pDatos(indice+1))/2, indice, indice + 1)
		} 
	}
	
	
	
	def cuartiles(pDatos:Array[Float]):Array[Float] = {
		val qs = new Array[(Float, Int, Int)](3)
		qs(1) = medianaEnRango(0, pDatos.length -1, pDatos)
		qs(0) = medianaEnRango(0, qs(1)._2, pDatos)
		qs(2) = medianaEnRango(qs(1)._3, pDatos.length -1, pDatos)
		Array(qs(0)._1, qs(1)._1,qs(2)._1)
	}
	
	def main(args:Array[String]):Unit = {
		val scanner = new Scanner(System.in)
		val valores = capturaDatos(scanner)
		val qs      = cuartiles(valores) 
		val formato = new DecimalFormat("#")
		
		println(formato.format(qs(0)))
		println(formato.format(qs(1)))
		println(formato.format(qs(2)))
	}
}