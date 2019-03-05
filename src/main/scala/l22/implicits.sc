import scala.concurrent.{ExecutionContext, Future}
import scala.concurrent.ExecutionContext.Implicits.global

val number = 20

number.toByte
number.toRadians


class KoanIntWrapper(val original: Int) {
  def isOdd = original % 2 != 0

  def isZero = original == 0
}

implicit def myMethod(value: Int) = new KoanIntWrapper(value)

19.isOdd
20.isOdd

21.isZero


val ex: ExecutionContext = ???

val f1 =
  Future("qweqweqweqwe")(ex)
    .map(s => s.length)(ex)
    .map(length => s"$length")(ex)

val f2 =
  Future("qweqweqweqwe")
    .map(s => s.length)
    .map(length => s"$length")