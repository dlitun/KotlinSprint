package lesson4_task4

fun main() {
    val day = 5

    val isEvenDay = day % 2 == 0

    val arms = !isEvenDay
    val abs = !isEvenDay
    val legs = isEvenDay
    val back = isEvenDay

    println("""
        Упражнения для рук:    $arms
        Упражнения для ног:    $legs
        Упражнения для спины:  $back
        Упражнения для пресса: $abs
    """.trimIndent())
}