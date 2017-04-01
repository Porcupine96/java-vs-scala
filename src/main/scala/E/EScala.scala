package E

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.StatusCodes._
import akka.http.scaladsl.server.Directives._
import akka.stream.Materializer
import de.heikoseeberger.akkahttpjson4s.Json4sSupport
import org.json4s.DefaultFormats
import org.json4s.native.Serialization

import scala.concurrent.Await
import scala.concurrent.duration._


// What will happen if we remove the materializer from parameter list? (route2HandlerFlow)
class EScala(host: String, port: Int)(implicit system: ActorSystem, mat: Materializer) extends Json4sSupport {

  private implicit val serialization = Serialization
  private implicit val formats = DefaultFormats

  private[E] val routes =
    (path("hello" / Segment) & get) { name =>
      complete(OK, s"Hello $name!")
    }

  def start(): Unit = Await.result(Http().bindAndHandle(routes, host, port), 5 seconds)

  /*

  Note: Intellij isn't smart enough to import "scala.concurrent duration._" usually you have to do this manually.
  The same happens for many akka classes. A few common examples would be:

  import akka.http.scaladsl.server.Directives._
  import akka.http.scaladsl.model.StatusCodes._
  import akka.pattern.ask
  import akka.pattern.pipe
  ...

   */

}
