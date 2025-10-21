package lesson16_task2

class Circle(private val radius: Double) {

    private val pi = 3.14

    fun calculateCircumference(): Double {
        return 2 * pi * radius
    }

    fun calculateArea(): Double {
        return pi * radius * radius
    }
}

fun main() {
    val circle = Circle(5.0)
    println("Circumference: ${circle.calculateCircumference()}")
    println("Area: ${circle.calculateArea()}")
}