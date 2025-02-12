package Week2.Wednesday

class FizzBuzz {

  def fizzBuzz(x: Int): String = {
    if (x % 3 == 0 && x % 5 == 0 && x != 0) { // if x divides into 3 perfectly, and divides into 5 perfectly, and is not zero
      "FizzBuzz"  //return "FizzBuzz"
    } else if (x % 3 == 0 && x != 0) { //if x divides in to 3 perfectly and is not zero
      "Fizz"  // return "Fizz"
    } else if (x % 5 == 0 && x != 0) {  // if divides in to 5 perfectly and is not zero
      "Buzz"  // return "Buzz"
    } else {
      x.toString  //take number and convert in to string
    }
  }


}