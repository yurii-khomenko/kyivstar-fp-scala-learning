

class Car(val serial: String = "123", val maxSpeed: Int = 100)

val car = new Car("123123", 300)
val car4 = new Car
car.toString


case class Car2(serial: String, maxSpeed: Int, color: String = "black")

val car2 = Car2("123", 100)

car2.maxSpeed

car2.toString
val car3 = car2.copy(maxSpeed = 200, color = "red")

car3