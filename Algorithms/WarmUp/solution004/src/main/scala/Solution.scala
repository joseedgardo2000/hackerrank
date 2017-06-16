

object Solution {
  
  def obtieneProximoEntero(parSc:java.util.Scanner):Int = {
    while(!parSc.hasNextInt()){
      val desecha = parSc.next()
      println("Introduce un numero entero")
    }
    parSc.nextInt()
  }
  
  def obtieneProximoBig(parSc:java.util.Scanner):BigInt = {
    while(!parSc.hasNextBigInteger()){
      val desecha = parSc.next()
      println("Introduce un BigInt")
    }
    parSc.nextBigInteger()
  }
  
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val numSumandos = obtieneProximoEntero(sc)
    val numeros = new Array[BigInt](numSumandos)
    
    for(i <- 0 to numSumandos-1){
      numeros(i) = obtieneProximoBig(sc)
    }
    
    val suma = numeros.reduce((acumulador, sumando) => acumulador + sumando)
    println(suma)
    
  }
}