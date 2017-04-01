package A

import org.scalatest.{FlatSpec, Matchers}

class AScalaTest extends FlatSpec with Matchers {

  "Scala" should "work as expected" in {

    """
      | val a = 5
      | a = 4
    """.stripMargin shouldNot compile

    """
      | var a = 5
      | a = 5
    """.stripMargin should compile

  }

  "A class" should "have a working constructor getter and setter" in {
    val aScala = new AScala(7)
    aScala.x shouldBe 7
    aScala.x = 5
    aScala.x shouldBe 5
  }

  "A @BeanProperty" should "generate java-like getter and setter" in {
    val aBeanScala = new ABeanProperty(7)
    aBeanScala.getX shouldBe 7
    aBeanScala.setX(5)
    aBeanScala.getX shouldBe 5
  }

  "A `case` keyword" should "provide some additional functionalities" in {
    val extendedAScala = AExtendedScala(7) // hmm, no `new` keyword?

    val aCopy = extendedAScala.copy(5) // immutable :)
    aCopy.x shouldBe 5
    extendedAScala.x shouldBe 7

    extendedAScala.toString shouldBe "AExtendedScala(7)"
    println(extendedAScala)

    val otherEq = AExtendedScala(7)
    val otherNotEq = AExtendedScala(5)
    extendedAScala shouldEqual otherEq
    extendedAScala should not equal otherNotEq // scala test - different syntax for negation
  }

}
