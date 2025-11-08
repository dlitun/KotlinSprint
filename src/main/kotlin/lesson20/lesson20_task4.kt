package lesson20_task4

fun main() {
    val items = listOf("Home", "Profile", "Settings", "About", "Exit")

    val lambdas = items.map { item ->
        { println("Item clicked: $item") }
    }

    for (i in lambdas.indices) {
        if (i % 2 == 0) lambdas[i]()
    }
}