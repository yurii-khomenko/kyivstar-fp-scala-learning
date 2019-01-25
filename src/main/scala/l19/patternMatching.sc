

val x: Any = "asdasda"

def fun(x: Any) = x match {

  case i: Int if i >= 123 => "!!!!!!!"
 // case i => "!!!"
  case _ =>
}


fun(x)