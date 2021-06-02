package lectures.part1basics

object ValuesVariablesTypes extends App {
  //VALUES ARE IMMUTABLE, NO NEED TO SPECIFY TYPES, COMPILERS CAN INFER TYPES
  val x: Int = 42
  val y = 42
  val str: String = "Sharmila"
  val str1 = "Sharmila"

  val aBool: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 1
  val aLong: Long = 527890456789L
  val aFloat: Float = 2.0f
  val aDouble: Double = 55.6

  //variables --> can be reassigned/mutable
  var aVariable: Int = 4
  aVariable = 5
  println(aVariable)
//Functional programming involves working less with variable. Hence prefer vals over vars

}
