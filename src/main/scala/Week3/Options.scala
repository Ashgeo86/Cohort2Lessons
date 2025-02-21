package Week3

object Options extends App{

  trait Pizza {
    val size: Int
    val crust: Option[String] //makes this string optional
  }

  object Personal extends Pizza {
    override val size: Int = 7
    override val crust: Option[String] = Some("classic") //when using an option, wrap in brackets if we are giving it SOMEthing
  }

  object Small extends Pizza {
    override val size: Int = 9
    override val crust: Option[String] = None //not giving a default so doesn't need to be wrapped in brackets
  }

  object Medium extends Pizza {
    override val size: Int = 11
    override val crust: Option[String] = Some("classic") //assigning a default
  }

  object Large extends Pizza {
    override val size: Int = 14
    override val crust: Option[String] = None
  }

  val newPizzaOrder: Pizza = new Pizza {
    override val size: Int = 14
    override val crust: Option[String] = Some("stuffed")
  }

  val emptyCrustNewPizzaOrder: Pizza = new Pizza {
    override val size: Int = 14
    override val crust: Option[String] = None
  }

  def whatCrust(pizza: Pizza): String = {
    pizza.crust match {
      case Some("clasic") => "Classic crust"
      case Some("italian") => "Italian crust"
      case Some("stuffed") => "Stuffed crust"
      case None => "Just the default classic crust" //if they don't specify, they get defaulted to classic crust
    }
  }

  println(whatCrust(newPizzaOrder))

  //get or else
  println(newPizzaOrder.crust.get) //this will get whatever is inside of the Some. In this case "stuffed" (line 32)
  //This will not work with the None. There is nothing to get. --> Need to use getOrElse

  println(emptyCrustNewPizzaOrder.crust.getOrElse("classic")) //either get the contents of the sum (line 37) OR return the default "classic"
  //This will return the "classic" string above as line 37 is None (empty)


  //Task 3
  case class ChocolateBar (filling: Option[String])

  def getFilling(chocolateBar: ChocolateBar): String =
    chocolateBar.filling.getOrElse("just chocolate")

  object Snickers extends ChocolateBar(Some("nuts"))
  object DairyMilk extends ChocolateBar(None)

  println(getFilling(Snickers))
  println(getFilling(DairyMilk))
}
