object StringCompareDemo {
  def main(args: Array[String]): Unit = {
    var a = null
    var b = null
    if(a == b) {
      println("a = b")
    } else {
      println("a != b")
    }

    if (a eq b){
      println("a = b")
    } else {
      println("a != b")
    }

    var c = "sam"
    var d = "SAM"

    if (c == d) {
      println("c = d")
    } else {
      println("c != d")
    }

    if (c eq d) {
      println("c = d")
    } else {
      println("c != d")
    }


  }
}
