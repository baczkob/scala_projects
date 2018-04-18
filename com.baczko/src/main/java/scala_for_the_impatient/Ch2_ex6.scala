/*in fact this piece of code mixes requirements from exercices 
 * from 6-8 in which reader is to create a) for loop b) not use loop
 * c) function that computes the Unicode code of all letter of a string
 */

package scala_for_the_impatient

object Ch2_ex06 extends App {

  def unicodeProduct(input: String) : Long = {
   var result: Long = 1
   
   for (c <- input) result *= c.toLong
   result
 }
}