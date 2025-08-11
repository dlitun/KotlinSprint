package lesson6_task1

fun main() {
    println("Регистрация")
    print("Придумайте логин: ")
    val registeredLogin = readln()
    print("Придумайте пароль: ")
    val registeredPassword = readln()

    println("Авторизация")
    while (true) {
        print("Введите логин: ")
        val login = readln()
        print("Введите пароль: ")
        val password = readln()

        if (login == registeredLogin && password == registeredPassword) {
            println("Авторизация прошла успешно")
            break
        } else {
            println("Неверный логин или пароль. Попробуйте снова.")
        }
    }
}