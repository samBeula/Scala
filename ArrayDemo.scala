object ArrayDemo {
  def main(args: Array[String]): Unit = {
    val a1 = Array.ofDim[Int](n1 = 2,n2 = 2)
    var n:Int = 2
    val a2 = Array(Array(1,2,3,4),Array(3,4,5,7))
    a1(0)(0) = 10
    a1(0)(1) = 20

    println(a1(0)(0))

    for (i <- 0 until n; j <- 0 until n) {
      print(i,j)
      println(" = " + a1(i)(j))
    }

    println("first array")
    for (i <- 0 until 2) {
      for (j <- 0 until 2) print(s" ${a1(i)(j)}")
      println()
    }

    println("second array")
    for (i <- 0 until 2) {
      for ( j <- 0 until 4) print(s" ${a2(i)(j)}")
      println()
    }

    println("third array")
    val a3 = Array(Array(1,2,3,4),Array(5,7,8,9),Array(10,11,12,13),Array(14,15,16,17))
    for (i <- 0 until 4) {
      for (j <- 0 until 4) print(s" ${a3(i)(j)}")
      println()
    }
    val a4 = Array(1,2,3,4,5,6,7,8,9,10)
    a4.foreach(n=>{
      if (n==5) println("\nFive") else print(s" $n")
    })

    println()
    a4.foreach(n=> print(s" $n"))

    println("\nthird array")
    a3.foreach(printArr) // place holder notation

    def printArr(arr:Array[Int]): Unit = {
      arr.foreach(printValue)
      println()
    }

    def printValue(i:Int): Unit = {
      print(s" $i")
    }

  }
}
