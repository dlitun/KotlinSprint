package lesson14_task3

abstract class Figure(val color: String) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }
}

fun main() {
    val figures = listOf(
        Circle("black", 5.0),
        Rectangle("black", 4.0, 6.0),
        Circle("white", 3.0),
        Rectangle("white", 2.0, 8.0),
        Circle("black", 7.0)
    )

    val blackPerimeterSum = figures
        .filter { it.color == "black" }
        .sumOf { it.calculatePerimeter() }

    val whiteAreaSum = figures
        .filter { it.color == "white" }
        .sumOf { it.calculateArea() }

    println("Sum of perimeters of all black figures: $blackPerimeterSum")
    println("Sum of areas of all white figures: $whiteAreaSum")
}