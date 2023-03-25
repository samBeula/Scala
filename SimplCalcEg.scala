import scala.io.StdIn.readInt;
import scala.io.StdIn.readLine;

object SimpleCalcEg{
def main(args:Array[String])={

println("please enter first number:");
var a = readInt();
println("a = "+a);

println("please enter second number:");
var b = readInt();
println("b = "+b);

println("please enter + or - or * or /");
var s = readLine();

s match {

case + = println("a + b = "+(a+b));
case - = println("a - b = "+(a-b));
case * = println("a * b = "+(a*b));
case / = println("a / b = "+(a/b));
case - = println("enter correct operation");

}

}
}