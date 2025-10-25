package lesson17_task5

class User(
    login: String,
    password: String
) {
    var login = login
        set(value) {
            field = value
            println("Login has been successfully changed to \"$value\"")
        }

    var password = password
        get() = "*".repeat(field.length)
        set(value) {
            println("You cannot change the password.")
        }
}

fun main() {
    val user = User("dlitun", "SuperSecret123")

    println("Login: ${user.login}")
    println("Password: ${user.password}")

    user.login = "newUser123"
    user.password = "NewPass456"

    println("Updated login: ${user.login}")
    println("Password after attempt: ${user.password}")
}