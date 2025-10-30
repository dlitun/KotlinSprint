package lesson11_task4

class Category(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String,
    val recipes: List<Recipe> = emptyList(),
)

class Ingredient(
    val name: String,
    val quantity: String,
    val unitOfMeasure: String,
)

class Recipe(
    val id: Int,
    val title: String,
    val imageUrl: String,
    val categoryId: Int,
    val ingredients: List<Ingredient>,
    val steps: List<String>,
    val servings: Int = 1,
    val isFavorite: Boolean = false,
)