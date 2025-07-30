package lesson4_task5

fun main() {
    val MIN_CREW = 55
    val MAX_CREW = 70
    val MIN_FOOD_BOXES = 50

    println("Есть ли повреждения корпуса (true/false):")
    val hasDamage = readln().toBoolean()

    println("Введите текущий состав экипажа:")
    val crew = readln().toInt()

    println("Введите количество ящиков с провизией:")
    val foodBoxes = readln().toInt()

    println("Погода благоприятная? (true/false):")
    val isGoodWeather = readln().toBoolean()

    val canSail = (!hasDamage && crew in MIN_CREW..MAX_CREW && foodBoxes > MIN_FOOD_BOXES) ||
            (hasDamage && crew == MAX_CREW && isGoodWeather && foodBoxes >= MIN_FOOD_BOXES)

    println("Корабль может отправиться в плавание: $canSail")
}