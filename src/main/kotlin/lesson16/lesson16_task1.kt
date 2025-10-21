package lesson16_task1

class Dice {
    private val number = kotlin.random.Random.nextInt(1, 7)

    fun printNumber() {
        println("You rolled: $number")
    }
}

fun main() {
    val dice = Dice()
    dice.printNumber()
}