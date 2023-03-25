import scala.io.StdIn.readInt;

object MatchEg{
def main(args:Array[String])={

println("please enter an integer:");

var ip:Int = readInt();

ip match {

case 1 => println("this is first case");
case 2 => println("this is second case");
case _ => println("this is default case");

}



}
}