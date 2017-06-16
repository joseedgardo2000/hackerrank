

object Solution {
  def numCeroSino(numCad:String):Integer={
    try{
      numCad.toInt
    } catch {
      case e:Throwable => 0
    }
  }
  
  def main(args:Array[String]):Unit = {
    println("Primero introduce el número de sumandos, después introduce la lista de sumandos separados por espacios")
    
    val numEnCads = io.Source.stdin.getLines().take(2).toArray
    val numeros = numEnCads(1).trim.split(' ').map(numCad=>numCeroSino(numCad))
    
    if(numCeroSino(numEnCads(0))!=numeros.size) {
      println("El primer número debe coincidir con el número de sumandos")
      return
    }
    
    val res = numeros.reduce((accumulador, sumando) => accumulador + sumando)
                          
    println("Resultado\n" + res) 
    
  }
}