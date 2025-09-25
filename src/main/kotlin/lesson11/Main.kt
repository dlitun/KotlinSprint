package lesson11

fun main() {
    val user1 = User(
        id = 1,
        login = "dima123",
        password = "qwerty123",
        email = "dima@example.com",
    )

    val user2 = User(
        id = 2,
        login = "anna2025",
        password = "pass2025",
        email = "anna@example.com",
    )

    println("User 1: id=${user1.id}, login=${user1.login}, password=${user1.password}, email=${user1.email}")
    println("User 2: id=${user2.id}, login=${user2.login}, password=${user2.password}, email=${user2.email}")
}