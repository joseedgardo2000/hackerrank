

object Solution {
  
  def obtieneProximoBigInt(pSc:java.util.Scanner):BigInt={
    while(!pSc.hasNextBigInteger()){
      val desechar = pSc.next()
    }
    pSc.nextBigInteger()
  }
  
  def main(args:Array[String]):Unit = {
    val sc      = new java.util.Scanner(System.in)
    val numeros = new Array[BigInt](5)
    var sumMayor:BigInt = 0
    var sumMenor:BigInt = 0
    
    for(i <- 0 to 4){
      numeros(i) = obtieneProximoBigInt(sc)
    }
    
    for(i <- 0 to 4; j <- 0 to 3){
      if(numeros(j)>numeros(j+1)){
        val pivote   = numeros(j)
        numeros(j)   = numeros(j+1)
        numeros(j+1) = pivote
      }
    }
    
    for(i <- 0 to 3){
      sumMenor += numeros(i)
      sumMayor += numeros(4 - i)
    }
    
    println(sumMenor + " " + sumMayor)
  }
  
}