package D

class DScala {

  def colorAsString(color: Color) = color match {
    case ColorRGB(r, g, b) => s"$r $g $b"
    case ColorWithUrl(name, _) => name
    case _ => throw new IllegalArgumentException
  }

  trait Color

  case class ColorRGB(r: Int, g: Int, b: Int) extends Color

  case class ColorWithUrl(name: String, urlToSample: String) extends Color

}


