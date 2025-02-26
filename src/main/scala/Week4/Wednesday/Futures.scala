package Week4.Wednesday

import Week3.Friday.Eithers.{NewError, isOdd}

import java.util.concurrent.TimeUnit
import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.{Duration, FiniteDuration}
import scala.util.{Failure, Success}

object Futures extends App {

  //What are futures?
  //These represent values that are not yet ready - but they will be in the future

  //Why do we use them?
  //If we didn't use them, sometimes our programme would pause and wait for long operations to complete (eg fetching data from a database or an API)
  //The Future allows us to run tasks in the background (like fetching data) without stopping the whole programme

  //How do we create them?
  val futureHelloWorld: Future[String] = Future {
    Thread.sleep(2000) //Pausing the thread for 2 seconds
    "Hello Future World!"
  }

  //How can we print these Futures?
  //Not like this -
  println(futureHelloWorld) //This is printing the Future itself, rather than the value (value is "Hello future world")

  //1. We can use .foreach as a callback
  futureHelloWorld.foreach(result => println(s"$result")) //result can be named anything

  //2. We can use onComplete - use this when we want to handle successes and failures
  //Success and Failure need to be imported (if red, click on them and press option + enter)
  futureHelloWorld.onComplete {
    case Success(result) => println(s"$result")
    case Failure(exception) => println(s"${exception.getMessage}")
  }

  //3. We can use Await.result (need to import duration, TimeUnit and Await, same as Success/Failure above)
  val waitTime: FiniteDuration = Duration(5, TimeUnit.SECONDS)
  println(Await.result(futureHelloWorld, waitTime)) //need to pass in what we're waiting for (futureHelloWorld) and how long (waitTime we've created)
  //This will block the thread and therefore Futures cannot be used in parallel
  //Use when essential

  println("I'm printed after the futures are called") //Proving that with .foreach and onComplete this is printed before. so it's happening while we are waiting for the Future to be returned


  //Task -

  def additionInTheFuture(x: Int, y: Int): Future[Int] = Future {
    Thread.sleep(1000)
    x + y
  }


  //Using Futures with Eithers

  def fetchIsOddOrErrorInTheFuture(number: Int): Future[Either[NewError, String]] = Future {
    Thread.sleep(1000)
    isOdd(number) //isOdd is imported from our Eithers doc from last week
  }

  //why val? Because the method it is calling is already a future, and I don't need to make a new one
  val eventualIsOddOrError: Future[Either[NewError, String]] = fetchIsOddOrErrorInTheFuture(5)

  //What is .value? This .value is immediately checking the value before the future has had time to complete
  val result = eventualIsOddOrError.value match {
    case Some(Success(complete)) => s"Future completed: $complete"
    case None => "Future did not complete in the given time"
  }

  println(result)


  //How do we combine futures?
  //We do this when we want multiple tasks done at once
  //Not force them to sleep, this means they will run side by side (asynchronously) on separate threads
  val futureInt1: Future[Int] = Future {
    100
  }

  val futureInt2: Future[Int] = Future {
    8
  }

  val combinedFutureInt = for { //for comprehensions will wait for all results to be back before it yields final results
    number1 <- futureInt1
    number2 <- futureInt2
   } yield number1 + number2

  println(Await.result(combinedFutureInt, waitTime))


  //Task - Create two futures - one "hello" and other "world"
  //Combine in to Hello world
  val futureString1: Future[String] = Future {
    "Hello"
  }

  val futureString2: Future[String] = Future {
    "world"
  }

  val combineStringFuture = for {
    word1 <- futureString1
    word2 <- futureString2
  } yield word1 + " " + word2

  println(Await.result(combineStringFuture, waitTime))

  Thread.sleep(3000)
  //This ensures the object thread doesn't finish before the future has completed
}
