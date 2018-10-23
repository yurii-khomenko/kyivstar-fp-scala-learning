def parseString(line: String): Either[String, Int] = {

  try {
    Right(line.toInt)
  } catch {
    case e: NumberFormatException => Left("unable to parse: " + line)
  }
}

val maybeInt = parseString("1")

maybeInt match {
  case Right(value) => println(s"value is Int, value=$value")
  case Left(value) => println(s"parse error: $value")
}


val value = maybeInt.fold(
  left => 0,
  right => right
)

value