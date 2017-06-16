

object Solution {
  def obtenerProximoEntero(pSc:java.util.Scanner):Int={
    while(!pSc.hasNextInt()){
      val desechar = pSc.next()
    }
    pSc.nextInt()
  }
  
  def main(args:Array[String])={
    val sc    = new java.util.Scanner(System.in)
    val años  = obtenerProximoEntero(sc)
    val velas = new Array[Int](años)
    var conteo = true
    var k      = 0
    //Capturar tamaños de velas
    for(i <- 0 to años-1){
      velas(i) = obtenerProximoEntero(sc)
    }
    //Ordenar
    val a = velas.sorted.reverse
    
   
    while(conteo){
      if(k==(años-1)){ 
          conteo = false 
      } else {
          if(a(k)!=a(k+1)) conteo = false
      }
      k += 1
    }
    
    println(k)
  }
}