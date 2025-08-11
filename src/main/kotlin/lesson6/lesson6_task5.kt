package lesson6_task5

const val MIN = 1
const val MAX = 9
const val MAX_ATTEMPTS = 3

fun main() {
    var attempts = MAX_ATTEMPTS

    while (attempts > 0) {
        val a = (MIN..MAX).random()
        val b = (MIN..MAX).random()
        val correct = a + b

        print("Докажите, что вы не бот. Сложите: $a + $b = ")
        val answer = readln().toIntOrNull()

        if (answer == correct) {
            println("Добро пожаловать!")
            return
        } else {
            attempts--
            if (attempts > 0) {
                println("Неверно. Осталось попыток: $attempts")
            } else {
                println("Доступ запрещен")
            }
        }
    }
}

