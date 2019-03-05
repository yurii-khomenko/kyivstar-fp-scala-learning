package l22

object MyImplicits {

  implicit class IntWrapper(val original: Int) {
    def isOdd = original % 2 != 0
    def isZero = original == 0
  }

  implicit class DoubleWrapper(val original: Double) {
    def toFormatString: String = f"$original%.3f"
  }
}