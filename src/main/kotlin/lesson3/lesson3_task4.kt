package lesson4

fun main() {
    var from = "E2"
    var to = "E4"
    var moveNumber = 1

    val move1 = "$from-$to;$moveNumber"
    println(move1)

    from = "D2"
    to = "D3"
    moveNumber = 2

    val move2 = "$from-$to;$moveNumber"
    println(move2)
}