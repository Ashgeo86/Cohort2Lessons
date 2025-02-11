package Week2.Monday.AnimalSanctuary

trait AnimalType {

}

trait Mammal extends AnimalType {
  def isAMammal: Boolean = true
}

trait Bird extends AnimalType {
  def isABird: Boolean = true
}

trait Insect extends AnimalType {
  def isAnInsect: Boolean = true
}