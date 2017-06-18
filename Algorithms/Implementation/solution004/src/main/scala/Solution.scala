import java.util.Scanner
import scala.util.Sorting.quickSort

object Solution{
	
	def capturaSet(pNumElems:Int, pScanner:Scanner):Array[Int] = {
		val setGral = new Array[Int](pNumElems)
		
		for(i <- 0 to pNumElems - 1){
			setGral(i) = pScanner.nextInt()
		}
		quickSort(setGral)
		setGral
	}

	def estaEnSetA(pX:Int, pSetA:Array[Int]):Boolean = {
		var enSet:Boolean = true
		var i:Int = 0
		while(enSet && i<pSetA.length){
			enSet = pX%pSetA(i)==0
			i += 1
		}
		enSet
	}
	
	def estaEnSetB(pX:Int, pSetB:Array[Int]):Boolean = {
		var enSet:Boolean = true
		var i:Int = 0
		while(enSet && i<pSetB.length){
			enSet = pSetB(i)%pX == 0
			i += 1
		}
		enSet
	}
	
	def main(args:Array[String]):Unit = {
		val scanner = new Scanner(System.in)
		val n       = scanner.nextInt()
		val m       = scanner.nextInt()
		val setA    = capturaSet(n, scanner)
		val setB    = capturaSet(m, scanner)		
		
		var contador= 0
		
		for(x <- setA(setA.length-1) to setB(setB.length-1)){
			if(estaEnSetA(x, setA)&&estaEnSetB(x,setB)) contador += 1		
		}
		
		println(contador)
	}
}