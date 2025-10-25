package lesson17_task4

class Parcel(
    val trackingNumber: String,
    location: String
) {
    var location: String = location
        set(value) {
            field = value
            movementCount++
            println("Parcel arrived at: $value")
        }

    var movementCount: Int = 0
        private set
}

fun main() {
    val parcel = Parcel("AB123456789RU", "Moscow")

    println("Tracking number: ${parcel.trackingNumber}")
    println("Current location: ${parcel.location}")
    println("Movements: ${parcel.movementCount}")

    parcel.location = "Saint Petersburg"
    parcel.location = "Helsinki"
    parcel.location = "Stockholm"

    println("\nFinal location: ${parcel.location}")
    println("Total movements: ${parcel.movementCount}")
}
