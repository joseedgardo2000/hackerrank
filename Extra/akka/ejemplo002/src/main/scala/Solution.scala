import akka.actor.ActorSystem
import akka.actor.Props
import TeacherProtocol._

object Solution{
	def main(args:Array[String]):Unit = {
		// Se inicializa el ActorSystem
		val actorSystem = ActorSystem("UniversityMessageSystem")
	
		// Construct the Teacher Actor Ref
		val teacherActorRef = actorSystem.actorOf(Props[TeacherActor])
	
		// Send a message to the Teacher Actor
		teacherActorRef ! QuoteRequest
		
		// Let's wait for a couple of seconds before we terminate the system
		Thread.sleep(2000)
		
		// Terminate the ActorSystem
		actorSystem.terminate()
		
	}
}