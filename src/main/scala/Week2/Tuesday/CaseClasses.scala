package Week2.Tuesday

object CaseClasses extends App {

  // Standard Class
//  class SuperHero(realName: String, heroName: String, weakness: String)
//  new  SuperHero("Clark Kent", "Superman", "Kryptonite") // made a new SuperHero object from the SuperHero class

  // Case Class
  case class SuperHero(realName: String, heroName: String, weakness: String) // each parameter is a val by default
  val superMan = SuperHero.apply("Clark Kent", "Superman", "Kryptonite") // .apply method is built in. Object made using the SuperHero case class.
  val superMan2 = SuperHero.apply("Clark Kent", "Superman", "Kryptonite")
  println(superMan == superMan2) // = true. Compares the field values not the object ref/memory location (like classes do)

  // .copy method
  val copiedSuperman2 = superMan2.copy(weakness = "Gravity") // creates a copy and changes the parameter
  println(copiedSuperman2.weakness)

  val updatedName = superMan.copy(realName = "Bruce Wayne", weakness = "Guns") // change two parameters. Original is not changed, we make a new val!
  println(updatedName.realName + updatedName.weakness)

// Task - Dogs
  println("\nTask\n")

  case class Dog(dogName: String, dogBreed: String, dogAge: Int)

  val lady = Dog("Lady", "Spaniel", 3)
  val tramp = Dog("Tramp", "Mutt", 7)
  val jock = Dog("Jock", "Scottish Terrier", 11)
  val trusty = Dog("Trusty", "Bloodhound", 10)

  case class Kennel(name: String, dogs: List[Dog])

  val dogs: List[Dog] = List(lady, tramp, jock, trusty)
  val kennel = Kennel("Dog Kennel", dogs)
  println(kennel)
}



