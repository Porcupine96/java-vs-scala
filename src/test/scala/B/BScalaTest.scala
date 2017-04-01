package B

import org.scalatest.FlatSpec

class BScalaTest extends FlatSpec {

  "A car" should "drive" in {
    val vehicleS = new CarS("V-8 Engine", 15, DirectionS.East)
    vehicleS.drive()
  }

}
