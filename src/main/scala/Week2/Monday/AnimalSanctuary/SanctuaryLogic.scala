package Week2.Monday.AnimalSanctuary

object SanctuaryLogic extends App {
 val pumba = new Warthog(name = "Pumba", age = 30, hasTusks = true)
 val admiral = new Owl(name = "Admiral", age = 5, hootsPerNight = 50)
 val buzz = new Dragonfly(name = "Buzz", age = 1, wingPairs = 4)

 println(pumba.isAMammal)
 println(pumba.name)
 println(pumba.age)
 println(admiral.isABird)
 println(admiral.name)
 println(admiral.age)
 println(buzz.isAnInsect)
 println(buzz.name)
 println(buzz.age)
}
