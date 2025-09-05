package lesson8_task4
fun main() {
    val ingredients = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")

    println("Список ингредиентов:")
    for (item in ingredients) {
        println(item)
    }

    print("Введите ингредиент, который хотите заменить: ")
    val toReplace = readln()

    val index = ingredients.indexOf(toReplace)

    if (index == -1) {
        println("Такого ингредиента в рецепте нет")
    } else {
        print("Введите новый ингредиент: ")
        val newIngredient = readln()
        ingredients[index] = newIngredient

        println("Готово! Вы сохранили следующий список:")
        for (item in ingredients) {
            println(item)
        }
    }
}