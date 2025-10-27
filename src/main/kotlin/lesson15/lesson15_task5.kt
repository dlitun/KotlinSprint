package lesson15_task5

interface Movable {
    fun move(to: String)
}

interface PassengerCarrier {
    val maxPassengers: Int
    fun currentPassengers(): Int
    fun loadPassengers(n: Int)
    fun unloadPassengers(n: Int)
}

interface CargoCarrier {
    val maxCargoTons: Double
    fun currentCargoTons(): Double
    fun loadCargo(t: Double)
    fun unloadCargo(t: Double)
}

class Truck : Movable, PassengerCarrier, CargoCarrier {
    override val maxPassengers: Int = 1
    private var passengers: Int = 0

    override fun currentPassengers(): Int = passengers

    override fun loadPassengers(n: Int) {
        passengers = (passengers + n).coerceAtMost(maxPassengers)
    }

    override fun unloadPassengers(n: Int) {
        passengers = (passengers - n).coerceAtLeast(0)
    }

    override val maxCargoTons: Double = 2.0
    private var cargoTons: Double = 0.0

    override fun currentCargoTons(): Double = cargoTons

    override fun loadCargo(t: Double) {
        cargoTons = (cargoTons + t).coerceAtMost(maxCargoTons)
    }

    override fun unloadCargo(t: Double) {
        cargoTons = (cargoTons - t).coerceAtLeast(0.0)
    }

    override fun move(to: String) {
        println("Truck is moving to $to (pax=${currentPassengers()}, cargo=${currentCargoTons()} t)")
    }
}

class Car : Movable, PassengerCarrier {
    override val maxPassengers: Int = 3
    private var passengers: Int = 0

    override fun currentPassengers(): Int = passengers

    override fun loadPassengers(n: Int) {
        passengers = (passengers + n).coerceAtMost(maxPassengers)
    }

    override fun unloadPassengers(n: Int) {
        passengers = (passengers - n).coerceAtLeast(0)
    }

    override fun move(to: String) {
        println("Car is moving to $to (pax=${currentPassengers()})")
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