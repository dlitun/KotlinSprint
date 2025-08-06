package lesson5_task7

const val ONE_HUNDRED_KM = 100.0

fun main() {
    println("Калькулятор топлива")

    print("Введите расстояние поездки (км): ")
    val distance = readln().toDouble()

    print("Введите расход топлива на 100 км (л): ")
    val fuelConsumption = readln().toDouble()

    print("Введите цену за литр топлива (₽): ")
    val fuelPrice = readln().toDouble()

    val totalFuel = (distance * fuelConsumption) / ONE_HUNDRED_KM

    val totalCost = totalFuel * fuelPrice

    val formattedCost = String.format("%.2f", totalCost)
    val formattedFuel = String.format("%.2f", totalFuel)

    println("Необходимое количество топлива: $formattedFuel литров")
    println("Общая стоимость поездки: $formattedCost ₽")
}