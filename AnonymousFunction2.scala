object AnonymousFunction2 {
  def main(args: Array[String]): Unit = {
    var anf = (a:String,b:String) => a+b
    var anf1 = (_:String) + (_:String)
    println(anf("Beu","la"))
    println(anf1("Sam","antha"))
  }
}
