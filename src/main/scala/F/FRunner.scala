package F

import akka.actor.ActorSystem

object FRunner extends App {

  private implicit val actorSystem = ActorSystem("fScalaActorSystem")

  new FScala().start()

}
