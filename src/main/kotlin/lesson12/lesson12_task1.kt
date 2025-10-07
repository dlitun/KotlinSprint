package lesson12_task1

class WeatherDay {
    var dayTemperature = 0
    var nightTemperature = 0
    var hasPrecipitation = false

    fun printWeather() {
        println("Day temperature: $dayTemperature deg C")
        println("Night temperature: $nightTemperature deg C")
        println("Precipitation: $hasPrecipitation")
    }
}

fun main() {

    val monday = WeatherDay()
    monday.dayTemperature = 22
    monday.nightTemperature = 14
    monday.hasPrecipitation = true

    val tuesday = WeatherDay()
    tuesday.dayTemperature = 25
    tuesday.nightTemperature = 16
    tuesday.hasPrecipitation = false

    println("Weather on Monday:")
    monday.printWeather()

    println("\nWeather on Tuesday:")
    tuesday.printWeather()
}