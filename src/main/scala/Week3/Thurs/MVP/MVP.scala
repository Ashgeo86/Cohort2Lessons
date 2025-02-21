package Week3.Thurs.MVP

object MVP extends App {

  val country: String = "England"
  country.toLowerCase match {
    case "England" => println("London")
    case "France" => println("Paris")
    case "Thailand" => println("Bangkok")
    case "Japan" => println("Tokyo")
    case _ => println("Not valid")
  }

//Think about what happens when someone has entered a country in all lowercase/ uppercase or mixed - .toLowerCase
// Think about how you account for unneeded white spaces entered (e.g. "     England ")? - .trim

}
