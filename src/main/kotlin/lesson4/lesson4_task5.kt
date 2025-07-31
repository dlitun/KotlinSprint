package lesson4_task5

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_FOOD_BOXES = 50

const val HAS_NO_DAMAGE = false
const val IS_WEATHER_GOOD = true

fun main() {
    println("Есть ли повреждения корпуса (true/false):")
    val hasDamage = readln().toBoolean()

    println("Введите текущий состав экипажа:")
    val crew = readln().toInt()

    println("Введите количество ящиков с провизией:")
    val foodBoxes = readln().toInt()

    println("Погода благоприятная? (true/false):")
    val isGoodWeather = readln().toBoolean()

    val canSail = (hasDamage == HAS_NO_DAMAGE && crew in MIN_CREW..MAX_CREW && foodBoxes > MIN_FOOD_BOXES) ||
            (hasDamage != HAS_NO_DAMAGE && crew == MAX_CREW && isGoodWeather == IS_WEATHER_GOOD && foodBoxes >= MIN_FOOD_BOXES)

    println("Корабль может отправиться в плавание: $canSail")
}