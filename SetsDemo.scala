import scala.collection.immutable.TreeSet

object SetsDemo {
  def main(args: Array[String]): Unit = {
    val s0 = TreeSet(1, 2, 3, 3, 3, 4, 4, 5, 6, 7)
    println(s0)
    val s1 = Set(1,2,3,3,3,4,4,5,6,7)
    println(s1)
    println(s1.head)
    println(s1.tail)

    val s2 = s1.map(x => x+x)
    val s3 = s1.flatMap(x => List((x+x),10,20))
    println(s2)
    println(s3)

    println(s1.isEmpty)
    println(s2.apply(2))
    val s4 = s1.diff(s2)
    println(s4)
    val s5 = s1.intersect(s2)
    println(s5)
    val s6 = s1.union(s2)
    println(s6)
    s6.foreach(x => print(x+","))
    for (e <- s1) println(e)
    val s7 = s1 ++ s5
    println(s7)
  }
}
