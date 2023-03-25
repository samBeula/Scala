object CurringDemo {
  def add(x: Int, y: Int): Int = x + y

  def add2(a: Int): Int => Int = (b: Int) => a + b;

  def main(args: Array[String]): Unit = {
    println(add(20, 19))
    println(add2(10)(20))
  }

}
