package lesson_3

fun main() {
    // Год полета — не меняется, поэтому val
    val yearOfFlight: Int = 1961

    // Время взлета — изменяемое (впоследствии меняется на время посадки), поэтому var
    var launchHour: Int = 9
    var launchMinute: Int = 7

    // Выводим год и время взлета
    println(yearOfFlight)
    println(launchHour)
    println(launchMinute)

    // Меняем время на посадку
    launchHour = 10
    launchMinute = 55

    // Выводим время посадки в формате "часы:минуты" без переноса после часов
    print("$launchHour:")
    println(launchMinute)
}