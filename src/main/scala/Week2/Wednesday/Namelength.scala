package Week2.Wednesday

class Namelength {

  def getNameLength(firstName: String, surname: String): Int = {
    if(firstName.length > surname.length){
      firstName.length
    } else if (firstName.length < surname.length){
      surname.length
    } else {
      0
    }
  }
}