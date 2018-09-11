class Car(var serial: Int = 123) {

  var speed = 0

//  val getSerial = serial
  def getSerial = serial

  def changeSpeed(delta: Int): Int = {
    speed += delta
    speed
  }
}

val car = new Car
val car2 = new Car(456)

car.speed
car.changeSpeed(60)
car.speed
car.getSerial
car.serial

car2.serial
car2.serial = 6765756