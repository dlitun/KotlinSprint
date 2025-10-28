package lesson18_task5

class Screen {
    fun draw(x: Int, y: Int): String {
        return "Drawn point at Int coordinates ($x, $y)"
    }

    fun draw(x: Float, y: Float): String {
        return "Drawn point at Float coordinates ($x, $y)"
    }

    fun draw(x: Int, y: Int, radius: Int): String {
        return "Drawn circle at Int coordinates ($x, $y) with radius $radius"
    }

    fun draw(x: Float, y: Float, radius: Float): String {
        return "Drawn circle at Float coordinates ($x, $y) with radius $radius"
    }

    fun draw(x: Int, y: Int, side: Int, isSquare: Boolean = true): String {
        return "Drawn square at Int coordinates ($x, $y) with side $side"
    }

    fun draw(x: Float, y: Float, side: Float, isSquare: Boolean = true): String {
        return "Drawn square at Float coordinates ($x, $y) with side $side"
    }
}

fun main() {
    val screen = Screen()

    println(screen.draw(10, 20))
    println(screen.draw(15.5f, 25.3f))
    println(screen.draw(30, 40, 10))
    println(screen.draw(12.5f, 22.7f, 5.5f))
    println(screen.draw(50, 60, 25, true))
    println(screen.draw(5.5f, 7.7f, 12.3f))
}
