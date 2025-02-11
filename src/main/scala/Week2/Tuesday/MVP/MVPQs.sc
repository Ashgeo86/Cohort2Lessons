// Task 1
//What are the three main differences between a class and a case class?

//1. A case class can't be extended as it is immutable data only
//2. Don't need to use val in a case class, as the fields are val by default
//3. Don't need to use the keyword 'new' as apply method is built in

//Task 2
//Which of the following lines is runnable and which will produce an error?
case class Person(name: String, age: Int, nationality: String, isStudent: Boolean)
val firstPerson = new Person("Carlos", 23, "Spanish", true)
val secondPerson = Person("Carlos", 23, "Spanish", true)
val thirdPerson = Person("Chloe", 25, "British", false)

class Animal(name: String, colour: String, pet: Boolean)
// val cat = Animal("cat", "black", true) - Error, needs 'new' as it's a class
val dog = new Animal("dog", "white", true) //is correct but only shows memory location

//Task 3
//Which of the combinations are true when using ==
case class Muffin(flavour: String, price: Double, storeBoughtFrom: String)
val chocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
val blueberryMuffin = Muffin("blueberry", 3.50, "Mercator Bakery")
val vanillaMuffin = Muffin("vanilla", 3.50, "Mercator Bakery")
val anotherChocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
val oneMoreChocolateMuffin = Muffin("Chocolate", 3.50, "Mercator Bakery")
val finalChocolateMuffin = Muffin("choocolate", 2.50, "MercatorBakery")

println(chocolateMuffin == blueberryMuffin) // different flavour
println(chocolateMuffin == vanillaMuffin) // different flavour
println(chocolateMuffin == anotherChocolateMuffin)
println(chocolateMuffin == oneMoreChocolateMuffin) // capitalised flavour
println(chocolateMuffin == finalChocolateMuffin) // flavour spelled differently, different price, Mercator Bakery has no space

println(blueberryMuffin == vanillaMuffin) // different flavour
println(blueberryMuffin == anotherChocolateMuffin) // different flavour
println(blueberryMuffin == oneMoreChocolateMuffin) // different flavour
println(blueberryMuffin == finalChocolateMuffin) // different flavour, different price, Mercator Bakery has no space

println(vanillaMuffin == anotherChocolateMuffin) // different flavour
println(vanillaMuffin == oneMoreChocolateMuffin) // different flavour
println(vanillaMuffin == finalChocolateMuffin) // different flavour, different price, Mercator Bakery has no space

println(anotherChocolateMuffin == oneMoreChocolateMuffin) // flavour capitalised
println(anotherChocolateMuffin == finalChocolateMuffin) // flavour spelled differently, different price, Mercator Bakery has no space