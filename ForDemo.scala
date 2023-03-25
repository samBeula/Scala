object ForDemo {
  def main(args: Array[String]): Unit = {

    for (i<-1 to 10){
      print(i+" ")
    }
    println()

    for (i<- 1 until 10){
      print(i+" ")
    }
    println()

    for (i<-1 to 10 if i%2==0){
      print(i+" ")
    }
    println()

    for (i <- 20 to 1 by -2) {
      print(i + " ")
    }
    println()

    for (i <- 1 to 20 by 2) {
      print(i + " ")
    }
    println()

  }
}
