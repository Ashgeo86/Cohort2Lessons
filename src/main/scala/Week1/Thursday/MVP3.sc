// Task 1

// a) Make a List of numbers
val numberList: List[Int] = List(1,2,3,4,5)
val tripledList: List[Int] = numberList.map {
  number => number * 3
}

// b) Make a Seq of primary colours
val colourSeq: Seq[String] = Seq("blue", "red", "yellow")

// c) Write a function that removes "Blue" from your Seq
val removeBlue = colourSeq.filterNot {
  colour => colour == "blue"
}

// d) Write a function that returns 'true' if Seq contains "Orange"
val containsColour: Boolean = colourSeq.contains("orange")

// Task 2 - write a function that maps each value in your List to true or false
// depending on whether they are odd
val oddNoList: List[Boolean] = numberList.map (
  number => number % 2 != 0
)

// Task 3 - David has 2 dogs, 1 fish, 1 cat

// a) Make a map which details the key -> value pair of "Name" -> "Animal"
val animalMap: Map[String, String] = Map (
  "Will" -> "Dog",
  "Grace" -> "Dog",
  "Jack" -> "Fish",
  "Karen" -> "Cat"
)

// b) Write a function that returns a List of the names of David's dogs
val filteredAnimals: Map[String, String] = animalMap.filter(
  dogs => dogs._2 == "Dog"
)