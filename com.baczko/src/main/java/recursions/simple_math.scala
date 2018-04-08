package recursions

object simple_math {
  
  //greatest common denominator
  def gcd (a: Int, b: Int) : Int =
    if (b == 0) a else gcd(b, a % b)
    
  def factorial (a: Int) : Int =
    if (a == 0) 1 else a * factorial(a - 1)
    
  def square (a: Int) : Int = a * a   
    
  //sum of squares of int between a and b
  def sumOfSquares (a: Int, b: Int) : Int =
    if (a > b) 0 else square(a) + sumOfSquares(a + 1, b) 
}