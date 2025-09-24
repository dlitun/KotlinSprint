package lesson10_task2

fun main() {
    println("Регистрация в приложении")

    val login = getLogin()
    val password = getPassword()

    if (validateInput(login) && validateInput(password)) {
        println("Добро пожаловать, $login!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun getLogin(): String {
    println("Введите логин:")
    return readLine() ?: ""
}

fun getPassword(): String {
    println("Введите пароль:")
    return readLine() ?: ""
}

fun validateInput(input: String): Boolean {
    return input.length >= 4
}