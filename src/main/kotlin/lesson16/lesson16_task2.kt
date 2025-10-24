package lesson16_task2

import kotlin.math.pow

private const val PI = 3.14

class Circle(private val radius: Double) {

    fun getCircumference(): Double {
        return 2 * PI * radius
    }

    fun getArea(): Double {
        return PI * radius.pow(2)
    }
}

fun main() {
    val circle = Circle(5.0)
    println("Circumference: ${circle.getCircumference()}")
    println("Area: ${circle.getArea()}")
}