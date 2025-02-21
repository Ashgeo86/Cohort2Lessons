package Week3.Friday

import java.time.LocalDate

object Eithers extends App {

  //Takes 2 different params - Left (Error) and Right (Success
  //Right biased
  //Main use - error handling

  //def isOdd(x: Int): Either[Boolean, String] = if (x % 2 != 0) Right(s"$x is odd") else Left(false)
  //If number we give does not have a modulus of zero (number is odd) it'll hit the Right (string)
  //else it's false

  //println(isOdd(4)) //Left - 4 is an even number
  //println(isOdd(7)) //Right - 7 is an odd number

  //Making the above better
  //1. Error handle using extends Exception --> Can make custom errors but have to make sure we use val to make params reachable
  class NewError(val errorCode: Int, val errorMessage: String) extends Exception

  //Custom error
  case object IsOddError extends NewError(400, " Input is not odd, it is even")

  def isOdd(x: Int): Either[NewError, String] = if (x % 2 != 0) Right(s"$x is odd") else Left(IsOddError)

  println(isOdd(4)) //Left
  println(isOdd(7)) //Right

  //2. Error handle using Try/Catch - gives more inbuilt information
  def plusOne(x:Int): Either[String, Int] = {
    try {
      Right(x + 1)
    } catch {
      case exception: Exception => Left(s"failed due to: $exception")
    }
  }
  //if correct, this will return x + 1, otherwise will return the string

  println(plusOne(7))

//Same as above but changing String to Int
  def plusOneString(x:String): Either[String, Int] = {
    try {
      Right(x.toInt + 1)
    } catch {
      case exception: Exception => Left(s"failed due to: $exception")
    }
  }

  println(plusOneString("1")) //Right - because it can change "1" to an Int and adds 1 (will println 2)
  println(plusOneString("one")) //Left - because it can't change "one" to an Int


  //Eithers with for comprehensions
  //Good because they fail fast - as soon as one condition hits a left, we exit the for comprehension

  //Validating a user example
  case class User (username: String, password: String, dateOfBirth: LocalDate)
  //Conditions
  //1. Username must be at least 12 characters long
  //2. Password must be a mixture of upper and lower case
  //3. Date of birth - must be 18

  case class ValidatedUser (username: String, password: String, dateOfBirth: LocalDate) //Return type of final method
  case object usernameError extends NewError(400, "Username is less than 12 characters long")
  case object passwordError extends NewError(400, "Password is not a mixture of upper and lower case")
  case object dateOfBirthError extends NewError(400, "Not yet 18")

  val usernameBad = User("user", "Password", LocalDate.of(1960, 6, 5)) //User example with a username that is less than 12
  val passwordBad = User("validusername", "password", LocalDate.of(1960, 6, 5)) //User example with an invalid password (all lowercase)
  val dateOfBirthBad = User("validusername", "Password", LocalDate.of(2017, 6, 5))
  val validUser = User("validusername", "Password", LocalDate.of(1960, 6, 5)) //User example with a valid username

  //1. Username
  def validateUsername(username: String): Either[NewError, String] = {
    if (username.length < 12) Left(usernameError) //if username is less than 12, hits left error and above case object is triggered
    else Right(username) //if 12 or more, hits right and returns their username
  }

  println("\nValidate username (bad - left): " + validateUsername(usernameBad.username))
  println("\nValidate username (good - right): " + validateUsername(validUser.username))

  //2. Password
  def validatePassword(password: String): Either[NewError, String] = {
    if (password.toUpperCase == password || password.toLowerCase == password) Left(passwordError) //if password is equal to uppercase or lowercase, hits left and errors as it's not a mixture of upper and lower case
    else Right(password) //if a mixture of upper and lower case, hits right and returns password
  }

  println("\nValidate password (bad - left): " + validatePassword(passwordBad.password))
  println("\nValidate password (good - right): " + validatePassword(validUser.password))

  //3. Date of birth
  def validateAge (dateOfBirth: LocalDate): Either[NewError, LocalDate] = {
    if (dateOfBirth.plusYears(18).isAfter(LocalDate.now)) Left(dateOfBirthError) //if we take their birthday and add 18 years, if its after what the date now is (in the future) they are not yet 18, so hits left and errors - "not yet 18"
    else Right(dateOfBirth) //else hits right and shows date of birth as they're over 18
  }

  println("\nValidate Age (bad - left): " + validateAge(dateOfBirthBad.dateOfBirth))
  println("\nValidate Age (good - right): " + validateAge(validUser.dateOfBirth))

  //4. Combine all methods and return the ValidatedUser if they are all happy
  def validateUser(user: User): Either[NewError, ValidatedUser] = { //passing in a full user as a param to return everything
    //return either the error or ValidatedUser (line 65) which is a fully working user with all correct inputs
    for {
      username <- validateUsername(user.username)//username is just a name chosen to make sense of what we're wanting
      //calling method and, if happy, asking it to store the correct data in the val 'username'
      //if unhappy, it will hit left and exit
      password <- validatePassword(user.password)//same as above but with password
      dateOfBirth <- validateAge(user.dateOfBirth)//same as above but with DOB
      validatedUser = ValidatedUser(username, password, dateOfBirth) //temporarily storing all of the above in here (using the case class on line 65)
    } yield validatedUser //yield the above name for the final return type
  }

  println("\nValidate User - bad username: " + validateUser(usernameBad))
  println("\nValidate User - bad password: " + validateUser(passwordBad))
  println("\nValidate User - bad date of birth: " + validateUser(dateOfBirthBad))
  println("\nValidate User - everything ok: " + validateUser(validUser))

}
