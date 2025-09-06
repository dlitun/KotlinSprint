package lesson9_task5

fun main() {
    val ingredients = mutableListOf<String>()

    for (i in 1..5) {
        print("Введите ингредиент №$i: ")
        val input = readln()
        ingredients.add(input.lowercase())
    }

    val uniqueSorted = ingredients.toSet().sorted()

    val result = uniqueSorted.mapIndexed { index, item ->
        if (index == 0) item.replaceFirstChar { it.uppercase() } else item
    }.joinToString(", ", postfix = ".")

    println(result)
}