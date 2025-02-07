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

//Task 4 - Make a simple grading system to calculate a student's overall grade
//Based on their scores in different subjects - Math, Science, English

//System will - calculate the average score from a list of scores
//Determine the grade based on the average score
val MathScore: Int = 7
val ScienceScore: Int = 5
val EnglishScore: Int = 10

def averageScore(Math: Int, Science: Int, English: Int): Double = {
  math.round((Math + Science + English) / 3.0).toInt
}
averageScore(80,65,60)

def gradeTotal(overallScore: Double): String = {
  if (overallScore >= 90) {
    "You got an A!"
  } else if (overallScore >= 80) {
    "You got a B!"
  } else if (overallScore >= 70) {
    "You got a C!"
  } else if (overallScore >= 60) {
    "You got a D"
  } else "Sad, you got an E"
}
gradeTotal(82.0)

def totalGrade: String = {
  gradeTotal(averageScore(MathScore, ScienceScore, EnglishScore))
}
totalGrade
