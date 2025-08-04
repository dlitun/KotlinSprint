package lesson5_task2

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2025

fun main() {
    println("Введите год вашего рождения:")
    val birthYear = readln().toInt()
    val userAge = CURRENT_YEAR - birthYear

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран приложения")
    }
}