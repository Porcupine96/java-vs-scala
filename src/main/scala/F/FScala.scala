package F

import akka.actor.{Actor, ActorSystem, Props}

class FScala(implicit system: ActorSystem) {

  def start() = {
    val pingProps = Props(new Ping)
    val pongProps = Props(new Pong)

    val pingActor = system.actorOf(pingProps)
    val pongActor = system.actorOf(pongProps)

    pingActor.tell(Start(10), pongActor)
  }

}


class Ping extends Actor {

  private var counter = 0

  override def receive: Receive = {

    case Pong =>
      if (counter > 0) {
        Thread sleep 1000
        counter -= 1
        println("ping")
        sender() ! Ping
      }

    case Start(count) =>
      counter = count
      sender() ! Ping

  }

}


class Pong extends Actor {

  override def receive: Receive = {
    case Ping =>
      Thread sleep 1000
      println("pong")
      sender() ! Pong
  }

}

case object Ping

case object Pong

case class Start(count: Int)