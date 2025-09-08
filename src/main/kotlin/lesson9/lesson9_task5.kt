package lesson9_task5

fun main() {
    val ingredients = mutableListOf<String>()

    for (i in 1..5) {
        print("Введите ингредиент №$i: ")
        val input = readln()
        ingredients.add(input.lowercase())
    }

    val result = ingredients
        .toSet()
        .sorted()
        .joinToString(separator = ", ", postfix = ".")
        .replaceFirstChar { it.uppercase() }

    println(result)
}