package Week2.Tuesday.Vehicles

case class ElectricCar (override val brand: String) extends Car(brand, "Electric") with Electric {
  override val timeToCharge: Int = 8
  val noisyToDrive: Boolean = false
}
// above explained - making a new case class of electric car. Bringing down brand and fueltype from car. Then extending electric.
// Electric has been done as its own trait as some cars will be petrol etc. And you can then have diff electric vehicles (e.g electric bus)
// noisyToDrive is specific to ElectricCar. Other electric vehicles won't have this boolean value

// override val - why?
// Class - Case class. Case class will autogenerate the val field, we also have the val field being passed down with inheritance
// we need to explicitly redefine the inherited val