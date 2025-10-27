package lesson18_task2

open class Dice {
    open fun roll() {}
}

class FourSidedDice : Dice() {
    override fun roll() {
        val result = (1..4).random()
        println("4-sided dice rolled: $result")
    }
}

class SixSidedDice : Dice() {
    override fun roll() {
        val result = (1..6).random()
        println("6-sided dice rolled: $result")
    }
}

class EightSidedDice : Dice() {
    override fun roll() {
        val result = (1..8).random()
        println("8-sided dice rolled: $result")
    }
}

fun main() {
    val diceList: List<Dice> = listOf(
        FourSidedDice(),
        SixSidedDice(),
        EightSidedDice()
    )

    diceList.forEach { it.roll() }
}