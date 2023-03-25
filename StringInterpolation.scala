object StringInterpolation {

    def main(args: Array[String]): Unit = {
      var x = 10
      var y = 2.2f
      var s = s"x = $x"

      println(s)
      println(f"y = $y%.5f")
      println(f"printing interpolation string s: $s%S")
      println(raw"the value of \n x = $x")
      println(s"the value of \n x = $x")
      println(s"the value $$ of x = $x")
    }

}
