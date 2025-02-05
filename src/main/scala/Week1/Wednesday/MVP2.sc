/**
 * John buying as many watermelons as possible.
 * John can carry 3 watermelons without a bag
 * Can carry 5 with one bag
 */

// 1. Create value to store watermelons
val melons: Int = 7
val bag: Boolean = false
// 2. Use if/else statement to print out messages based on the criteria above
// a) Doesn't need a bag
// b) Needs a bag
// c) Can't carry them
  if (melons <= 0) {
    s"This is an invalid number"
  } else if (melons <= 3) {
    s"John has $melons watermelons, he can carry these in his arms."
  } else if (melons <=5 && bag == true) {
    s"John has $melons watermelons and has a bag to put them in"
  } else if (melons <=5 && bag == false) {
    s"John has $melons watermelons but can't buy them as he doesn't have a bag."
  } else {
    s"$melons is too many watermelons to carry John!"
  }

// 3. Use string interpolation to add the number of watermelons.
// Added above. Using S interpolation as doesn't need specific formatting.

// 4.
