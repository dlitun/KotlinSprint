package lesson17_task2

class Ship(
    name: String,
    speed: Double,
    port: String
) {

    var name: String = name
        get() = field
        set(value) {
            println("You cannot change the ship's name!")
        }

    var speed: Double = speed
        get() = field
        set(value) {
            field = value
        }

    var port: String = port
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val ship = Ship("Black Pearl", 25.5, "Port Royal")

    println("Ship name: ${ship.name}")
    println("Average speed: ${ship.speed} knots")
    println("Home port: ${ship.port}")

    ship.name = "Flying Dutchman"

    ship.speed = 30.0
    ship.port = "Tortuga"

    println("Updated speed: ${ship.speed} knots")
    println("Updated port: ${ship.port}")
}