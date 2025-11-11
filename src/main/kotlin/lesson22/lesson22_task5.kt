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

    val (name, description, dateTime, distance) = alphaCentauri

    println("Name: $name")
    println("Description: $description")
    println("Date and time: $dateTime")
    println("Distance from Earth: $distance light years")
}