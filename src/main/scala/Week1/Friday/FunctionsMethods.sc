/** Examples */

(number: Int) => number + 1 //Anonymous function. Cannot reuse anywhere else

val addition = (number: Int) => number + 1 //Named function. Only name when we want to reuse. Can't ovveride - immutable.

def addition (number:Int): Int = number + 1 //Method (also a type of function). Named so it can reuse. Must be named.

def addition (number:Int): Int = number + 10 //Override

//Examples of a method
val aValue = 2<3
def aDifferentValue: Int = {
  if (aValue) 564 else 865
  42 //last expression must match the methods return type - Int here
}
// Only 42 will be returned because it is the last expression in the method

def makeACoffee: String = {
  "Add coffee to boiling water"
  "Add sugar or/and milk if required"
  "Stir"
  "Enjoy!"
}
makeACoffee
//As there is no parameter, all we get returned is the last expression - "enjoy!"

def makeATea(sugar:Int, splashesOfMilk: Int): String = {
  s"Add boiling water to your mug with a tea bag, add $sugar spoons of sugar and $splashesOfMilk splashes of milk and stir"
}
//As there is a parameter (sugar), we have to let it know what we need
makeATea(7, 2)
//This now adds sugars and splashes of milk to the result
makeATea(sugar = 7, splashesOfMilk = 2)
//Name the parameter to be helpful for readability when the types are the same!

val vat: Double = 1.2
def priceIncVat(priceOfItem:Double): Double = {
  priceOfItem * vat
}
//You now need to call the method to run it, using a price and it will add the VAT
priceIncVat(3.99)


//Create a method called getBigVal that takes in two Ints called input1 and input2
// and returns a string
//Method should return value 'first' if input 1 is greater than input 2
//should return 'second' if input1 is smaller than input2
//Should return 'same' if equal
def getBigVal(input1:Int, input2:Int): String = {
  if (input1 > input2) "first"
  else if (input1 < input2) "second"
  else "same"
}
getBigVal(2, 5)

//Create a method called 'nameLength' that takes two Strings called firstName and
//surname and returns an integer
//The result of the method should return the length/size of the name which is greater
//If both names are the same length, return 0
def nameLength(firstName: String, surname: String): Int = {
  if (firstName.length > surname.length) { firstName
  } else if (firstName.length < surname.length) {
    surname.length
  } else {
    0
  }
}

nameLength("Tom", "Hiddleston")

/** Referential transparency */

//We say something has referential transparency when a functions return value is
// based solely on the inputs
// Example: addition(1,2) always = 3
def addTwoInts(x:Int, y:Int): Int = x + y
3 + 3
3 + addTwoInts(1,2)
addTwoInts(1,2) + addTwoInts(1,2)
6

//Just something to think about when writing complex code
//What is simpler for our brains?