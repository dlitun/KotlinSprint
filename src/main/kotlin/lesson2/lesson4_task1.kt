package org.example.lesson2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffPercent = 20

    val crystalBonus = (crystalOre * buffPercent) / 100
    val ironBonus = (ironOre * buffPercent) / 100

    println("Кристаллическая руда: $crystalBonus")
    println("Железная руда: $ironBonus")
}