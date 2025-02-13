package Week2.Thursday.Burgers

abstract class Burger (val doublePatty: Boolean, val bunType: Burger.TypeOfBun) {

}


object Burger {
  sealed trait TypeOfBun
  case object GlutenFree extends TypeOfBun
  case object SeededBun extends TypeOfBun
}