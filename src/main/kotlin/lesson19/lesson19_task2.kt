package lesson19_task2

enum class Category {
    CLOTHES,
    STATIONERY,
    OTHER;

    fun getCategoryName(): String {
        return when (this) {
            CLOTHES -> "Clothes"
            STATIONERY -> "Stationery"
            OTHER -> "Other"
        }
    }
}

class Product(
    val name: String,
    val id: Int,
    val category: Category
) {
    fun printInfo() {
        println("Product: $name | ID: $id | Category: ${category.getCategoryName()}")
    }
}

fun main() {
    val tShirt = Product("T-shirt", 101, Category.CLOTHES)
    val notebook = Product("Notebook", 102, Category.STATIONERY)
    val mug = Product("Mug", 103, Category.OTHER)

    tShirt.printInfo()
    notebook.printInfo()
    mug.printInfo()
}