package B

class CarS(engine: String, speed: Int, direction: DirectionS) extends VehicleS(speed, direction) {

  override def drive() = println("Engine goes: \"Wrrrrrrr\"")

}

