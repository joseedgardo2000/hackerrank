object Solution{

	def capturaPuntosUnidades(scanner:java.util.Scanner):Map[Char, Int] = {
		
		var valores:Map[Char, Int] = Map()
		
		valores += ('s' -> scanner.nextInt())
		valores += ('t' -> scanner.nextInt())
		valores += ('a' -> scanner.nextInt())
		valores += ('b' -> scanner.nextInt())
		valores += ('m' -> scanner.nextInt())
		valores += ('n' -> scanner.nextInt())
		
		valores
	}
	
	def capturaManzanas(cantidad:Int, scanner:java.util.Scanner): Array[Int] = {
		val manzanas:Array[Int] = new Array[Int](cantidad)
		for(i <- 0 to cantidad - 1){
			manzanas(i) = scanner.nextInt()
		}
		manzanas
	}
	
	def capturaNaranjas(cantidad:Int, scanner:java.util.Scanner): Array[Int] = {
		val naranjas:Array[Int] = new Array[Int](cantidad)
		for(i <- 0 to cantidad - 1){
			naranjas(i) = scanner.nextInt()
		}
		naranjas
	}

	def manzanasEnCasa(manzanas:Array[Int], valores:Map[Char,Int]):Int = {
		var numManzanasEnCasa:Int = 0
		for(manzana <- manzanas){
			val caidaManzana = valores('a') + manzana
			if(caidaManzana >= valores('s')&& caidaManzana <= valores('t')){
				numManzanasEnCasa += 1
			}
		}
		numManzanasEnCasa
	}
	
	def naranjasEnCasa(naranjas:Array[Int], valores:Map[Char, Int]):Int = {
		var numNaranjasEnCasa:Int = 0
		for(naranja <- naranjas){
			val caidaNaranja = valores('b') + naranja
			if(caidaNaranja >= valores('s')&& caidaNaranja <= valores('t')){
				numNaranjasEnCasa += 1
			}
		}
		numNaranjasEnCasa
	}

	def main(args:Array[String]):Unit = {
		val scanner = new java.util.Scanner(System.in)
		val valores:Map[Char, Int] = capturaPuntosUnidades(scanner)
		val manzanas:Array[Int] = capturaManzanas(valores('m'), scanner)
		val naranjas:Array[Int] = capturaNaranjas(valores('n'), scanner)
		val numManzanasEnCasa = manzanasEnCasa(manzanas, valores)
		val numNaranjasEnCasa = naranjasEnCasa(naranjas, valores)
		println(numManzanasEnCasa)
		println(numNaranjasEnCasa)
	}
}