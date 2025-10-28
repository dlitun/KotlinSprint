package lesson18_task2

abstract class Dice(
    private val sides: Int
) {
    open fun roll() {
        val result = (1..sides).random()
        println("$sides-sided dice rolled: $result")
    }
}

class FourSidedDice : Dice(4)
class SixSidedDice : Dice(6)
class EightSidedDice : Dice(8)

fun main() {
    val diceList: List<Dice> = listOf(
        FourSidedDice(),
        SixSidedDice(),
        EightSidedDice()
    )

    diceList.forEach { it.roll() }
}