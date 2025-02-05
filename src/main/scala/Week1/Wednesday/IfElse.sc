/**
 * If Else
 */

// Depending on the weather, tell me what to wear.
val weather: String = "hot"

if (weather == "hot") {
  s"It is $weather, no coat needed."
} else {
  s"You need a coat, it is $weather"
}

// if true --> hits the first string inside the 'if'
// if false --> hits the second string inside the 'else'

// using else if

if (weather == "hot") {
  s"It is $weather, no coat needed."
} else if (weather == "raining") {
  s"It is $weather ,take a coat with a hood."
} else {
  s"$weather is not valid, please enter raining or hot."
}

// Multiple options
val season: String = "summer"
if (weather.toLowerCase == "cold" || season.toLowerCase == "winter") {
  s"It is $weather, take a coat"
} else {
  "A light jacket is fine"
}

// Task 1
val grade: Int = 103

if (grade == 90 || grade > 90) {
  s"Congratulations, your score of $grade% means you've scored an A."
} else if (grade == 80 || grade > 80) {
  s"Congratulations, your score of $grade% means you've scored a B."
} else if (grade == 70 || grade > 70) {
  s"Congratulations, your score of $grade% means you've scored a C."
} else if (grade == 60 || grade > 60) {
  s"Congratulations, your score of $grade% means you've scored a D."
} else if (grade == 50 || grade > 50) {
  s"Congratulations, your score of $grade% means you've scored an E."
} else {
  s"Sadly you've scored an F and have failed"
}