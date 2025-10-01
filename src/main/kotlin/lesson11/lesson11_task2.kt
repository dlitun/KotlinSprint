package lesson11_task2

class User2(
    val id: Int,
    val login: String,
    private var password: String,
    val email: String,
    var bio: String? = null
) {

    fun printInfo() {
        println("User info:")
        println("id = $id")
        println("login = $login")
        println("email = $email")
        println("bio = ${bio ?: "No data"}")
        println()
    }

    fun setBio() {
        println("Enter your bio:")
        val input = readln().ifBlank { null }
        bio = input
        println("Bio has been updated!\n")
    }

    fun changePassword() {
        println("Enter your current password:")
        val current = readln()

        if (current == password) {
            println("Password is correct. Enter a new password:")
            password = readln()
            println("Password has been successfully changed!\n")
        } else {
            println("Incorrect current password. Password was not changed.\n")
        }
    }
}

fun main() {
    val user = User2(
        id = 3,
        login = "maria2025",
        password = "12345",
        email = "maria@example.com"
    )

    user.printInfo()
    user.setBio()
    user.changePassword()
    user.printInfo()
}