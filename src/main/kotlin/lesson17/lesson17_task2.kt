package lesson17_task2

class Ship(
    name: String,
    var speed: Double,
    var port: String
) {

    var name: String = name
        set(value) {
            println("You cannot change the ship's name!")
        }
}

fun main() {
    val ship = Ship("Black Pearl", 25.5, "Port Royal")

    println("Ship name: ${ship.name}")
    println("Average speed: ${ship.speed} knots")
    println("Home port: ${ship.port}")

    ship.name = "Flying Dutchman" // Попытка изменить имя
    ship.speed = 30.0
    ship.port = "Tortuga"

    println("Updated speed: ${ship.speed} knots")
    println("Updated port: ${ship.port}")
}