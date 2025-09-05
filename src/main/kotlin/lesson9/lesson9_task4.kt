package lesson9_task4

fun main() {
    print("Введите 5 ингредиентов через запятую с пробелом: ")
    val input = readln()

    val ingredients = input.split(", ")

    val sortedIngredients = ingredients.sorted()

    println("Ингредиенты по алфавиту: $sortedIngredients")
}