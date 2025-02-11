package Week2.Tuesday.Vehicles

trait Electric {
  val timeToCharge: Int //abstract field - must declare at sub-class level (as soon as its extended)
  def charge: String = s"Charge me for $timeToCharge hours"
}
