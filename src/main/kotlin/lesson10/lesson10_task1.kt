package lesson10_task1

fun main() {
    println("Игра: человек против компьютера!")

    val playerRoll = rollDice()
    val computerRoll = rollDice()

    printResult(playerRoll, computerRoll)
}

fun rollDice(): Int = (1..6).random()

fun printResult(player: Int, computer: Int) {
    println("Игрок бросил кость: $player")
    println("Компьютер бросил кость: $computer")

    when {
        player > computer -> println("Победило человечество!")
        computer > player -> println("Победила машина!")
        else -> println("Победила дружба!")
    }
}