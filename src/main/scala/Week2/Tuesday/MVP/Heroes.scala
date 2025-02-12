package Week2.Tuesday.MVP

object heroclass extends App {

  case class Heroes(superName: String, power: String, age: Int, isMutant: Boolean)

  val scarletWitch = Heroes.apply("Scarlet Witch", "Telekinesis", 30, true)
  val thor = Heroes.apply("Thor", "Lightning", 1500, false)
  val cyclops = Heroes.apply("Cyclops", "Laser Eyes", 35, true)

  val copiedScarletWitch = scarletWitch.copy(power = "Mind Control")
  val copiedCyclops = cyclops.copy(isMutant = false)


}

