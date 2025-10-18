package lesson15_task2

abstract class WeatherStationStats(val stationId: String) {
    abstract fun payload(): String
}

class Temperature(
    stationId: String,
    val celsius: Double
) : WeatherStationStats(stationId) {
    override fun payload(): String = "temperature=${"%.1f".format(celsius)}°C"
}

class PrecipitationAmount(
    stationId: String,
    val millimeters: Double
) : WeatherStationStats(stationId) {
    override fun payload(): String = "precipitation=${"%.1f".format(millimeters)}mm"
}

object WeatherServer {
    fun send(stat: WeatherStationStats) {
        val timestamp = System.currentTimeMillis()
        println("Sending from ${stat.stationId} at $timestamp: ${stat.payload()}")
        println("Status: OK")
        println()
    }
}

fun main() {
    val t = Temperature("Station-001", 21.8)
    val p = PrecipitationAmount("Station-002", 5.4)

    WeatherServer.send(t)
    WeatherServer.send(p)
}