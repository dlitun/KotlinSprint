package lesson12_task2

class WeatherDayV2(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var hasPrecipitation: Boolean
) {

    fun printWeather() {
        println("Day temperature: $dayTemperature deg C")
        println("Night temperature: $nightTemperature deg C")
        println("Precipitation: $hasPrecipitation")
    }
}

fun main() {
    val wednesday = WeatherDayV2(28, 17, true)

    println("Weather on Wednesday:")
    wednesday.printWeather()
}