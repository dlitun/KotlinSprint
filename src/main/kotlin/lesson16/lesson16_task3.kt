package lesson16_task3

class User(private val login: String, private val password: String) {

    fun validatePassword(input: String): Boolean {
        return input == password
    }
}

fun main() {
    val user = User("ivan", "qwerty123")

    val result = user.validatePassword("qwerty123")
    println("Password is correct: $result")

    val wrong = user.validatePassword("12345")
    println("Password is correct: $wrong")
}