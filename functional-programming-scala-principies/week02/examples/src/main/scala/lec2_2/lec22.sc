def sum(f: Int => Int)(a: Int, b: Int): Int =
  if (a > b) 0
  else f(a) + sum(f)(a + 1, b)

def sumInts(a: Int, b: Int) = sum(x => x)(a, b)
def sumCubes(a: Int, b: Int) = sum(x => x * x * x)(a, b)
def sumFactorials(a: Int, b: Int) =
  sum(fact)(a, b)

def fact(x: Int): Int = if (x <= 1) 1 else fact(x - 1)

sumInts(1, 5)

def sumNew(f: Int => Int)(a: Int)(b: Int): Int =
  if (a > b) 0
  else f(a) + sumNew(f)(a + 1)(b)

val x = sumNew(x=>x)(1)_
val y = x(5)



//--------------------------------------------------
def product(f: Int => Int)(a: Int, b: Int): Int =
  mapReduce(f, (x, y) => x * y, 1)(a, b)

product(x => x * x)(3, 4)

def factNew(n: Int) = product(x => x)(1, n)

factNew(5)

def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
  if (a > b) zero
  else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))