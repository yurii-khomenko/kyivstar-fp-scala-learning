

val xValues = 1 to 4
val yValues = 1 to 2

val coordinates = for {
  x <- xValues
  if x != 1
  y <- yValues
  if y != 1
  myX = 2 * x * y
} yield (x, y, myX)


import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}


val f1 = Future {
  Thread.sleep(1000)
  println("1")
  2 + 2
}

val f2 = Future {
  println("2")
  2 + 4
}

val f3 = for {
  x <- f1
  f5 <- Future{
    println("3")
    x + 2
  }
  y <- f2
} yield {
  println("4")
  x + y + f5
}

val result = Await.result(f3, 2 seconds)

val s = IndexedSeq(1, 2, 3)

"123".toInt