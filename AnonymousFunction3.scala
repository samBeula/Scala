object AnonymousFunction3 {
  def main(args: Array[String]): Unit = {
    var x1 = 10
    var k = {
      var a1 = 10
      var a2 = 10
      var a3 = 10
      var a4 = 10
      a1*a2*a3*a4
    }
    println("---------------")
    println(k)
    println("---------------")
  }
}
