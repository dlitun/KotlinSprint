package lesson10_task5

const val VALID_LOGIN = "user@example.com"
const val VALID_PASSWORD = "qwerty123"

fun main() {
    println("Авторизация в интернет-магазине")

    print("Логин: ")
    val login = readLine() ?: ""

    print("Пароль: ")
    val password = readLine() ?: ""

    val token = authorize(login, password)

    if (token == null) {
        println("Логин или пароль неверны. Авторизация не удалась.")
        return
    }

    println("Авторизация успешна! Токен: $token")

    val cart = getCart(token)

    println("Содержимое корзины:")
    for (item in cart) {
        println("- $item")
    }
}

fun authorize(login: String, password: String): String? {
    if (login == VALID_LOGIN && password == VALID_PASSWORD) {
        return generateToken(32)
    } else {
        return null
    }
}

fun getCart(token: String): List<String> {
    val cart = listOf(
        "Ноутбук 14\"",
        "Беспроводная мышь",
        "Рюкзак для ноутбука",
        "Переходник USB-C → HDMI"
    )
    return cart
}

fun generateToken(length: Int): String {
    val alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
    var token = ""
    for (i in 0 until length) {
        token += alphabet.random()
    }
    return token
}