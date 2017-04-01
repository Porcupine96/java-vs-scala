package E

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer

object ERunner extends App {

  private implicit val system = ActorSystem("eActorSystem")
  private implicit val mat = ActorMaterializer()

  new EScala("localhost", 8081).start()

}
