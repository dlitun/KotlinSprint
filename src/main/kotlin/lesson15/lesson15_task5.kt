package lesson15_task5

interface Movable {
    fun move(to: String)
}

interface PassengerCarrier {
    val maxPassengers: Int
    var passengers: Int

    fun loadPassengers(n: Int) {
        passengers = (passengers + n).coerceAtMost(maxPassengers)
    }

    fun unloadPassengers(n: Int) {
        passengers = (passengers - n).coerceAtLeast(0)
    }
}

interface CargoCarrier {
    val maxCargoTons: Double
    var cargoTons: Double

    fun loadCargo(t: Double) {
        cargoTons = (cargoTons + t).coerceAtMost(maxCargoTons)
    }

    fun unloadCargo(t: Double) {
        cargoTons = (cargoTons - t).coerceAtLeast(0.0)
    }
}

class Truck : Movable, PassengerCarrier, CargoCarrier {
    override val maxPassengers = 1
    override var passengers = 0
    override val maxCargoTons = 2.0
    override var cargoTons = 0.0

    override fun move(to: String) {
        println("Truck is moving to $to")
    }
}

class Car : Movable, PassengerCarrier {
    override val maxPassengers = 3
    override var passengers = 0

    override fun move(to: String) {
        println("Car is moving to $to")
    }
}

fun main() {
    val truck = Truck()
    val carA = Car()
    val carB = Car()

    carA.loadPassengers(3)
    carB.loadPassengers(2)
    truck.loadPassengers(1)
    truck.loadCargo(2.0)

    listOf(carA, carB, truck).forEach { it.move("Point B") }

    carA.unloadPassengers(3)
    carB.unloadPassengers(2)
    truck.unloadPassengers(1)
    truck.unloadCargo(2.0)

    println("Total transported: 6 passengers and 2 tons of cargo.")
}