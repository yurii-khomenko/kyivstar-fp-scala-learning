import java.util.UUID

case class Car(id: UUID, name: String)

case class Dto(cid: UUID, car: Car, errorId: Int, errorMsg: String)

val x = Dto(UUID.randomUUID(), Car(UUID.randomUUID(), "cactus"), 0, "")

def fun(x: Any) = x match {

  case Dto(_, c@Car(_, "cactus"), _, _) => println("match! " +  c.id)
  case _ => println("mismatch")
}

fun(x)