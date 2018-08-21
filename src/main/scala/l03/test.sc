
def sum(a: Int, b: Int) = a + b
def sub(a: Int, b: Int) = a - b
def mul(a: Int, b: Int) = a * b
def div(a: Int, b: Int) = a / b

def calc(a: Int, b: Int, op: (Int, Int) => Int) = op(a, b)

val sumF = (a: Int, b: Int) => a + b

calc(4, 5, sumF)

calc(4, 5, (a, b) => a + b)
calc(4, 5, _ + _)
calc(4, 5, _ - _)
calc(4, 5, _ * _)
calc(4, 5, _ / _)
