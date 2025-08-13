package lesson6_task4

const val MIN = 1
const val MAX = 9
const val MAX_ATTEMPTS = 5

fun main() {
    val secretNumber = (MIN..MAX).random()
    var attempts = MAX_ATTEMPTS

    while (attempts > 0) {
        print("Введите число от $MIN до $MAX: ")
        val guess = readln().toIntOrNull()

        if (guess == null || guess !in MIN..MAX) {
            println("Введите корректное число от $MIN до $MAX!")
            continue
        }

        if (guess == secretNumber) {
            println("Это была великолепная игра!")
            return
        }

        attempts--
        if (attempts > 0) {
            println("Неверно. Осталось попыток: $attempts")
        }
    }
    println("Было загадано число $secretNumber")
}