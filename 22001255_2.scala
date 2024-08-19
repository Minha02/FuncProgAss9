import scala.io.StdIn.readLine

object PatternMatchingExample {

  @main def main(): Unit = {
    println("Please input an integer: ")

    try {
      val input = readLine().toInt

      val matchInput: Int => Unit = {
        case x if x <= 0 => println("Negative/Zero is input")
        case x if x % 2 == 0 => println("Even number is given")
        case _ => println("Odd number is given")
      }

      matchInput(input)
    } catch {
      case e: NumberFormatException => println("Invalid input. Please provide an integer.")
    }
  }
}
