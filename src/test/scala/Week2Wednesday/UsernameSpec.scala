package Week2Wednesday

import Week2.Wednesday.Username
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class UsernameSpec extends AnyWordSpec with Matchers {

  //Make a new instance of my class
  //Do this at top level because my class doesn't take parameters
  //Because it is at top level, I can access this class anywhere between the yellow {} - known as class body
  val username = new Username

  "checkUsername" should {

    "return true" when {

      "username is 8 characters long and all lowercase" in {
        val input = username.checkUsername("mercator") //if mercator is entered as a username
        val expectedResult = true //the expected result should be true (8 letters, lowercase)
        input shouldBe expectedResult //this is returning input and expected result = true
      }

      "username is more than 8 characters long and all lowercase" in {
        val input = username.checkUsername("mercatordigital") //if mercatordigital is entered as a username
        val expectedResult = true //the expected result should be true (more than 8 letters, lowercase)
        input shouldBe expectedResult //this is returning input and expected result = true
      }

    }

    "return false" when {

      "username is less than 8 characters long but all in lowercase" in {
        val input = username.checkUsername("merc") //if merc is entered as a username
        val expectedResult = false //the expected result will be false (less than 8 letters)
        input shouldBe expectedResult //will return input and expected result = false
      }

      "username is 8 characters long but contains uppercase letters" in {
        val input = username.checkUsername("Mercator") //if Mercator is entered as a username
        val expectedResult = false //the expected result will be false (8 letters but not lowercase)
        input shouldBe expectedResult
      }

      //Edge case
      "username is entered as an empty string" in {
        val input = username.checkUsername("") //if nothing is entered as a username
        val expectedResult = false //expected result is false as it's empty
        input shouldBe expectedResult //will return false
      }
    }
  }
}
