package Week3.Friday

object EitherLogic extends App {
  val letter: Right[Nothing, Letter] = Right(Letter(Name("A letter"), Postcode("xj1 1j5")))
  val invalidLetter: Left[InvalidNameError, Nothing] = Left(InvalidNameError("The name is invalid"))

  println(letter)
  println(invalidLetter)
}