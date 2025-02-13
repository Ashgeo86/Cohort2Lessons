package Week2.Thursday.Burgers

case class BeefBurger(override val doublePatty: Boolean, override val bunType: Burger.TypeOfBun) extends Burger(doublePatty, bunType) {

  val beefBurger1 = new BeefBurger(true, Burger.SeededBun) with Ketchup with Mayo
}

