package E

import akka.http.scaladsl.model.StatusCodes._
import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest.{FlatSpec, Matchers}

class EScalaTest extends FlatSpec with ScalatestRouteTest with Matchers {

  private val eScala = new EScala("localhost", 8081)

  "GET /hello/{name}" should "welcome a user using his/hers name" in {

    Get("/hello/Michal") ~> eScala.routes ~> check {
      status shouldBe OK
      responseAs[String] shouldBe "\"Hello Michal!\""
    }

  }

}
