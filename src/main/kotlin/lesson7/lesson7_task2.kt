package lesson7_task2

fun main() {
    val codes: IntRange = 1000..9999

    while (true) {
        val code = codes.random()

        println("Ваш код авторизации: $code")
        print("Введите код: ")
        val input = readLine()

        if (input == code.toString()) {
            println("Добро пожаловать!")
            break
        } else {
            println("Неверный код. Отправляем новый...\n")
        }
    }
}