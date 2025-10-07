package lesson12_task3

class WeatherDayV3(dayTempK: Int, nightTempK: Int, precipitation: Boolean) {

    var dayTemperature = dayTempK - 273
    var nightTemperature = nightTempK - 273
    var hasPrecipitation = precipitation

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