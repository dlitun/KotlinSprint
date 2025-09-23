package lesson10_task3

fun main() {
    println("Введите длину пароля:")
    val length = readLine()?.toInt() ?: 0
    val password = generatePassword(length)
    println("Сгенерированный пароль: $password")
}

fun generatePassword(length: Int): String {
    val digits = "0123456789"
    val symbols = """!"#$%&'()*+,-./ """
    var password = ""

    for (i in 0 until length) {
        password += if (i % 2 == 0) {
            digits.random()
        } else {
            symbols.random()
        }
    }

    return password
}