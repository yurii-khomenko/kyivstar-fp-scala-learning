import java.util.UUID

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

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

def transform(messages: List[Message]): Future[List[Message]] = Future {
  messages.map(m => m.copy(message = m.message.replaceAll(dangerousText, "")))
}
def load(messages: List[Message]): Future[List[Message]] = Future {
  messages
}

val loadF = extract().flatMap(transform).flatMap(load)

val result = Await.result(loadF, 3 seconds)

result.foreach(println)