import scala.util.{Failure, Success, Try}

val divide = Try {
  1 / 0
}

divide

divide.isFailure

divide match {
  case Success(value) => println(s"result = $value")
  case Failure(exception) => println(s"exception text: ${exception.getMessage}")
}