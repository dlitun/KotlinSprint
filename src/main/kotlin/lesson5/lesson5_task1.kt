package lesson5_task1

fun main() {
    val number1 = 2
    val number2 = 2

    println("Докажите, что вы не бот! Решите пример:")
    println("$number1 + $number2 = ?")

    val userAnswer = readln().toInt()

    if (userAnswer == number1 + number2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}