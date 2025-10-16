package lesson14_task1

open class Liner(
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
}

class CargoShip(
    name: String,
    override val speed: Int = 20,
    override val passengerCapacity: Int = 60,
    override val cargoCapacity: Int = 20000
) : Liner(name, speed, passengerCapacity, cargoCapacity) {

    fun loadCargo(tons: Int) {
        println("$name: Loading $tons tons of cargo.")
    }
}

class Icebreaker(
    name: String,
    override val speed: Int = 16,
    override val passengerCapacity: Int = 200,
    override val cargoCapacity: Int = 800
) : Liner(name, speed, passengerCapacity, cargoCapacity) {

    fun breakIce() {
        println("$name: Ice breaking started!")
    }

    override fun runSystemDiagnostics() {
        super.runSystemDiagnostics()
        println("$name: Ice blades and reinforced hull check completed.")
    }
}

fun main() {
    val liner = Liner("Ocean Dream")
    val cargo = CargoShip("Steel Whale")
    val icebreaker = Icebreaker("Polar Star")

    println("=== ${liner.name} ===")
    liner.sail()
    liner.runSystemDiagnostics()
    println("Passengers: ${liner.passengerCapacity}, Cargo capacity: ${liner.cargoCapacity} tons")
    println()

    println("=== ${cargo.name} ===")
    cargo.sail()
    cargo.runSystemDiagnostics()
    cargo.loadCargo(12000)
    println("Passengers: ${cargo.passengerCapacity}, Cargo capacity: ${cargo.cargoCapacity} tons")
    println()

    println("=== ${icebreaker.name} ===")
    icebreaker.sail()
    icebreaker.runSystemDiagnostics()
    icebreaker.breakIce()
    println("Passengers: ${icebreaker.passengerCapacity}, Cargo capacity: ${icebreaker.cargoCapacity} tons")
}