package lesson7_task5

fun main() {
    print("Введите длину пароля (минимум 6): ")
    val length = readln().toInt()

    if (length < 6) {
        println("Пароль должен быть не короче 6 символов")
        return
    }

    val digits = ('0'..'9')
    val lowers = ('a'..'z')
    val uppers = ('A'..'Z')

    val allChars = digits + lowers + uppers

    val passwordChars = mutableListOf<Char>()
    passwordChars += digits.random()
    passwordChars += lowers.random()
    passwordChars += uppers.random()

    repeat(length - 3) {
        passwordChars += allChars.random()
    }

    passwordChars.shuffle()

    val password = passwordChars.joinToString("")

    println("Ваш пароль: $password")
}