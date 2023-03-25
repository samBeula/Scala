object AnonymousFunctionDemo {
  def main(args: Array[String]): Unit = {
    var af =(i:Int) => {
      println("this is anonymous function")
      i
    }
    println(af(10))

    var test = () => {
      println("hi!")
    }
    test()
    var test1 = (x:String, y:String) => {
      println(s"$x $y")
    }
    test1("Beula","Samantha")

  }
}
