package lesson9_task3
fun main() {
    val ingredients = mutableListOf(2, 50, 15)

    print("Введите количество порций: ")
    val portions = readln().toInt()

    val result = ingredients.map { it * portions }

    println("На $portions порций вам понадобится: " +
            "Яиц – ${result[0]}, молока – ${result[1]} мл, сливочного масла – ${result[2]} гр.")
}