package lesson20_task1

fun main() {
    val greetUser: (String) -> String = { username: String ->
        "Happy New Year, $username!"
    }
    println(greetUser("Dmitry"))
}