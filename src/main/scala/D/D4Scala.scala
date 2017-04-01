package D

class D4Scala extends Implicits {

  def notQuiteIntegerProvider() = {
    val notQuiteString = 17
    iWantString(notQuiteString)
  }

  def iWantString(s: String) = println(s"Got $s")

}

trait Implicits {

  implicit def integer2String(s: Int): String = s.toString

}
