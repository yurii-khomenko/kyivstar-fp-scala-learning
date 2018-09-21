case class Session(hosts: String, user: String, password: String) {
  def exec(sql: String): String = s"'$sql' was executed"
}

object Session {
  def validate(sql: String): Boolean = !sql.isEmpty
}

object DB {

  private val hosts = "127.0.0.1:9042,127.0.0.1:9043"
  private val user = "user"
  private val password = "pass"

  def connect(): Session = Session(hosts, user, password)
}

val session = DB.connect()
session.exec("SELECT * FROM my.users")

//session.validate()

Session.validate("safdsf")