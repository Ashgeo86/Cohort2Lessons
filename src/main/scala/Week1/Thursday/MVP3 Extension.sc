// Task 1. Starting with a Seq of Ints from 1-9
val numberSeq: Seq[Int] = Seq(1,2,3,4,5,6,7,8,9)

// Come up with 2 filters that, after applied, will return Seq 1,2,5,7
val filterSeq: Seq[Int] = numberSeq.filterNot(number => number % 3 == 0).filterNot(
  number => number % 4 == 0)

// Task 2. Using only .head and .tail, retrieve the 3rd element of a List
// Third element of numberSeq = 4
