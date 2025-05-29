package org.example.lesson2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457

    val totalDepartureMinutes = departureHour * 60 + departureMinute
    val arrivalTotalMinutes = totalDepartureMinutes + travelTimeMinutes

    val arrivalHour = (arrivalTotalMinutes / 60) % 24
    val arrivalMinute = arrivalTotalMinutes % 60

    // Вывод
    println("Поезд прибудет в $arrivalHour:${arrivalMinute.toString().padStart(2, '0')}")
}