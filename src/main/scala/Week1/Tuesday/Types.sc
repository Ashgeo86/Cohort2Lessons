/**
 * Int - whole number --> 4 bytes
 * Long - whole number --> 8 bytes
 * Short - whole number --> 2 bytes
 * Double - simple decimal (same in java)
 * Float - 2.0f (Rarely seen)
 * String - "Text"
 */

val one: Int = 1
val inferredOne = 1 // Haven't told Scala that it's an Int, it has inferred the type. Not safe.

val two: Int = 250050503
val string: String = "Hello there"
val boolean: Boolean = false

val double: Double = 6.7
val biggestInt: Int = 2147483647
val long: Long = 3147483647L