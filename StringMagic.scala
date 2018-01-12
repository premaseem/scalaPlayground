object StringMagic{

def main(args: Array[String]){
var greeting = "Hello world!";
var greeting1:String = "Hello world!";

// printf like C
var floatVar = 12.456
      var intVar = 2000
      var stringVar = "Hello, Scala!"

      var fs = printf("The value of the float variable is " + "%f, while the value of the integer " + "variable is %d, and the string" + "is %s", floatVar, intVar, stringVar);

      println(fs)

// The ‘f’ String Interpolator
val height = 1.9d
val name = "James"
println(f"$name%s is $height%2.2f meters tall") //James is 1.90 meters tall

// The ‘s’ String Interpolator
val name1 = "James"

println(s"Hello, $name1")
println(s"1 + 1 = ${1 + 1}")

}

}
