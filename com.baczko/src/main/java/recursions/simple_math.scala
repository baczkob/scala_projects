package recursions

object simple_math {
  
  //greatest common denominator
  def gcd (a: Int, b: Int) : Int =
    if (b == 0) a else gcd(b, a % b)
    
  def factorial (a: Int) : Int =
    if (a == 0) 1 else a * factorial(a - 1)
}