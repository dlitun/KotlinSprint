package lesson18_task4

open class Box {
    open fun getSurfaceArea(): Double = 0.0
}

class RectangularBox(
    private val length: Double,
    private val width: Double,
    private val height: Double
) : Box() {
    override fun getSurfaceArea(): Double {
        return 2 * (length * width + width * height + length * height)
    }
}

class CubeBox(private val edge: Double) : Box() {
    override fun getSurfaceArea(): Double {
        return 6 * edge * edge
    }
}

fun main() {
    val boxes: List<Box> = listOf(
        RectangularBox(2.0, 3.0, 4.0),
        CubeBox(3.0)
    )

    boxes.forEach { println("Surface area: ${it.getSurfaceArea()}") }
}