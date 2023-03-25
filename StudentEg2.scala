import scala.io.StdIn.readLine;
import scala.io.StdIn.readInt;

object StudentEg2{
def main(args:Array[String])={

println("please enter the name:");

var name = readLine();

println("please enter the maths marks:");
var m = readInt();
println("maths: "+m);

println("please enter the science marks:");
var s = readInt();
println("science: "+s);

println("please enter the english marks:");
var e = readInt();
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