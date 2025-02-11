package Week2.Monday.Family

class Dog (val name: Name, val age: Age)

class Name (val name: String)
class Age (val age: Int)


object Dog {
  def apply(name: Name, age: Age): Dog = new Dog(name, age)
}