import java.util.UUID

case class Address(street: String, number: Int)
case class User(id: UUID, name: String, address: Address)

object DB {

  private val id = UUID.fromString("c9691a94-37c9-4d6d-9f94-033b63944eac")

  private val users = Map(
    id -> User(id, "Vasya", Address("miloslavskaya", 95))
  )

  def getUser(id: UUID) = users.get(id)
}


val id = UUID.fromString("c9691a94-37c9-4d6d-9f94-033b63944eac")

val user = DB.getUser(id)


user match {
  case Some(value) => println(s"user name is: ${value.name}")
  case None =>  println(s"user not found in DB")
}



val u = User(id, "user2", Address("miloslavskaya", 95))

val myid = u.id
val myName = u.name


val User(_, name, Address(_, n)) = u

//println(idd)
println(name)

println(n)