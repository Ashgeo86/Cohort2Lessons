package Week2.Wednesday


// Username must be equal to or more than 8 letters long
// Must be all lowercase

class Username {

  def checkUsername (username: String): Boolean = {  //When someone enters a username, it'll return a Boolean
    if (username.length >= 8 && username.toLowerCase == username){  //if username is more than or equal to 8 letters and lowercase
      true  // it'll return true
    } else {
      false  // otherwise it'll return false
    }
  }
}
