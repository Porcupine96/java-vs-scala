package D

class D3Scala {

  implicit val x = 5

  def iNeedAnIntegerProvider = new INeedAnInteger()

}

class INeedAnInteger(implicit x: Int)