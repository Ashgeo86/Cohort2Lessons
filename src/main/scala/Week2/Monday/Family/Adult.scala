package Week2.Monday.Family

class Forename (val forename: String)
class Surname (surname: String) //this cannot be access because we haven't assigend the val!


class Adult (val forename: Forename, val surname: Surname) { //type safe because we're using classes as types
  val under18: Boolean = false
}



object Adult {
  def apply(forename: Forename, surname: Surname): Adult = new Adult(forename, surname)
}