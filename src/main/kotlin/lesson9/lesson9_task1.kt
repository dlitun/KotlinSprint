package lesson9_task1
fun main() {
    val ingredients = listOf("яйцо", "помидор", "зелень", "соль", "перец")
    println("В рецепте есть следующие ингредиенты: $ingredients")
    ingredients.forEach {
        println(it)
    }
}