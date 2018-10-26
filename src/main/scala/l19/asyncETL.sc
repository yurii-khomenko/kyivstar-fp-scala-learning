import java.util.UUID

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}
import scala.concurrent.duration._

case class Message(id: UUID, message: String)

val dangerousText = """18\+"""

def extract(): Future[List[Message]] = Future {
  List(
    Message(UUID.randomUUID(), "message1"),
    Message(UUID.randomUUID(), "message2 18+"),
    Message(UUID.randomUUID(), "message3"),
    Message(UUID.randomUUID(), "message4 18+"),
    Message(UUID.randomUUID(), "message5")
  )
}

def transform(messages: Future[List[Message]]): Future[List[Message]] =
  messages.map(
    _.map(m => m.copy(message = m.message.replaceAll(dangerousText, "")))
  )

def load(messages: Future[List[Message]]) =
  messages


val extractF = extract()
val transformF = transform(extractF)
val loadF = load(transformF)

loadF.foreach(_.foreach(println))

Await.ready(loadF, 3 seconds)
