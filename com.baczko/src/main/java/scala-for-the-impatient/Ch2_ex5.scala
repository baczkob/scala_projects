/**
 * Write a procedure countdown(n: Int) that prints the numbers from n to 0.
 */

Object Ch2_ex5 extends App {
  def countdown(n: Int) {
    for (i <- n to 0) println(i)
  }
  
  countdown(15)
}
