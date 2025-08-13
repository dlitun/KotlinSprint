package lesson6_task5

const val MIN = 1
const val MAX = 9
const val MAX_ATTEMPTS = 3

fun main() {
    var attemptsLeft = MAX_ATTEMPTS

    while (attemptsLeft > 0) {
        val firstNumber = (MIN..MAX).random()
        val secondNumber = (MIN..MAX).random()
        val correctAnswer = firstNumber + secondNumber

        print("Докажите, что вы не бот. Сложите: $firstNumber + $secondNumber = ")
        val userAnswer = readln().toIntOrNull()

        if (userAnswer == correctAnswer) {
            println("Добро пожаловать!")
            return
        }

        attemptsLeft--
        if (attemptsLeft > 0) {
            println("Неверно. Осталось попыток: $attemptsLeft")
        }
    }

    println("Доступ запрещен")
}