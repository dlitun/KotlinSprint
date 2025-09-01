package lesson7_task2

fun main() {
    val codes: IntRange = 1000..9999
    var code: Int

    do {
        code = codes.random()
        println("Ваш код авторизации: $code")

        print("Введите код: ")
        val input = readln().toInt()

        if (input == code) {
            println("Добро пожаловать!")
            break
        } else {
            println("Неверный код. Отправляем новый...\n")
        }

    } while (true)
}