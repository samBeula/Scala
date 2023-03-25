object StudentEg{
def main(args:Array[String])={

var a = args(0);
println("a: "+a);

var m = args(1).toInt;
println("maths: "+m);


var s = args(2).toInt;
println("science: "+s);

var e = args(3).toInt;
println("english: "+e);

var total = m+s+e;
println("total: "+total);

var percentage:Float = (total*100f)/300f;
println("percentage: "+percentage);

if (percentage>90.0f) {
println("First class");
} else if (percentage>80.0f) {
println("Second class");
} else if (percentage>70.0f) {
println("Third class");
} else if (percentage>30.0f) {
println("Pass");
} else {
println("Fail");
}


}
}