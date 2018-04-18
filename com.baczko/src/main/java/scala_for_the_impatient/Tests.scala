package scala_for_the_impatient

object Results extends App{
  
  assert(Ch2_ex06.unicodeProduct("Hello") == 9415087488L)
  println(Ch2_ex06.unicodeProduct("Hello"))
  println(Ch2_ex09.recUnicodeProduct("Hello"))
  
  println(Ch2_ex10.powerOfInt(2, 6))
  assert(Ch2_ex10.powerOfInt(2, -3) == 0.125)
  
  
}