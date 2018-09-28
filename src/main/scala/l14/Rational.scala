package l14

case class Rational(n: Int, d: Int) {

  require(d != 0)

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g

  def +(that: Rational) = Rational(
    numer * that.denom + that.numer * denom,
    denom * that.denom
  )

  def *(that: Rational) = Rational(
    numer * that.n,
    denom * that.d
  )

  override def toString = s"$numer/$denom"
}