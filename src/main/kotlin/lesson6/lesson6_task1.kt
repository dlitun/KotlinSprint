package lesson6_task1

fun main() {
    println("Регистрация")
    print("Придумайте логин: ")
    val registeredLogin = readLine() ?: ""
    print("Придумайте пароль: ")
    val registeredPassword = readLine() ?: ""

    println("Авторизация")
    while (true) {
        print("Введите логин: ")
        val login = readLine() ?: ""
        print("Введите пароль: ")
        val password = readLine() ?: ""

        if (login == registeredLogin && password == registeredPassword) {
            println("Авторизация прошла успешно")
            break
        } else {
            println("Неверный логин или пароль. Попробуйте снова.")
        }
    }
}