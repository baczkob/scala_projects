// Make a recursive function that computes 
//product of the Unicode for all characters in the string

package scala_for_the_impatient

object Ch2_ex09 {
  def recUnicodeProduct (input: String): Long = {
   var result: Long = 1
   
   if (input.tail != "") result = input.head.toLong * recUnicodeProduct(input.tail)
   else result *= input.head.toLong
   
   result
  }
}