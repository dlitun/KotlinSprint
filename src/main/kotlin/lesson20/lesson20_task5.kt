package lesson20_task5

import kotlin.random.Random

class Robot {
    private var modifier: (String) -> String = { it }

    private val phrases = listOf(
        "Hello, human!",
        "System check complete.",
        "Ready for new tasks.",
        "Battery fully charged.",
        "Mission accomplished."
    )

    fun say() {
        val phrase = phrases.random()
        println(modifier(phrase))
    }

    fun setModifier(mod: (String) -> String) {
        modifier = mod
    }
}

fun main() {
    val robot = Robot()

    robot.say()

    val invertModifier: (String) -> String = { text ->
        text.reversed()
    }

    robot.setModifier(invertModifier)
    robot.say()
}