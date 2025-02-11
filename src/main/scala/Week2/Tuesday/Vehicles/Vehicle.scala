package Week2.Tuesday.Vehicles

abstract class Vehicle (val brand: String) { // declare it a val so you can access it!
  def drive: String // abstract method
  val description: String = s"This vehicle is a $brand"

}

// Abstract class - why?
// 1. Prevents me making (instantiating) a vehicle. This is only being used for extension now - have to extend it
// We're never going to make a vehicle. We're going to be more precise e.g van, car etc
// 2. Then why not a trait if it always is going to be extended? If it were a trait it couldn't have params. I want constructor params (brand). Traits don't allow this.

