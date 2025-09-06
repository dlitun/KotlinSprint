package lesson9_task2
fun main() {
    val ingredients = mutableListOf("яйцо", "помидор", "соль")

    println("В рецепте есть базовые ингредиенты: $ingredients")

    print("Желаете добавить еще? ")
    val answer = readln().lowercase()

    if (answer == "да") {
        print("Какой ингредиент вы хотите добавить? ")
        val newIngredient = readln()
        ingredients.add(newIngredient)

        println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
    } else {
        println("Программа завершена.")
    }
}