object FebonacciDemo {
  def main(args: Array[String]): Unit = {
    val n = 20
    for (i<- 0 to n - 1 ) {
      print(febonacci(i)+" ")
    }

  }
  def febonacci(n: Int):Int={
    if (n == 0 || n == 1) {
      n
    } else {
      febonacci(n-1) + febonacci(n-2)
    }
  }
}
