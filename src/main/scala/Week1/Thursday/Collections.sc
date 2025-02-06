// Seq, List, Map (notice the Uppercase)

val firstSeq: Seq[Int] = Seq(1,2,3,4,5)
val firstList: List[Int] = List(1,2,3,4,5)
val firstMap: Map[String, Int] = Map(
  "one" -> 1,
  "two" -> 2,
  "three" -> 3,
  "four" -> 4,
  "five" -> 5
)
// Map has key value pairs (key -> value)
// Must declare the types of both key and value in the parameters

/** Accessing Data
 */

//SEQ
val getSeqData: Int = firstSeq(0)
val getSeqHead: Int = firstSeq.head // get the first element (index position 0)
val getSeqTail = firstSeq.tail // get everything except index position 0
val getSeq2Data: Int = firstSeq(2)
// val getTooMuchData: Int = firstSeq(12) - example of asking for index position that doesn't exist. Get an out of bounds exception

//LIST
val getList1Data: Int = firstList(1)
val getListTail: List[Int] = firstList.tail
val getLastInList: Int = firstList.last

//MAP
val getMapData = firstMap("three") // enter the key to get the value

/** Manipulating data - using map
 */

val tripledList: List[Int] = firstList.map {
  number => number * 3
}
// 'number' here is a name we give to the data to recognise it
// you can name it anything, but be clear what it is!
// bad practice to not name your data type

val tripledSeq: Seq[Int] = firstSeq.map{
  number => number * 3
}

val tripledMap: Map[String, Int] = firstMap.map{
  case (key, value) => (key, value * 3)
}
// you can only triple the Int, not String, so you have to direct this one
// to choose either the key or the value. To do so, wrap it in a case
// key remains the same, but value gets multiplied by 3

val changeKey: Map[String, Int] = firstMap.map{
  case (key, value) => (key.capitalize, value)
}
// this one changes the key rather than the value

val changeKeyAndValue: Map[String, Int] = firstMap.map{
  case (key, value) => (key.capitalize, value * 3)
}
// this changes both

/** Manipulating data - filtering
 */

// filter

val filteredSeq: Seq[Int] = firstSeq.filter(
  number => number >= 2
)
// this filters through the seq to show any numbers >= 2
// to access the new data you then can use filteredSeq as a new value

val filteredList: List[Int] = firstList.filter(
  number => number >= 2
)
// this filters through the list to show any numbers >= 2
// to access the new data you then can use filteredList as a new value

filteredSeq == filteredList //true despite the val names not being the same
// scala checks for the resulting value, not the name

val filteredMap: Map[String, Int] = firstMap.filter(
  number => number._2 >= 2
)
// to get to filter a number, we want to find the value not the key
// rather than using keys/values here, we use _1 and _2
// _1 is to access the key and _2 is to access the value

// filterNot (works similar to !=)

val filterNotList: List[Int] = firstList.filterNot(
  number => number >= 2
)
// this does the opposite of filter
// Saying if there are numbers >= 2, I don't want them shown

/** Manipulating data - check if an element is present
 */
// Get boolean result

  //Exists
val existsSeq: Boolean = firstSeq.exists(
  number => number >= 2
)
// telling it to find a number that is >= 2 and tell me if there is.
// if you used a number that isn't in the seq (eg 7) it would be false.

val existsList: Boolean = firstList.exists(
  number => number >=2
)
// same as above

val existsMap: Boolean = firstMap.exists(
  number => number._2 >= 2
)
// same as above but pointing it to find in the value using ._2
// again, if you want to search in key you use ._1

  //Contains - give it a specific piece of data to look for

val containsSeq: Boolean = filteredSeq.contains(2)
// asking for a specific piece of info - whether the filteredSeq contains a 2

val containsList: Boolean = filteredList.contains(2)
// same as above

val containsMap: Boolean = firstMap.contains("two")
// contains only checks keys on Maps, can't check values!

val containsOrSeq: Boolean = firstSeq.contains(2) || firstSeq.contains(7)
// used to check more than one piece of info. can use other operators (&&) as well


// Task 1 - create a seq of names
val nameSeq: Seq[String] = Seq("Ash","Al","Ryan","Sarah","Dee")

// Task 2 - create a map
val colourMap: Map[Int, String] = Map(
  1 -> "red",
  2 -> "yellow",
  3 -> "blue",
  4 -> "green"
)

val filteredColourMap: Map[Int, String] = colourMap.filter(
  colour => colour._2 == "blue"
)

// Task 3 - add 1 to all numbers in a collection of Ints
val newSeq: Seq[Int] = Seq(1, 2, 3, 4, 5, 6)
val AddedSeq: Seq[Int] = newSeq.map{
  number => number + 1
}

// Task 4 - Remove all even numbers from a collection
val newList: List[Int] = List(1,2,3,4,5,6)


// Task 5 - Return true if Seq has an r
val existsInSeq: Boolean = nameSeq.exists(
  letter => letter == "r"
)


/**
 * Making additions - prepend (start) or append (end)
 */

val x: Seq[Int] = Seq(3,4,5)
// Append (add to end)
val appendX = x:+ 6
// adds 6 to the seq at the end, as a new val (appendx)

val y: Seq[Int] = Seq(3,4,5)
val prependY = 2 +: y
// adds 2 to the seq at the start, as a new val (prependY)

// Append Map
val appendMap = firstMap + ("six" -> 6)
// adds Six -> 6 to map

val multipleInts = Seq(0,1,2) +: y
val multipleInts = Seq(0,1,2) ++ y

/** Deleting
 *
 */

val removeHead = firstSeq.tail //remove head
val removeLast = firstSeq.init //remove last index position

//Removing map
val removeValueInMap = firstMap - "three" //call to the key you want to remove
val removeMultipleValuesInMap = firstMap - ("three", "one") //call to the key