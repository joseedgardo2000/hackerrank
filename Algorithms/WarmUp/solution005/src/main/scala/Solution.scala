

object Solution {
  def obtieneProximoEntero(pSc:java.util.Scanner):Int = {
    while(!pSc.hasNextInt()){
      val desecha = pSc.next()
    }
    pSc.nextInt()
  }
  
  def main(args:Array[String]):Unit = {
    val sc         = new java.util.Scanner(System.in)
    val dimension  = obtieneProximoEntero(sc)
    val matriz     = Array.ofDim[Int](dimension, dimension)
    var diaIzq:Int = 0
    var diaDer:Int = 0
    var resultado  = 0
    
    for(i <- 0 to dimension - 1; j <- 0 to dimension - 1 ){
      matriz(i)(j) = obtieneProximoEntero(sc)
      diaIzq += (if(i==j) matriz(i)(j) else 0)
      diaDer += (if((dimension - 1) == (i + j)) matriz(i)(j) else 0)
    }
    
    resultado = diaIzq - diaDer
    
    resultado = Math.abs(resultado)
    
    println(resultado)
    
  }
}