package Week3.Friday

case class Name (value: String)

  case class Postcode (value: String)

  case class Letter (name: Name, postcode: Postcode)

  trait GenericPostageError {
    val message: String
  }

  case class InvalidNameError (message: String) extends GenericPostageError

  case class InvalidPostageError (message: String) extends GenericPostageError
