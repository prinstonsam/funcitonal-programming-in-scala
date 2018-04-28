class Rational(x: Int, y: Int) {
  require(y != 0, "Denom must be nonzero")

  def this(x:Int) = this(x,1)


  def numer = x;

  def denom = y;

  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def neg: Rational = new Rational(-numer, denom)

  def sub(that: Rational) =
    add(that.neg)

  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    def less(that: Rational) =
      if (numer * that.denom < that.numer * denom) this else that

    def max(that: Rational) = if (this.less(that) == this) that else this

  override def toString ={
    val g = gcd(numer, denom)
    numer/g + "/" + denom/g
  }
}

val y = new Rational(1, 3)
val x = new Rational(5, 7)
val z = new Rational(3, 2)
val c = new Rational(9, 21)
//x.add(y).mul(z)


x.sub(y).sub(z)

y.gcd(100, 52)

5 % 7
1 % 3

val a = new Rational(1, 3)
val b = new Rational(5,3)

a.less(b)
a.max(b)
val asdf = new Rational(3)




