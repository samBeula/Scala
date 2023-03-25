object FunctionsDemo {



  def main(args: Array[String]): Unit = {
    var adding = sum(20,10)
    println(adding)
    var f = findFactorial(10)
    println(s"10! = $f")
  }

  def sum(a: Int, b: Int): Int = {
    var sum = a + b
    sum
  }

  def findFactorial(n : Long): Long = {
  if (n == 0)  1 else n*findFactorial(n-1)

  }

}
