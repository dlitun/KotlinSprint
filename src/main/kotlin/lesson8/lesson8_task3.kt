package lesson8_task3

fun main() {
    val ingredients = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")

    print("Введите ингредиент, который хотите найти: ")
    val search = readln()

    if (search in ingredients) {
        println("Ингредиент \"$search\" в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}