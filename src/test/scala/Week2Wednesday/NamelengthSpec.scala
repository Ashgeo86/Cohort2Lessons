package Week2Wednesday

import Week2.Wednesday.Namelength
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class NamelengthSpec extends AnyWordSpec with Matchers {

  val namelength = new Namelength

  "getNameLength" should {

    "return the length of the first name" when {
      "it is longer than surname" in {
        val input = namelength.getNameLength("Elizabeth", "Olsen")
        val expectedResult = 9
        input shouldBe expectedResult
      }
    }

    "return the length of the surname" when {
      "it is longer than first name" in {
        val input = namelength.getNameLength("Tom", "Hiddleston")
        val expectedResult = 10
        input shouldBe expectedResult
      }
    }

    "return 0" when {
      "the surname is equal in length to the first name" in {
        val input = namelength.getNameLength("Chris", "Pratt")
        val expectedResult = 0
        input shouldBe expectedResult
      }
    }
  }

}
