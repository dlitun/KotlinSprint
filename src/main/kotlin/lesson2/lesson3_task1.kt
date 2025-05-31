package org.example.lesson2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457

    val minutesInHour = 60
    val hoursInDay = 24

    val totalDepartureMinutes = departureHour * minutesInHour + departureMinute
    val arrivalTotalMinutes = totalDepartureMinutes + travelTimeMinutes

    val arrivalHour = (arrivalTotalMinutes / minutesInHour) % hoursInDay
    val arrivalMinute = arrivalTotalMinutes % minutesInHour

    println("Поезд прибудет в $arrivalHour:${arrivalMinute.toString().padStart(2, '0')}")
}