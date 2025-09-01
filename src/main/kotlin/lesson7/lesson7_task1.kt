package lesson7_task1

fun main() {
    val letters = 'a'..'z'
    val digits = 0..9
    var password = ""

    for (i in 1..3) {
        val letter = letters.random()
        val digit = digits.random()
        password += "$letter$digit"
    }

    println(password)
}