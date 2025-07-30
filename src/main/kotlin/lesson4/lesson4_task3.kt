package lesson4_task3

const val REQUIRED_HUMIDITY: Int = 20
const val REQUIRED_SEASON: String = "зима"
const val IS_SUNNY: Boolean = true
const val IS_TENT_OPEN: Boolean = true

fun main() {

    val humidity: Int = 20
    val season: String = "зима"
    val areConditionsFavorable = IS_SUNNY && IS_TENT_OPEN && humidity == REQUIRED_HUMIDITY && season != REQUIRED_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $areConditionsFavorable")
}