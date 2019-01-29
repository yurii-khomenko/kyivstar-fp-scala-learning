//
//
//val doubleEvens: PartialFunction[Int, Int] = {
//  case x if (x % 2) == 0 ⇒ x * 2
//}
//
//val tripleOdds: PartialFunction[Int, Int] = {
//  case x if (x % 2) != 0 ⇒ x * 3
//}
//
//val myFunction = doubleEvens orElse tripleOdds
//
//myFunction(4)
//
//
//
//List(1, 2, 3) map (_ * 2)
//
//List(1, 2, 3) map myFunction
//
//List(1, 2, 3) map {
//  case x if (x % 2) == 0 ⇒ x * 2
//  case x if (x % 2) != 0 ⇒ x * 3
//}


val goStis: PartialFunction[Int, Int] = {
  case x if (x % 2) == 0 ⇒ x * 2
}

val goDbss: PartialFunction[Int, Int] = {
  case x if (x % 2) != 0 ⇒ x * 3
}

val saveToDb = (x: Int) ⇒ x + 5

val whatToDo = goStis orElse goDbss andThen saveToDb

//val whatToDo = goStis.orElse(goDbss).andThen(saveToDb)