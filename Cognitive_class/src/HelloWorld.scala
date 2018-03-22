

object HelloWorld extends App {
  val hello = "Hello"
  def echo(message: String): Unit = println(message * 2)
  println("Hello world!")
  
  echo("I am smart! ")
}