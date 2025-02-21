package Week3

object PatternMatching extends App {

  val weather: String = "Cold"

  if (weather.toLowerCase == "cold") {
    println(s"It is $weather! Take a coat.")
  } else if (weather == "raining") {
    println(s"It is $weather! Take an umbrella.")
  } else {
    println(s"$weather is not valid")
  }

  //Pattern matching takes above if else statement and simplifies it
  weather.toLowerCase match {  //if weather matches:
    case "cold" => println(s"It is $weather! Take a coat") //cold then println
    case "raining" => println(s"It is $weather! Take an umbrella.") //raining then println
    case _ => println(s"$weather is not valid") //Wildcard - this will catch anything else
  }
//Because "Cold" is capitalised (line 5) you have to add .toLowerCase to line 7 and 16


  //Example with Ints
  val numberOfWatermelons: Int = 7

  numberOfWatermelons match {
    case 1 | 2 | 3 => println("He can carry them without a bag") //if we have 1 or 2 or 3 watermelons, println
    case 4 | 5 => print("He needs a bag") //if we have 4 or 5, println
    case x => println(s"$x is invalid") //if you want to interpolate $numberOfWatermelons you can't use _. It needs a value, so we've used x (can be anything)
  }


  //Example with notifications on a phone
  abstract class Notification //Have to extend this as it's an abstract class
  case class Email (sender: String, title: String, body: String) extends Notification
  case class Text (sender: String, body: String) extends Notification
  case class VoiceNote (sender: String, lengthOfBody: Int) extends Notification

  val notification: Notification = Text("Mum", "Where are you?")

  notification match {
    case Email(sender, title, body) => println("Email from  " + sender) //returns "Email from Mum"
    case Text(sender, body) => println("Text from " + sender) //returns "Text from Mum"
    case Text(sender, body) if sender == "Mum" => println("Text from " + sender + ". Message: " + body) // returns "Text from Mum. Message: Where are you?"
    case VoiceNote(sender, lengthOfBody) => println("Voice note from " + sender + " Length: " + lengthOfBody) //returns "Voice note from Mum Length: 5
  }


  //Task 1
  val flavour: String = "spicy"
  flavour match {
    case "spicy" => println("American Hot")
    case "bbq" => println("BBQ chicken")
    case "veggie" => println("Veggie")
    case "sweet" => println("Hawaiian")
    case _ => println("Not valid") //anything other option is not valid
  }


  //Task 2
  val pizzaSize: Int = 9
  pizzaSize match {
    case 7 => println("personal")
    case 9 => println("small")
    case 11 => println("medium")
    case 14 => println("large")
    case _ => println("Enter a valid size")
  }

  case class Pizza(size: Int, crust: String)
  val pizzaOrder: Pizza = Pizza(7, "classic")
  val getPrice = pizzaOrder match {
    case Pizza(7, "classic") => 9.99
    case Pizza(9, "classic") => 10.99
    case Pizza(9, "Italian") => 10.99
  }

}
