package scala_for_the_impatient
/**
 * Write a Scala equivalent for the Java loop
 * for (int i = 10; i >= 0; i--) System.out.println(i);
 */

object Ch2_ex4 extends App {
  
  for (i <- 10 to 0) println(i)
}
