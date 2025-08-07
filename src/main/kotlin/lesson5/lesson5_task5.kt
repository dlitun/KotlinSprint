package lesson5_task5

fun main() {
    val number1 = 7
    val number2 = 14
    val number3 = 25

    val winningNumbers = listOf(number1, number2, number3)

    println("Угадайте три числа от 0 до 42!")

    print("Введите первое число: ")
    val userNumber1 = readln().toInt()

    print("Введите второе число: ")
    val userNumber2 = readln().toInt()

    print("Введите третье число: ")
    val userNumber3 = readln().toInt()

    val userNumbers = listOf(userNumber1, userNumber2, userNumber3)

    val matched = winningNumbers.intersect(userNumbers)
    val matchedCount = matched.size

    val resultText = when (matchedCount) {
        3 -> "Поздравляем! Вы угадали все числа и выиграли ДЖЕКПОТ!"
        2 -> "Отлично! Вы угадали два числа и получаете крупный приз!"
        1 -> "Вы угадали одно число. Вам достаётся утешительный приз."
        else -> "Вы не угадали ни одного числа. Попробуйте снова!"
    }

    println(resultText)
    println("Выигрышные числа были: $winningNumbers")
}