import scala.annotation.tailrec
def factorial(n: Int): Int =
  if (n == 1) 1
  else n * factorial(n - 1)


factorial(5)


def factTail(n: Int): Int = {
  @tailrec
  def factStep(n: Int, acc: Int): Int =
    if (n == 1) acc
    else factStep(n - 1, acc * n)

  factStep(n, 1)
}

factTail(5)


def recBinary(n: Int): Int = {

  println(n)

  if (n == 1) 1
  else n + recBinary(n - 1) + recBinary(n - 1)
}


recBinary(3)