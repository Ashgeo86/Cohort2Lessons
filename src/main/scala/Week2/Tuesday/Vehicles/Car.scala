package Week2.Tuesday.Vehicles

class Car(brand: String, val fuelType: String) extends Vehicle(brand) { //brand doesn't need val as Vehicle already has it

  override def drive: String = s"This $brand car is using $fuelType"
}
