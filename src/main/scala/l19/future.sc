import java.util.Random
//
//import scala.concurrent.ExecutionContext.Implicits.global
//import scala.concurrent.{Await, Future}
//import scala.concurrent.duration._
//
//val f = Future {
//  2
//}
//
//f.foreach(println)
//
//
//val result = Await.result(f, 2 seconds)


val x = () => "a"
val y = x

def x1() = "a"

val z = x1()

x
y
x1()
z



def f = (i: Int) => "sdfsdf"