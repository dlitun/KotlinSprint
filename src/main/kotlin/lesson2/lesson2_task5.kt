package org.example.lesson2

fun main() {
    val initialDeposit = 70000.0
    val interestRate = 0.167
    val years = 20

    val finalAmount = initialDeposit * Math.pow(1 + interestRate, years.toDouble())

    println(String.format("%.3f", finalAmount))
}