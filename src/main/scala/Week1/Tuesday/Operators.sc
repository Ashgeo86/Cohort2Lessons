/**
 * Arithmetic operators
 */

val a: Int = 10
val b: Int = 5
val c: Int = 3

//Add
a + b
//Subtract
a - b
b - c
//Divide
a / b
b / c
//Multiply
a * b
b * a
c * c
//Modulus
a % c // (10 % 3) - 3 goes into 10 3 times, with 1 left over. Result = 1
a % b

/**
 * Relational operators
 */

//Equality
a == a
a == b
//Inequality
a != a
a != b
//Less than
b < a
a < c
//Less than or equal to
b <= a
a <= a
//Greater than
a > b
b > c
//Greater than or equal to
a >= c
c >= c

/**
 * Logical operators
 */

//AND
true && true
true && false
(3<6) && (6>7)
//Or
true || false
false || true
false || false
(3<6) || (6>7)
(3>6) || (6<7)
//Not
!false
!true

//Task1
true && true
true && false
false && true
false && false

true || true
true || false
false || true
false || false

!true
!false

//Task2
(4+3) * 55 < 300
96 / 12 >= 8
"hamster" < "hippo"
(8 % 2) == 0
(156 / 8) < 20 && 54 < 20 && (54 / 4) < 14