package lesson14_task4

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isHabitable: Boolean
)

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isHabitable: Boolean
) : CelestialBody(name, hasAtmosphere, isHabitable)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isHabitable: Boolean,
    val satellites: MutableList<Satellite> = mutableListOf()
) : CelestialBody(name, hasAtmosphere, isHabitable) {

    fun addSatellite(satellite: Satellite) {
        satellites.add(satellite)
    }

    fun printInfo() {
        println("Planet: $name")
        println("Has atmosphere: $hasAtmosphere")
        println("Habitable: $isHabitable")

        if (satellites.isEmpty()) {
            println("No satellites.")
        } else {
            println("Satellites:")
            satellites.forEach { println(" - ${it.name}") }
        }
    }
}

fun main() {
    val moon1 = Satellite("Lunara", hasAtmosphere = false, isHabitable = false)
    val moon2 = Satellite("Selena", hasAtmosphere = true, isHabitable = false)

    val planet = Planet("Aurelia", hasAtmosphere = true, isHabitable = true)
    planet.addSatellite(moon1)
    planet.addSatellite(moon2)

    planet.printInfo()
}