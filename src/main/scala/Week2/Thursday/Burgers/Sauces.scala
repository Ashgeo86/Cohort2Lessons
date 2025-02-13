package Week2.Thursday.Burgers

trait Sauces {
  def whereAmI: String = "Sauces"
}

trait Ketchup extends Sauces {
  val spicy: Boolean = true
}
trait Mayo extends Sauces {
  val garlic: Boolean = true
}
trait Relish extends Sauces
trait Mustard extends Sauces