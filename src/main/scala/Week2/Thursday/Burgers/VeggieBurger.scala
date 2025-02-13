package Week2.Thursday.Burgers

case class VeggieBurger (override val doublePatty: Boolean, override val bunType: Burger.TypeOfBun) extends Burger(doublePatty, bunType) {

}