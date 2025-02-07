//Task 1 - Write a method to calculate the square of an Int. Should have an input parameter, Int and return type, Int.

def squaredNumbers(number:Int): Int = (number * number)
squaredNumbers(6)

//Task 2 - Write a method to check if a number is odd. Should have an input parameter. Int and return type, Boolean

def oddNumber(number:Int): Boolean = (number %2 !=0)
oddNumber(1)

//Using a for comp and above methods, write a method called sumOfOddNumbers
//Should have an input parameter of List[Int] and return type of Int
//Method should -
//Will iterate over a List of Ints
//Will square each Int in the List
//Will filter and keep only the odd squared values
//Then return the sum of these odd squared numbers
val numbers: List[Int] = List(1,2,3,4,5,6,7,8,9)

def sumOfOddNumbers(numberInput: List[Int]): Int = {
  val ofSquare = for {
    numberInput <- numberInput
    squaredNumber = squaredNumbers(numberInput)
    if oddNumber(squaredNumber)
  } yield squaredNumber
  ofSquare.sum
}
sumOfOddNumbers(numbers)