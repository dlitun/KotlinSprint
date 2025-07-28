package lesson4_task5

fun main() {
    println("Есть ли повреждения корпуса (true/false):")
    val hasDamage = readln().toBoolean()

    println("Введите текущий состав экипажа:")
    val crew = readln().toInt()

    println("Введите количество ящиков с провизией:")
    val foodBoxes = readln().toInt()

    println("Погода благоприятная? (true/false):")
    val isGoodWeather = readln().toBoolean()

    val canSail = (!hasDamage && crew in 55..70 && foodBoxes > 50) ||
            (hasDamage && crew == 70 && isGoodWeather && foodBoxes >= 50)

    println("Корабль может отправиться в плавание: $canSail")
}