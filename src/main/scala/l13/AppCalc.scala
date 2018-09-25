package l13

object AppCalc {

  def main(args: Array[String]): Unit = {

    val x = args(0).toInt
    val op = args(1)
    val y = args(2).toInt

    val result = Calculator.calc(x, y, op)

    println(s"$x $op $y = $result")
  }
}