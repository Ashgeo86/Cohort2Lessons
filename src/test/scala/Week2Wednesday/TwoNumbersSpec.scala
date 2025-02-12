package Week2Wednesday

import Week2.Wednesday.TwoNumbers
import org.scalatest.flatspec.AnyFlatSpec

class TwoNumbersSpec extends AnyFlatSpec {

  "add" should "add x and y" in { //"method name from TwoNumbers" should "describe what it needs to do" in {}(runs the test)
    val numbers = new TwoNumbers(1,2) //create val "any name you want" = new "class from TwoNumbers"(parameters) - makes a new instance of my class so I can access the methods
    assert(numbers.add == 3) //this will return a Boolean (is the method same as what is expected).Put here the expected result - number will equal 3 (1+2)
  }

  "subtract" should "subtract x from y" in { //y-x = 2-1
    val numbers = new TwoNumbers(1,2)
    assert(numbers.subtract == 1)
  }

  "multiply" should "multiply x and y" in {
    val numbers = new TwoNumbers(2,3)
    assert(numbers.multiply == 6)
  }


  // we want to test edge cases. We want our tests to be able to fail, but they still need to compile
//  "multiply" should "error when the input is a double" in {
//    val numbers = new TwoNumbers(2.5,3)
//    assert(numbers.multiply != 7.5)
//  }

}