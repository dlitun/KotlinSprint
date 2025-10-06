package lesson12_task3

class WeatherDayV3(dayTempK: Int, nightTempK: Int, precipitation: Boolean) {

    var dayTemperature: Int
    var nightTemperature: Int
    var hasPrecipitation: Boolean

    init {
        dayTemperature = dayTempK - 273
        nightTemperature = nightTempK - 273
        hasPrecipitation = precipitation
    }

    fun printWeather() {
        println("Day temperature: $dayTemperature deg C")
        println("Night temperature: $nightTemperature deg C")
        println("Precipitation: $hasPrecipitation")
    }
}

fun main() {
    val thursday = WeatherDayV3(298, 289, false)

    println("Weather on Thursday:")
    thursday.printWeather()
}