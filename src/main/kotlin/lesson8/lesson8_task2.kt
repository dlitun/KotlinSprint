package lesson8_task2

fun main() {
    val ingredients = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")
    print("Введите ингредиент, который хотите найти: ")
    val search = readln()
    var found = false
    for (item in ingredients) {
        if (item == search) {
            println("Ингредиент \"$search\" в рецепте есть")
            found = true
            break
        }
    }

    if (!found) {
        println("Такого ингредиента в рецепте нет")
    }
}