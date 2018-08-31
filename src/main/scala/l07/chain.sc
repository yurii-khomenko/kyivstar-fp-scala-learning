
val chain = List(1, 2, 3, 4, 5, 6, 7, 8)

def length(chain: List[Int]): Int =
  if (chain == Nil) 0
  else 1 + length(chain.tail)

length(chain)