package lesson7_task5

fun main() {
    print("Введите длину пароля (минимум 6): ")
    val length = readLine()!!.toInt()

    if (length < 6) {
        println("Пароль должен быть не короче 6 символов")
        return
    }

    val digits = "0123456789"
    val lowers = "abcdefghijklmnopqrstuvwxyz"
    val uppers = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val allChars = digits + lowers + uppers

    var password = ""

    for (i in 1..length) {
        password += allChars.random()
    }

    println("Ваш пароль: $password")
}