package lesson19_task3

class Spaceship {

    fun launch() {
        TODO("Add launch logic here later")
    }

    fun land() {
        throw NotImplementedError("Landing method is not implemented yet")
    }

    fun shootAsteroid() {
        println("The spaceship shoots an asteroid!")
    }
}

fun main() {
    val ship = Spaceship()
    ship.shootAsteroid()
}