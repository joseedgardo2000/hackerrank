object Solution{
	
	def redondea(pGrade:Int):Int = {
		val modulo        = pGrade%5
		val distNextMult5 = 5 - modulo
		val grade         = if(distNextMult5<=2) pGrade + distNextMult5 else pGrade
		grade
	}
	
	def main(args:Array[String]) = {
		val scanner = new java.util.Scanner(System.in)
		val numElem = scanner.nextInt
		val grades:Array[Int] = new Array[Int](numElem) 
		
		for(i <- 0 to numElem - 1){
			grades(i) = scanner.nextInt
			grades(i) = if(grades(i) < 38) grades(i) else redondea(grades(i))
		}
		
		grades.foreach(println)
	}

}
