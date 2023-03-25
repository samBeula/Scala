import scala.io.StdIn.readLong

object FactorialDemo {
  def main(args: Array[String]): Unit = {

    println("please enter a number:")
    var n = readLong()
    println("n = " + n)
    var f:Long = 1l
    if ( n == 0 ) {
      println("0! = " + 1)
    } else {
      while(n>=1){
        f = f*n
        n = n-1
      }
      println(s"n! = $f")
    }
  }
}
