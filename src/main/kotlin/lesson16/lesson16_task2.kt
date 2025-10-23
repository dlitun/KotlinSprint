package lesson16_task2

import kotlin.math.pow

class Circle(private val radius: Double) {

    companion object {
        const val PI = 3.14
    }

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