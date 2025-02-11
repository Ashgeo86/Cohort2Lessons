package Week2.Monday

object Objects extends App {

  object PrimaryColours { // grouping in to an object
    val blue: String = "blue"
    val yellow: String = "yellow"
    val red: String = "red"
  }

  // calling the object
  println(PrimaryColours.red)
  println(PrimaryColours.red.toUpperCase)

 object DaysOfWeek {
   val Monday: String = "Monday"
   val Tuesday: String = "Tuesday"
   val Wednesday: String = "Wednesday"
   val Thursday: String = "Thursday"
   val Friday: String = "Friday"
 }

  println(DaysOfWeek.Tuesday)
  println(DaysOfWeek.Wednesday.capitalize)
}