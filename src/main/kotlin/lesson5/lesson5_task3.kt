package lesson5_task3

fun main() {
    val winNumber1 = 17
    val winNumber2 = 34

    println("Введите первое число от 0 до 42:")
    val userNumber1 = readln().toInt()

    println("Введите второе число от 0 до 42:")
    val userNumber2 = readln().toInt()

    val guessedBoth = (userNumber1 == winNumber1 && userNumber2 == winNumber2) ||
            (userNumber1 == winNumber2 && userNumber2 == winNumber1)

    val guessedOne = (userNumber1 == winNumber1 || userNumber1 == winNumber2 ||
            userNumber2 == winNumber1 || userNumber2 == winNumber2)

    if (guessedBoth) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (guessedOne) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Правильные числа были: $winNumber1 и $winNumber2")
}