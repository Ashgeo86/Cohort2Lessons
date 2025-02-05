/**
 * John buying as many watermelons as possible.
 * John can carry 3 watermelons without a bag
 * Can carry 5 with one bag
 */

// 1. Create value to store watermelons
val melons: Int = 5
val bag: Boolean = true
val price: Double = 1.397
// 2. Use if/else statement to print out messages based on the criteria above
// a) Doesn't need a bag
// b) Needs a bag
// c) Can't carry them
  if (melons <= 0) {
    s"This is an invalid number"
  } else if (melons <= 3) {
    f"John has $melons watermelons, he can carry these in his arms. The total price is ${price*melons}%.2f"
  } else if (melons <=5 && bag == true) {
    f"John has $melons watermelons and has a bag to put them in. The total price is ${price*melons}%.2f"
  } else if (melons <=5 && bag == false) {
    f"John has $melons watermelons, but can't buy them as he doesn't have a bag. The total price is ${price*melons}%.2f"
  } else {
    s"$melons is too many watermelons to carry John!"
  }

// 3. Use string interpolation to add the number of watermelons.
// Added above. Using S interpolation as doesn't need specific formatting.

// 4. Added above.
// 5. Added above.
// 6. Added above. Using f interpolation as using decimals and flexible amounts.
