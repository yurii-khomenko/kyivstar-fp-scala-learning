def mul3(x: Int) = x * 3

def sum3(x: => Int) = x + 3

def fun = {
  println("xxxxxxx")
  2
}


val y = mul3(2 * fun) // mul3(4)
val z = sum3(2 * fun) // mul3(2 * 2)


println(y)
println(z)


"994FF312-111E-11E5-9FDE-E0B9A54A6D97".toLowerCase()