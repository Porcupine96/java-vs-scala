package D

import org.scalatest.{FlatSpec, Matchers}

class DScalaTest extends FlatSpec with Matchers {

  private val dScala = new DScala
  private val colorRGB = dScala.ColorRGB(10, 20, 30)
  private val colorWithUrl = dScala.ColorWithUrl("red", "http://colors.com/red")
  private val unsupportedColor = new UnsupportedColor() with dScala.Color

  /*
  New concepts:
  1. Referencing inner classes / traits with "#"
  2. Mixin' traits with an object
  3. What would happen if the Color tait was "sealed"?
   */


  "The colorAsString method" should "work for ColorRGB" in {
    dScala.colorAsString(colorRGB) shouldBe "10 20 30"
  }

  it should "work for ColorWithUrl" in {
    dScala.colorAsString(colorWithUrl) shouldBe "red"
  }

  it should "throw an IllegalArgumentException for unsupported colors" in {
    an[IllegalArgumentException] should be thrownBy dScala.colorAsString(unsupportedColor)
  }

  private case class UnsupportedColor()

}
