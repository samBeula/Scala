object NestedFunctionDemo {
  def main(args: Array[String]): Unit = {

  findMinMax(2000,72)

  }

  def findMinMax(i: Int, j: Int): Unit = {
    def max(i: Int, j: Int): Unit = {
      if (i > j) println(s"$i is maximum")
    }

    def min(i: Int, j: Int): Unit = {
      if (i < j) println(s"$i is minimum")
    }
    max(i,j)
    min(i,j)
  }

}
