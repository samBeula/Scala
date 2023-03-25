import scala.io.StdIn.readInt

object DoWhileCalc {
  def main(args: Array[String]): Unit = {
    do{
      println("please enter first number:")
      var a = readInt()
      println("a = " + a)

      println("please enter second number:")
      var b = readInt()
      println("b = " + b)

      println("please enter:\n 1 for + \n 2 for - \n 3 for * \n 4 for / :")
      var s = readInt()

      s match {

        case 1 => println("a + b = " + (a + b))
        case 2 => println("a - b = " + (a - b))
        case 3 => println("a * b = " + (a * b))
        case 4 => println("a / b = " + (a / b))
        case _ => println("enter correct operation")
      }
    }while (true)
  }
}
