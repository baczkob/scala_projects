
object MathematicalOperations extends App {
  
   //returns sum of any number of components
  def sumAny(args: Int*){
  var result = 0
  for (arg <- args) result += arg
  result
}

  import recursions.simple_math._
  println(gcd(14, 28))
  println(factorial(5))

  import scala_for_the_impatient._
  Ch2_ex06.unicodeProduct("Hello")
}
