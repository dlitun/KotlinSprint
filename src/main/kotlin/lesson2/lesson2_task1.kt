package org.example.lesson2

fun main() {
    val score1 = 3
    val score2 = 4
    val score3 = 3
    val score4 = 5

    val average = (score1 + score2 + score3 + score4) / 4.0

    println(String.format("%.2f", average))
}