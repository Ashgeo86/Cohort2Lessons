package Week4.Monday

import scala.annotation.tailrec

object Recursion extends App {

  //Standard recursion
  //recursive calls which call the original method inside the method
  //each new call adds to the call stack
  //method will remember all of these calls before completing
  //will continue to recursively call until the base case is reached
  //only once the base case is reached, it will resolve in reverse order

  //Factorial method - multiplies all positive Ints in a list (e.g input = 4 --> 4x3x2x1)

  def factorial(n: Int): Int = {
    if (n <= 1) { //starting with how I escape the recursion
      1 //base case - when you get to 1, return 1 and then the stored call stack can start unwinding
    } else {
      println(s"Incoming n is: $n")
      println(s"New n: ${n-1}")
      val finalResult = n * factorial(n-1)//take n and times it by the number below it
      println(s"Final n call: $n") //won't reach this until the base case has been reached and it starts unwinding through the call stack
      finalResult
    }
  }

  println(factorial(4))
  //Example of above working if factorial is 4
  //Recursive loop - call stack -- not yet evaluated (waiting until the loop ends the evaluate)
  //factorial(4) --> 4 x factorial(4-1) --> factorial(3) - bottom
  //factorial(3) --> 3 x factorial(3-1) --> factorial(2)
  //factorial(2) --> 2 x factorial(2-1) --> factorial(1) - top
  //factorial(1) --> hits base case (exit the recursive loop) --> return 1
  //UNWIND --> top to bottom
  //factorial(2) --> 2 x factorial(2-1) --> 2 x factorial(1) --> 2 x 1 = 2
  //factorial(3) --> 3 x factorial(3-1) --> 3 x factorial(2) --> 3 x 2 = 6
  //factorial(4) --> 4 x factorial(4-1) --> 4 x factorial(3) --> 4 x 6 = 24 (4x6 because of above calculation)
  //Final result = 24

  //Stack overflow error - there is only so much memory in the call stack. If this is exceeded we get this error
  //println(factorial(10000))

  //** Tail recursion */
  //Smarter way to write recursion because it stops stack overflow errors
  //key differences:
  //1. recursive call must be the last operation a function performs (@tailrec - will check this)
  //2. Prevents stack overflow error:
  //a. doesn't need to remember all previous values, all needed info is passed through as an accumulator (acc)
  //b. scala replaces recursive calls with a simple loop under the hood, called Tail call optimisation (TCO)
  //Replaces and updates the acc with every recursive call

  //1st - with a helper method

  def smarterFactorial(n: Int): Int = {
    @tailrec
    def factorialHelper(x: Int, acc: Int): Int = { //helper - don't have to change the original method signature
      if (x <= 1) acc //acc stores the intermediate value, don't need to have a large memory as call stack is being updated each time
        //acc will store, pass in and update each time
      else {
        println(s"\nCurrent X: $x")
        println(s"Value of current acc: $acc")
        factorialHelper(x-1, acc * x) //last expression - tail recursive. Overrides any old values and passes in new updated acc each time
        //x -1 --> moving down our numbers list
        //acc * x --> running total
      }
    }
    factorialHelper(n, 1) //calls the helper, pass in the original n so we start the recursion at the top level, acc will start at the if case
  }

  println("\nTail rec with helper: " + smarterFactorial(4))


  //Tail recursion without helper
  @tailrec
  def smarterFactorialWithoutHelper(n: Int, acc: Int = 1): Int = {
   if (n <= 1) acc
   else smarterFactorialWithoutHelper(n - 1, acc * n)
  }
  println("\nTail rec without helper: " + smarterFactorialWithoutHelper(4))

  //Example with String
  def concatenateWords(aWord: String, n: Int, acc: String): String = {
    if(n<=0) acc
    else concatenateWords(aWord, n-1, aWord + acc)
  }
  println("Hello World!", 3, "")
  
}
