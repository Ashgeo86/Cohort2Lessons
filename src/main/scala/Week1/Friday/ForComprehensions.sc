// These work on monadic types -- Seq, List, Option, Either, Future
// These won't work on standard Int, String and Boolean

// <- (backwards arrow), simple way of writing a function (flatmap, filter, map, foreach)
// yield -- call the map

// classic
def retrieveNumbers: Seq[Int] = for (number <- 1 to 10) yield number
retrieveNumbers
// (1 to 10).foreach(number => println(number))
//So it's asking to print every number between 1 and 10

// use operators
def squaredNumbers: Seq[Int] = for (number <- 1 to 5) yield number * number
squaredNumbers
// returns the numbers squared

// if guards
def useIfGuard: Seq[Int] = for (number <- 1 to 20 if number %2 ==0) yield number
useIfGuard
// Go through numbers 1 - 20, but only pull them out if they divide by 2 (even numbers)

// manipulating lists
// Example 1 - add an S
val animals: List[String] = List("Hippo", "Bear", "Seal", "Pig")

def addS(animalList:List[String]): List[String] = animalList.map(animal => animal + "s")
// name(what we want to create - list of strings): what we want to recieve = grab name.map through it and add s
addS(animals)
// takes the method and value and adds an S

// Example 2 - make lowercase
def lowerCaseAnimals(animalList: List[String]): List[String] = animalList.map(animal => animal.toLowerCase)
// using a new method on the original list. The above method doesn't work as the value is immutable
lowerCaseAnimals(animals)

//Example 3 - combine methods
def lowerCaseAndAddS(animalList:List[String]): List[String] = for {
  addAnS <- addS(animals)
  //name it anything
  // <- add method with list you want to use
  lowercase <- lowerCaseAnimals(List(addAnS))
  //name it anything
  // <- add second method with the NEW list from above method and declare as a list
} yield lowercase
  // close it with yield and call most updated name
  // if doing more than one thing, always use curly brackets
lowerCaseAndAddS(animals)
//call method and original list
lowerCaseAndAddS(animals).mkString(" ")
//use this to change a list to a string.
//Imagine the word is in the bracket, before the "", and you can add space (see right)


//Task 1 - Write a method that will take a list of names and make lowercase
def lowerCaseName(Names: List[String]): List[String] = Names.map(Names => Names.toLowerCase)
//Write a method that takes list of names and return with first letter cap
def CapitalName(Names: List[String]): List[String] = Names.map(Names => Names.capitalize)
//Run using this list
val names: List[String] = List("aRIa", "BaRT", "ChUCk")
lowerCaseName(names)
CapitalName(names)

//Task 2 - Do Task 1 in single method
def capitaliseList(nameInput: List[String]): List[String] = for {
  lowercase <- lowerCaseName(names)
  capitalise <- CapitalName(List(lowercase))
} yield capitalise
capitaliseList(names)
capitaliseList(names).mkString(" ")