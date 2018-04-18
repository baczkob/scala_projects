/**
 * Write a function that computes x^n , where n is an integer.
 * Use the following recursive definition:
 * • x^n = y^2 if n is even and positive, where y = x^n / 2 .
 * • x^n = x· x^n – 1 if n is odd and positive.
 * • x^0 = 1.
 * • x^n = 1 / x^n if n is negative.
 *
 * Don’t use a return statement.
 */
package scala_for_the_impatient

object Ch2_ex10 {
  def powerOfInt (base : Double, power : Int) : Double = {
    if ( power < 0) 1 / powerOfInt(base, -power)
    else if ( power % 2 == 0 && power > 0) powerOfInt(base, power/2) * powerOfInt(base, power/2)
    else if (power % 2 != 0 && power > 0) base * powerOfInt(base, power -1)
    else 1
  }
}