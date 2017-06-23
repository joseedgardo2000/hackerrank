import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props


class HelloActor extends Actor {
	def receive = {
		case "Buenas" => println("Respuesta01: Buenas las tenga usted")
		case _       => println("Respuesta02: pasandola nomas")
	}
}

object Solution {
	def main(args:Array[String]):Unit = {
		println("------------ Ejemplo Akka 001 ------------")
		val helloActorSystem = ActorSystem("HelloSystem")
		// default Actor Constructor
		val helloActorRef = helloActorSystem.actorOf(Props[HelloActor], name="helloActor")
		val mensaje01 = "Buenas"
		val mensaje02 = "Que onda"
		println("Mensaje01: " + mensaje01)
		helloActorRef ! mensaje01
		println("Mensaje02: " +  mensaje02)
		helloActorRef ! mensaje02
		helloActorSystem.terminate()
		
	}
}