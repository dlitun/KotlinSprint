package lesson7_task2

fun main() {
    val codes = 1000..9999
    var code: Int
    var input: Int

    do {
        code = codes.random()
        println("Ваш код авторизации: $code")

        print("Введите код: ")
        input = readln().toInt()

        if (input != code) {
            println("Неверный код. Отправляем новый...\n")
        }

    } while (input != code)

    println("Добро пожаловать!")
}