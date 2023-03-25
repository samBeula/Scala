object ArrayPartition {
  def main(args: Array[String]): Unit = {
    var a1 = Array(1,2,3,4,5,7,8,9)
    var a2 = a1.map((x)=>{x*2})
    a2.foreach(print(_))
    println()
    var a3 = a1.map(_*3)
    a3.foreach(print(_))

    println("\ntype 1 partition")
    var (even,odd) = a1.partition((p) => {
      if (p%2==0) true else false
    })
    even.foreach(println(_))
    odd.foreach(println(_))

    println("type 2 partition")
    var (even1, odd1) = a1.partition(_%2==0)
    even1.foreach(println(_))
    odd1.foreach(println(_))
  }
}
