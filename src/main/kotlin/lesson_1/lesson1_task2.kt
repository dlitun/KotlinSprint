package lesson_2

fun main() {
    val totalOrdersCount: Int = 75
    val thankYouMessage: String = "Спасибо за покупку!"

    println("Количество заказов: $totalOrdersCount")
    println("Сообщение: $thankYouMessage")

    // Количество работников
    var totalEmployeesCount: Int = 2000
    println("Количество работников: $totalEmployeesCount")

    // Один работник уволился
    // println("Количество работников: $totalEmployeesCount")

    totalEmployeesCount = 1999
    println("Обновлённое количество работников: $totalEmployeesCount")
}