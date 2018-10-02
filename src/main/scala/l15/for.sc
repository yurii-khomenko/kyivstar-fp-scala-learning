for (x <- 1 to 4; y <- 1 to 2)
  println(s"$x:$y")

for {
  x <- 1 to 4
  y <- 1 to 2
}
  println(s"$x:$y")


for {
  x <- 1 to 4
  if x != 3
  y <- 1 to 2

  z = x * y
}
  println(s"$x:$y -- $z")


val array =

  for {
    x <- 1 to 4
    if x != 3
    y <- 1 to 2

    z = x * y
  }
    yield (x, y, z)


//(1 to 4)
//  .map(i => {
//    println(s"$i processed map")
//    i * i
//  })
////
////  .filter(y => {
////    println(s"$y processed filter" + i)
////    y != 9
////  })


Stream(1, 2, 3, 4)
  .filter(y => {
    println(s"$y processed filter")
    y != 3
  })
  .map(i => {
    println(s"$i processed map")
    i * i
  })
  .toList