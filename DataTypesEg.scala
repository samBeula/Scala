object DataTypesEg{
def main(arg:Array[String])={

var b = true;
println("b: "+b);


var s:Short = 32755;
println("s: "+s);
//s=32766

var i:Int = 2147483645;
println("i: "+i);
//i=2147483648

var l:Long = 922337203685477599l;
println("l: "+l);
//l=9223372036854776000

var f:Float = 32.7777777777777777777777777777777777777777777777777777777777777777777777777777777f;
println("f: "+f);


var d:Double = 32.7777777777777777777777777777777777777777777777777777777777777777777777777777777;
println("d: "+d);


}
}