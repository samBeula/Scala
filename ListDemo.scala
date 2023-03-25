object ListDemo {
  def main(args: Array[String]): Unit = {
    val l1 = List(1,2,3,4,5,6)
    val l2 : List[String] = List("abc","xyz")
    val l3 = Nil
    val l4 = List.empty

    println("l1")
    println(l1)

    println("l2")
    println(l2:::(3::Nil))

    val v3 = List.fill(7)("sam")
    println(v3)
    println(v3.size)
    println(v3.length)
    println(l1.length)
    println(l1.apply(2))
    println(l1(1))

    for (i <- l1) print(s" $i")
    println()
    println(l1.head)
    println(l1.tail)





  }
}
