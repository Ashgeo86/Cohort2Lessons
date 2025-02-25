package Week4.Tuesday

object HigherOrderFunctions extends App {

  //Higher Order Functions - HOF
  //Definition: they are a function that EITHER takes in a function as a parameter OR return a function as a result
  //Why do we use them?
  //1. Modular, reusable code (often easier to read)
  //2. Reduces repeated code (makes code more concise)
  //What do they do?  Manipulate collections (eg map, filter, fold, reduce...)

  /** HOF - functions as parameters */

  //This method will take a function (that is also Int to Int) and will apply whatever that function is to the given x
  def firstHigherOrderFunction(x: Int, function: Int => Int): Int = function(x)

  //Now need to write functions that can be passed in to my HOF - must be Int => Int
  def addTwo(number: Int): Int = number + 2
  def square(number: Int): Int = number * number
  def double(number: Int): Int = number * 2

  println(firstHigherOrderFunction(3, addTwo))
  println(firstHigherOrderFunction(3, square))
  println(firstHigherOrderFunction(3, double))


  //This method will process a List[String]
  def processTheList(listOfString: List[String], function: String => String): List[String] = listOfString.map(function)
  //must map through the list to access the single element

  //Now write the methods. All must return (string) same as whats put in (string) - String => String
  //def toUpper - takes a word(string) and returns a string that makes word uppercase
  def toUpper(word: String): String = word.toUpperCase
  //def addsS - takes a word(string) and returns a string that adds S on the end
  def addsS(word: String): String = word + "s"
  //def toLower - takes a word(string) and returns a string that makes word lowercase
  def toLower(word: String): String = word.toLowerCase

  val newList: List[String] = List("aPple", "orangE", "manGo", "grApe")

  println(processTheList(newList, toUpper))
  println(processTheList(newList, addsS))
  println(processTheList(newList, toLower))


  /** Fold Left */
  //What does it do?
  //Combines/reduces a collection (list, seq etc) into a single value
  //Processes the collection from left to right
  //It will store the intermediate value as an accumulator
  // At the end, once the full collection is checked and reduced, it will return the accumulator

    //acc comes first, then element (acc, element) => acc + element
  val numbersList: List[Int] = List(1,2,3,4,5)
    //Add all numbers in my list
  println(numbersList.foldLeft(0)((acc, nextInt)=> acc + nextInt))
  //acc is 0 as we want it blank. It is not index 0!
  //Start with 0 -> 0 + 1 = 1 (acc = 1)
  //(1,2) => 1 + 2 = 3 (acc = 3
  //(3, 3) => 3 + 3 = 6 (acc = 6)
  //(6, 4) => 6 + 4 = 10 (acc = 10)
  //(10, 5) => 10 + 5 = 15 (final element in list - we return the acc = 15)


  //Write a method that takes a list of "String" and returns them as a "String (takes words and makes a sentence)
  val stringList = List("we", "love", "scala")

  //nextWordInList is just a name for what it's going to find. We can name it anything
  //acc starts at "" as its an empty string
  println(stringList.foldLeft("")((acc, nextWordInList)=> acc + nextWordInList))

  //to add spaces between each word and remove white space from beginning and end
  println(stringList.foldLeft("")((acc, nextWordInList) => acc + " " + nextWordInList).trim)


  val newNumbersList: List[Int] = List(1,2,3,4,5,6,7,8,9)

  println(newNumbersList.foldLeft(1)((acc, newInt) => acc * newInt))


  /** HOF - Function is the return type */
  //Commonly seen in pattern matching/if else statements, where we want to choose the function based on given criteria

  //Write a function where, given the length of employment, the % pay rise is different
  //Return the final amount paid per year to a particular employee

  case class Employee(name: String, lengthOfEmployment: Int, salary: Double)

  val Amanda = Employee("Amanda", 2, 30000.0)

  //for each of these methods, we aren't doing the calculation
  //We will use these to identify which pay rise they will get, given the criteria of employment length
  def bigPayRise: Double => Double = salary => salary * 2
  def mediumPayRise: Double => Double = salary => salary * 1.3
  def smallPayRise: Double => Double = salary => salary * 1.1

  //pattern match version. This method will look at the employment length and decide which of the above methods to use
  def getPayRiseCalc (employee: Employee): Double => Double = {
    employee.lengthOfEmployment match {
      case year if year <= 3 => smallPayRise
      case year if year <= 5 => mediumPayRise
      case year if year > 5 => bigPayRise
    }
  }

  //This method will return the new salary for a given employee
  def getFinalSalary(employee: Employee): Double = {
    val applyThePayrise: Double => Double = getPayRiseCalc(employee) //stores the pay rise function
    applyThePayrise(employee.salary) //Do the final calculation (big/med/small pay rise)
  }
  println(getFinalSalary(Amanda))

  //Task
  case class Item (price: Double)

  val pictureFrame = Item(56.00)

  def twentyDiscount: Double => Double = price => price * 0.8
  def fortyDiscount: Double => Double = price => price * 0.6
  def fiftyDiscount: Double => Double = price => price * 0.5

  def discountCalc (item: Item): Double => Double = {
    item.price match {
      case price if price < 20 => twentyDiscount
      case price if (price >= 20) && (price <= 50) => fortyDiscount
      case price if price > 50 => fiftyDiscount
    }
  }

    def getFinalDiscount (item: Item): Double = {
      val applyDiscount: Double => Double = discountCalc(item)
      applyDiscount(item.price)
    }

  println(getFinalDiscount(pictureFrame))

}
