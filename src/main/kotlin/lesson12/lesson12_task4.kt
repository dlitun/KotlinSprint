package lesson12_task4

class WeatherDayV4(dayTempK: Int, nightTempK: Int, precipitation: Boolean) {

    var dayTemperature: Int
    var nightTemperature: Int
    var hasPrecipitation: Boolean

    init {
        dayTemperature = dayTempK - 273
        nightTemperature = nightTempK - 273
        hasPrecipitation = precipitation

        println("New weather object created:")
        println("Day temperature: $dayTemperature deg C")
        println("Night temperature: $nightTemperature deg C")
        println("Precipitation: $hasPrecipitation")
        println("---------------")
    }
}

fun main() {
    val friday = WeatherDayV4(300, 288, true)
}