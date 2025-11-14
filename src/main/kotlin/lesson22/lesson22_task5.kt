package lesson22_task5

import java.time.LocalDateTime

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: LocalDateTime,
    val distanceLightYears: Double
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri System",
        description = "Nearest star system to Earth, located in the Centaurus constellation.",
        dateTime = LocalDateTime.of(2025, 11, 11, 12, 0),
        distanceLightYears = 4.37
    )

    val placeName = alphaCentauri.component1()
    val placeDescription = alphaCentauri.component2()
    val eventDateTime = alphaCentauri.component3()
    val distance = alphaCentauri.component4()

    println("Name: $placeName")
    println("Description: $placeDescription")
    println("Date and time: $eventDateTime")
    println("Distance from Earth: $distance light years")
}