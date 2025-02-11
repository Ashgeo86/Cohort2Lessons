package Week2.Monday.Family

class Child (val forename: String) { // inside the () - class parameters, inside the {} - body of the class. All logic goes in here

  val under18: Boolean = true //as they're a child ,they'll always be under 18. hence this being true
  private def idPlease: String = "Can I see your ID?" // adding private reduces the scope of where this is accessible.
  // can only be called within this class body.

}

//Companion object
object Child {
  def apply(forename: String): Child = new Child(forename) //shorthand to make new instances of your class

  //We can access the companion classes private methods here
  val bob = Child.apply("Bob")
  println(bob.idPlease)

}
