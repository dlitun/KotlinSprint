package lesson4_task3

fun main() {
    val isSunny: Boolean = true
    val isTentOpen: Boolean = true
    val humidity: Int = 20
    val season: String = "зима"

    val areConditionsFavorable = isSunny && isTentOpen && humidity == 20 && season != "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $areConditionsFavorable")
}