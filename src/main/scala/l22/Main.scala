package l22

import l22.MyImplicits._

object Main extends App {

  override def main(args: Array[String]) = {

    println(12.isOdd)
    println(12.isZero)

    val number = 12.34f

    println(number.toFormatString)
  }
}
