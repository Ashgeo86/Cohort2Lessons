package Week2.Monday.Family

object FamilyLogic extends App {

  // Everytime we make a new instance of a class using the keyword new, we are making an object
  new Child("Alice") // Child is our object from the Child.Scala file. 1 use as called directly
  val child1 = new Child("Alice") // can reuse if worded like this because I can call it with the val

  println(child1.forename)
  println(child1.under18)
  //println(child1.idPlease) // cannot access because the method has been made private in the Child class (Child.scala)


  //Adult
  val adult1: Adult = Adult.apply(new Forename("Ash"), new Surname("George")) //using Apply method in Adults.scala
  val adult2: Adult = new Adult(new Forename("Ash"), new Surname("George")) //without apply method - need to use 'new'

  println(adult1.forename.forename) //forename is used twice here as you're going through two levels - adult, forename, forename
  //if the class was called 'name' it would read as adult1.name.forename

  val dog1: Dog = Dog.apply(new Name("Bailey"), new Age(2))
  val dog2: Dog = Dog.apply(new Name("Fido"), new Age(4))

  println(dog1.name.name)
  println(dog2.age.age)
}
