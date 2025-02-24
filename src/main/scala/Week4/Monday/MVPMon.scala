package Week4.Monday

object MVPMon extends App {

  def factorialAddition(n: Int): Int = {
    if (n <= 1) {
      1
    } else {
      val finalResult = n + factorialAddition(n - 1)
      finalResult
    }
  }

  println(factorialAddition(5))

}
