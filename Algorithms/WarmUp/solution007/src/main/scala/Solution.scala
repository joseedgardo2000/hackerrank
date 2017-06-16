

object Solution {
  def obtieneProximoEntero(pSc:java.util.Scanner):Int = {
    while(!pSc.hasNextInt()){
      val desechado = pSc.next()
    }
    pSc.nextInt()
  }
  
  def main(args:Array[String]):Unit = {
    val sc = new java.util.Scanner(System.in)
    val numEsc = obtieneProximoEntero(sc)
    for(i <- 1 to numEsc){
      for(j <- 1 to numEsc - i){
        print(" ")
      }
      for(j <- 1 to i){
        print("#")
      }
      println();
    }
      
  }
  
}