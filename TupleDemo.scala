object TupleDemo {
  def main(args: Array[String]): Unit = {
    var t1 = (1,2.0,3l,4.1,"test")
    var t2 = Tuple5(1,2.0,3l,4.1,"test")
    var t3 = Tuple6(1,2.0,3l,4.1,"test",(2,3))
    var t4 = new Tuple6(1,2.0,3l,4.1,"test",(2,3))

      println(t1._1)
      println(t3._6._1)

    println("t2")
    t2.productIterator.foreach((x) => println(x))

    println("t2")
    t2.productIterator.foreach(println(_))

    println("t5")
    var t5 = ("a"->"b")
    println(t5)

    println("t5")
    var (z,i) = t5
    println(z)
    println(i)
  }
}
