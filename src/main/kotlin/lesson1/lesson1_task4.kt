package lesson_4

fun main() {
    val flightDistanceMm: Long = 40_868_600_000L
    val cosmonautAge: Byte = 27
    val flightFractionOfDay: Float = 0.075f
    val flightDurationSeconds: Short = 6480
    val flightFractionOfYear: Double = 2.0547945205479453E-4
    val orbitApogeeMeters: Int = 327000

    println("Расстояние: $flightDistanceMm")
    println("Возраст: $cosmonautAge")
    println("Часть дня: $flightFractionOfDay")
    println("Секунды: $flightDurationSeconds")
    println("Часть года: $flightFractionOfYear")
    println("Апогей орбиты: $orbitApogeeMeters")
}