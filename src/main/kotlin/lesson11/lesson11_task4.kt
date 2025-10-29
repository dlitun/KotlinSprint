package lesson11_task4

class Category(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String,
)

class Ingredient(
    val name: String,
    val amount: String,
)

class Recipe(
    val id: Int,
    val title: String,
    val category: Category,
    val ingredients: List<Ingredient>,
    val steps: List<String>,
    val servings: Int = 1,
    val isFavorite: Boolean = false,
)

fun main() {
    val burgers = Category(1, "Burgers", "Popular burger types", "burgers.jpg")

    val recipe = Recipe(
        id = 1,
        title = "Mushroom and Cheese Burger",
        category = burgers,
        ingredients = listOf(
            Ingredient("Beef", "350 g"),
            Ingredient("Bun", "2 pcs"),
            Ingredient("Cheese", "2 slices"),
            Ingredient("Mushrooms", "100 g"),
        ),
        steps = listOf(
            "Fry the patty and mushrooms.",
            "Assemble the burger with bun and cheese.",
            "Serve hot."
        ),
        servings = 2
    )

    println("Recipe: ${recipe.title}")
    println("Category: ${recipe.category.title}")
    println("Ingredients:")
    recipe.ingredients.forEach { println("- ${it.name}: ${it.amount}") }
    println("Steps:")
    recipe.steps.forEachIndexed { i, step -> println("${i + 1}. $step") }
}