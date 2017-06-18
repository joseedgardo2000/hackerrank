import java.util.Scanner

object Solution {
	
	def capturaScore():Array[Int] = {
		val scanner = new Scanner(System.in)
		val n       = scanner.nextInt()
		var score   = new Array[Int](n)
		for(i <- 0 to n-1){
			score(i) = scanner.nextInt()
		}
		score
	}
	
	def numRecords(pScore:Array[Int]):Array[Int] = {
		val records=Array[Int](0, 0)
		var mejorRecord = pScore(0)
		var peorRecord  = pScore(0)
		for(i <- 1 to pScore.length - 1){
			if(mejorRecord < pScore(i)){
				records(0) += 1
				mejorRecord = pScore(i)
			}
			if(peorRecord > pScore(i)){
				records(1) += 1
				peorRecord = pScore(i)
			}
		}
		records
	}
	
	def main(args:Array[String]):Unit = {
		val score   = capturaScore()
		val records = numRecords(score)
		println(records(0) + " " + records(1))
	}
	
}
