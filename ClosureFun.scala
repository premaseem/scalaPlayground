object ClosureFun {
   def main(args: Array[String]) {
      println( "multiplier(1) value = " +  multiplier(1,10) )
      println( "multiplier(2) value = " +  multiplier(2,13) )
   }
   var factor = 3
   val multiplier = (i:Int,j:Int) => i * factor
}
