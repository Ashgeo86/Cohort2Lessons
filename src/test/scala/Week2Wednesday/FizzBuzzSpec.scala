package Week2Wednesday

import Week2.Wednesday.FizzBuzz
import org.scalatest.flatspec.AnyFlatSpec

class FizzBuzzSpec extends AnyFlatSpec {

  val fizzBuzz = new FizzBuzz

  "fizzBuzz" should "if divisible by 3 return fizz" in {
  assert(fizzBuzz.fizzBuzz(3) == "Fizz")
  }

  "fizzBuzz" should "if divisible by 5 return fizz" in {
    assert(fizzBuzz.fizzBuzz(10) == "Buzz")
  }

  "fizzBuzz" should "if divisible by 3 and 5 return fizz" in {
    assert(fizzBuzz.fizzBuzz(15) == "FizzBuzz")
  }
}
