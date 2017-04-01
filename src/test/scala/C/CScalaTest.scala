package C

import org.scalatest.{BeforeAndAfterAll, FlatSpec, Matchers}

class CScalaTest extends FlatSpec with Matchers {

  private val cScala = new CScala
  private val testList = (1 to 100).map(_.toString).toList

  // (1 to 100)? - what's that?

  "The sumDivBy7Scala" should "sum numbers in range [0, 100] that are divisible by 7" in {

    cScala.sumDivBy7Scala(testList) shouldEqual 735

  }

}
