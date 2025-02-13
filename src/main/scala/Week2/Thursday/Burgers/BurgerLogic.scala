package Week2.Thursday.Burgers

object BurgerLogic extends App {
  val veggieBurger1 = new VeggieBurger(true, Burger.SeededBun) with Ketchup with Mayo {
    override val spicy: Boolean = false
  }

  println(veggieBurger1.spicy)
  println(veggieBurger1.garlic)
  println(veggieBurger1.bunType)
}