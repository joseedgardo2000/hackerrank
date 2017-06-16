// Compare the Triplets

object Solution {
  def obtieneProximoEntero(parSc:java.util.Scanner):Int = {
    while (!parSc.hasNextInt()) {
      val desecha = parSc.next()
      println("Introduce un entero")
    }

    parSc.nextInt()  
  }
  
  def main(args:Array[String]) = {
    
    val sc = new java.util.Scanner(System.in)
    val aTriplet:Array[Int] = Array(obtieneProximoEntero(sc), obtieneProximoEntero(sc), obtieneProximoEntero(sc))
    val bTriplet:Array[Int] = Array(obtieneProximoEntero(sc), obtieneProximoEntero(sc), obtieneProximoEntero(sc))
    
    var puntosA:Int = 0
    var puntosB:Int = 0
    
    for(i <- 0 to 2){
      puntosA += (if(aTriplet(i) > bTriplet(i)) 1 else 0)
      puntosB += (if(bTriplet(i) > aTriplet(i)) 1 else 0)
    }
    
    
    println(puntosA + " " + puntosB)
  }
}