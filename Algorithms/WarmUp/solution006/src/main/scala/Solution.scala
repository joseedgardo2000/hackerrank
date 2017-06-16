

object Solution {
  
  def obtieneProximoEntero(pSc:java.util.Scanner):Int = {
    while(!pSc.hasNextInt()){
      val desecha = pSc.next()
    }
    pSc.nextInt()
  }
  
  def main(args:Array[String]):Unit = {
    val sc        = new java.util.Scanner(System.in)
    val numElems  = obtieneProximoEntero(sc)
    val numeros   = new Array[Int](numElems)
    
    var cuentaPos:Float = 0
    var cuentaNeg:Float = 0
    var cuentaCer:Float = 0
    
    for(i <- 0 to (numElems-1)){
      numeros(i) = obtieneProximoEntero(sc)
      cuentaPos += (if(numeros(i) >  0) 1 else 0)
      cuentaNeg += (if(numeros(i) <  0) 1 else 0)
      cuentaCer += (if(numeros(i) == 0) 1 else 0)
    }
    println(cuentaPos/numElems)
    println(cuentaNeg/numElems)
    println(cuentaCer/numElems)
  }
}