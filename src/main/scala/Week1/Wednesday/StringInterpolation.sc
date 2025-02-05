/**
 * String Interpolation
 */

// S
val name: String = "Ash"
println(s"My name is $name") //$ tells scala what val to look for.

println(s"3 x 3 = ${3*3}") //curly brackets are used for calculations

val a: Int = 1976
val b: Int = 6
println(s"a x b = ${a*b}")

// Above is helpful when debugging code. Print the result at certain points in a method.

// f
//Common format specifiers (type safety):
// %f - float, double
// %d - Int, long
// %s - string

val height: Double = 1.9
println(f"$name%s is $height%.2f metres tall")
// $ pulls in the information you want added (name from line 6, height from line 23.
// %s after name, as it's a string, %f after height as it's a double.
// Adding in .2 before the f changes it to two decimal places
// S interpolation won't recognise formatting. You need to use F interpolation.

math.Pi // built in library already in scala (same with days of week etc). Google to check!

println(f"Pi to 2 d.p is ${math.Pi}%.2f")
// Calculates Pi to 2 decimal places. Using f at the start as Pi is a double.

println(f"Pi to 5 d.p is ${math.Pi}%.5f")
println(f"Pi to 5 d.p is ${math.Pi}%20.1f") // Add padding (20 spaces)

// printf = String
printf("'%s'", "Hello")
// Add spaces before
printf("'%20s'", "Hello")
// Add padding after
printf("'%-20s'", "Hello")
// Add padding before and after
printf("'%20s%-20s'", "Hello", "")

// raw interpolation
//s interpolation example to compare
println(s"I'm going onto a \nnew line") // s interpolation recognises \n as new line.
println(raw"I'm going onto a \nnew line") // raw just prints whatever you write.

// Common use of raw --> Regex (when we want something to look a certain way.
// e.g if you want a password to look a certain way, or postcode to have a space etc.

//String interpolation task
val name: String = "Ash"
val name2: String = "Alistair"
println(s"$name is older than $name2")

val age1: Int = 38
val age2: Int = 32
println(s"$name is ${age1-age2} years older than $name2")

val age1: Double = 38.55465
val age2: Double = 32.34456
println(f"$name is ${age1-age2}%.1f years older than $name2")

println(raw"\n\n\n\n\n\n\n\nsameline\n\n")