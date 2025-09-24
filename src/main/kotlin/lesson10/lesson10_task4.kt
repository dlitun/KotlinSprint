package lesson10_task4

fun main() {
    var wins = 0

    while (true) {
        val result = playRound()
        if (result == 1) {
            wins++
        }

        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val answer = readLine()

        if (answer != "Да") {
            println("Игра окончена. Вы выиграли $wins раз(а).")
            break
        }
    }
}

fun rollDice(): Int {
    return (1..6).random()
}

fun playRound(): Int {
    val player = rollDice()
    val computer = rollDice()

    println("Игрок бросил: $player")
    println("Компьютер бросил: $computer")

    if (player > computer) {
        println("Победило человечество!")
        return 1
    } else if (computer > player) {
        println("Победила машина!")
        return -1
    } else {
        println("Победила дружба!")
        return 0
    }
}