package lesson3

fun main() {
    val moveString = "D2-D4;0"

    val (from, to, moveNumber) = moveString.split("-", ";")

    println("$from-$to;$moveNumber")
    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $moveNumber")
}