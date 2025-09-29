package lesson11_task2

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = ""
) {

    fun printInfo() {
        println("User info:")
        println("id = $id")
        println("login = $login")
        println("email = $email")
        println("bio = ${if (bio.isEmpty()) "No data" else bio}")
        println()
    }

    fun setBio() {
        println("Enter your bio:")
        bio = readln()
        println("Bio has been updated!\n")
    }

    fun changePassword() {
        println("Enter your current password:")
        val current = readln()

        if (current == password) {
            println("Password is correct. Enter a new password:")
            val newPass = readln()
            password = newPass
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
        email = "maria@example.com",
    )

    user.printInfo()
    user.setBio()
    user.changePassword()
    user.printInfo()
}