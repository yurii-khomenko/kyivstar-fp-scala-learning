package l13

object Calculator {

  def calc(x: Int, y: Int, op: String) = op match {

    case "+" => x + y
    case "-" => x - y
    case "*" => x * y
    case "/" => x / y

    case operation => throw new RuntimeException(s"operation '$operation' not supported")
  }
}