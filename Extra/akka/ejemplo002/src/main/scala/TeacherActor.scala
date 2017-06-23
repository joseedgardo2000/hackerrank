import scala.util.Random
import akka.actor.Actor
import TeacherProtocol._

class TeacherActor extends Actor {
	val quotes = List(
						"Cuando naces para programador del cielo te caen los bytes",
						"Más vale laptop en mano que un ciento en la tienda",
						"No por mucho programar amanece más temprano",
						"Archivo lleno, corazón contento"
					 )
	def receive = {
		case QuoteRequest => {
			// Get a random Quote from the list and construct a response
			val quoteResponse = QuoteResponse(quotes(Random.nextInt(quotes.size)))
			println(quoteResponse)
		}
	}
}