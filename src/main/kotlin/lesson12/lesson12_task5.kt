package lesson12_task5

class WeatherDayV5(dayTempK: Int, nightTempK: Int, precipitation: Boolean) {

    var dayTemperature: Int
    var nightTemperature: Int
    var hasPrecipitation: Boolean

    init {
        dayTemperature = dayTempK - 273
        nightTemperature = nightTempK - 273
        hasPrecipitation = precipitation
    }
}

fun main() {

    val monthWeather = mutableListOf<WeatherDayV5>()

    for (i in 1..30) {
        val randomDayTempK = kotlin.random.Random.nextInt(280, 310)
        val randomNightTempK = kotlin.random.Random.nextInt(270, 300)
        val randomPrecipitation = kotlin.random.Random.nextBoolean()

        val day = WeatherDayV5(randomDayTempK, randomNightTempK, randomPrecipitation)
        monthWeather.add(day)
    }

    val dayTemps = monthWeather.map { it.dayTemperature }
    val nightTemps = monthWeather.map { it.nightTemperature }
    val rainyDays = monthWeather.count { it.hasPrecipitation }

    val avgDayTemp = dayTemps.average()
    val avgNightTemp = nightTemps.average()

    println("Monthly weather statistics:")
    println("Average day temperature: ${"%.1f".format(avgDayTemp)} deg C")
    println("Average night temperature: ${"%.1f".format(avgNightTemp)} deg C")
    println("Days with precipitation: $rainyDays out of 30")
}