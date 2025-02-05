/**
 * Extension
 */

// Operators used in IF statements have an order of precedence.
// 1. What is it and where do we find it?
// && - both must be true
// || - one must be true
// ! - not true or not false - single boolean
true && true = true
true && false = false
false && true = false
false && false = false

true || true = true
true || false = true
false || true = true
false || false = false

!true = false
!false = true

// 2. What would (true || false && false) result in?
// Unsure whether to read as true || false (true) && false, which equals false
// or whether to read as true || false && false (false), which equals true

// 3. What about ((true || false) && false)?
// False, as it works out as true && false = false

// 4. How about (1<4 && 7!=10 || 9 + 10 == 21)?
// I think false!