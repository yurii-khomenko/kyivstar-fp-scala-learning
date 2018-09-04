import scala.annotation.tailrec

val list = List(
  "(if (zero? x) max (/ 1 x))",
  "I told him (that it’s not (yet) done). (But he wasn’t listening)",
  ":-)",
  "())(")

def balance(chars: List[Char]) = {

  @tailrec
  def balance(count: Int, chars: List[Char]): Boolean =
    if (count < 0) false
    else if (chars == Nil) count == 0
    else if (chars.head == '(') balance(count + 1, chars.tail)
    else if (chars.head == ')') balance(count - 1, chars.tail)
    else balance(count, chars.tail)

  balance(0, chars)
}

balance(list(0).toList)
balance(list(1).toList)
balance(list(2).toList)
balance(list(3).toList)