object CodeBlockDemo {
  def main(args: Array[String]): Unit = {
    var i = {
      var j = 10
      var k = j*(j-1)
      k
    }
    println(i)
  }
}
