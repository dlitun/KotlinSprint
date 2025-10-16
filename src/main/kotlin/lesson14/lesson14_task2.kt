package lesson14_task2

open class BaseLiner(
    val name: String,
    open val speed: Int = 28,
    open val passengerCapacity: Int = 3000,
    open val cargoCapacity: Int = 1500
) {
    open fun sail() {
        println("$name: Sailing at $speed knots.")
    }

    open fun runSystemDiagnostics() {
        println("$name: General system diagnostics completed.")
    }

    open fun printInfo() {
        println("Ship: $name")
        println("Speed: $speed knots")
        println("Passengers: $passengerCapacity")
        println("Cargo capacity: $cargoCapacity tons")
    }

    open fun loadCargo() {
        println("$name: Default loading process (to be overridden).")
    }
}

class PassengerLiner(
    name: String,
    override val speed: Int = 28,
    override val passengerCapacity: Int = 3500,
    override val cargoCapacity: Int = 1000
) : BaseLiner(name, speed, passengerCapacity, cargoCapacity) {

    override fun loadCargo() {
        println("$name: Deploying horizontal gangway from the quarterdeck.")
    }
}

class CargoFreighter(
    name: String,
    override val speed: Int = 20,
    override val passengerCapacity: Int = 60,
    override val cargoCapacity: Int = 20000
) : BaseLiner(name, speed, passengerCapacity, cargoCapacity) {

    override fun loadCargo() {
        println("$name: Activating loading crane.")
    }
}

class ArcticBreaker(
    name: String,
    override val speed: Int = 16,
    override val passengerCapacity: Int = 200,
    override val cargoCapacity: Int = 800
) : BaseLiner(name, speed, passengerCapacity, cargoCapacity) {

    override fun loadCargo() {
        println("$name: Opening rear gates for loading from the stern.")
    }

    fun breakIce() {
        println("$name: Ice breaking started!")
    }

    override fun runSystemDiagnostics() {
        super.runSystemDiagnostics()
        println("$name: Ice blades and reinforced hull check completed.")
    }
}

fun main() {
    val liner = PassengerLiner("Atlantic Queen")
    val freighter = CargoFreighter("Iron Whale")
    val breaker = ArcticBreaker("Northern Star")

    println("=== ${liner.name} ===")
    liner.printInfo()
    liner.sail()
    liner.loadCargo()
    liner.runSystemDiagnostics()
    println()

    println("=== ${freighter.name} ===")
    freighter.printInfo()
    freighter.sail()
    freighter.loadCargo()
    freighter.runSystemDiagnostics()
    println()

    println("=== ${breaker.name} ===")
    breaker.printInfo()
    breaker.sail()
    breaker.loadCargo()
    breaker.runSystemDiagnostics()
    breaker.breakIce()
}