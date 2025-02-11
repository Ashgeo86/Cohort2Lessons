package Week2.Tuesday.Vehicles

object VehicleLogic extends App {

  println("\nCar\n")

  //Car is a class
  val ford = new Car("Ford", "Petrol") //an object of car
  println(ford.fuelType) //coming from Car
  println(ford.drive) //coming from Vehicle, but override in Car
  println(ford.brand) //coming from Vehicle
  println(ford.description) //coming from Vehicle


  println("\nElectricCar\n")
  //Electric Car is a case class
  val electricFord = ElectricCar("Ford") //new ElectricCar object. Doesn't need fuelType as it's already in trait
  println(electricFord.fuelType) //coming from Car
  println(electricFord.drive) //coming from Vehicle
  println(electricFord.brand) //coming from Vehicle
  println(electricFord.description) //coming from Vehicle
  println(electricFord.noisyToDrive) //coming from ElectricCar
  println(electricFord.timeToCharge) //coming from Electric trait
  println(electricFord.charge) //coming from Electric trait

}
