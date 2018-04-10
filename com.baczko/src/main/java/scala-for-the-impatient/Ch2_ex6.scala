/**
 * Write a for loop for computing the product of the Unicode codes of all letters in a string.
 * For example, the product of the characters in "Hello" is 9415087488L .
 */

Object Ch2_ex6 extends App {
  def UnicodeProduct(input: String) : Int ={
	var result = 1
	  for (s <- 0 to input.length - 1) result *= (int) input[s]
  }
  
  assert (UnicodeProduct("Hello") == 9415087488L)
}
