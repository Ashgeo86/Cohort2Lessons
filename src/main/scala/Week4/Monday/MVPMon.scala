package Week4.Monday

import scala.annotation.tailrec

object MVPMon extends App {

  // 1) Start by looking up the teams that played in the 2024 Euros.  //a) Create an object called Euro2024 that extends Enumeration Provide all the teams who participated in the 2024 Euros.  //b) Write a tail recursive method to print all the teams.

  object Euro2024 extends Enumeration {
    val Germany, Spain, France, England, Italy, Netherlands, Belgium, Portugal, Denmark, Sweden, Switzerland, Austria, Poland, CzechRepublic, Croatia, Turkey, Scotland, Wales, Romania, Bulgaria, Serbia, Ukraine, Norway, Iceland = Value
  }

  def printEuroTeams(euro2024: List[Any]): String = {
    @tailrec
    def printEuroTeamsRec(teams: List[Any], acc: String): String = {
      if (teams.isEmpty) acc // Empty list case
      else {
        val head = teams.head
        val tail = teams.tail
        val makeNiceToRead = if (acc.isEmpty) "" else ", "
        printEuroTeamsRec(tail, acc + makeNiceToRead + head.toString)
      }
    }
    printEuroTeamsRec(euro2024, "")
  }


  println(printEuroTeams(Euro2024.values.toList))

  //Question 2
  sealed class Team(name: String)

  object Team {
    case object Germany
    case object Spain
    case object France
    case object England
    case object Italy
    case object Netherlands
  }

  val TeamList: List[Object] = List(Team.Germany, Team.Spain, Team.France, Team.England, Team.Italy, Team.Netherlands)
  println(printEuroTeams(TeamList.toList))

  //Question 3
  //Create a method that has an input of a positive Int. This method will return the sum of all numbers between 0 and the input Int.  • For example, if we input 5, then the output should be 5+4+3+2+1 = 15.
  //This is similar to the Factorial method but uses addition instead of multiplication.
  def factorialAddition(n: Int): Int = {
    if (n <= 1) {
      1
    } else {
      val finalResult = n + factorialAddition(n - 1)
      finalResult
    }
  }

  println(factorialAddition(5))


  //Question 4
  //Using recursion and given a list with all integers from 1 to 20 inclusive, create a method called “isEven” that checks if a number, at a given index position, is even or not. The return type of this method should be Either [String, Boolean]

  // Q4:// 4) Using recursion and given a list with all integers from 1 to 20 inclusive,// create a method called “isEven” that checks

  val numbers: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)

  println(numbers)

  def isEven(index: Int, numbers: List[Int]): Either[String, Boolean] = {
    if (index < 0 || index > 19) Left(s"$index is out of bounds ")
    else if (index == 0) {
      println(s"$index")
      Right(numbers.head % 2 == 0)  }
    else {    println(s"$index")
      println(s"${numbers.tail}")
      isEven(index - 1, numbers.tail)
    }
  }
  println(isEven(3, numbers))
  println(isEven(8, numbers))
}
