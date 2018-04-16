package scala_for_the_impatient

object Ch2_ex06 extends App {

  def UnicodeProduct(input: String) : Long = {
   var result: Long = 1
   
   for (c <- input) result *= c.toLong
   result
 }
}