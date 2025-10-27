package lesson18_task1

class Order(private val orderNumber: Int) {

    fun printOrderInfo(product: String) {
        println("Order #$orderNumber")
        println("Ordered product: $product\n")
    }

    fun printOrderInfo(products: List<String>) {
        println("Order #$orderNumber")
        println("Ordered products: ${products.joinToString(", ")}\n")
    }
}

fun main() {
    val order1 = Order(101)
    val order2 = Order(102)

    order1.printOrderInfo("Smartphone")
    order2.printOrderInfo(listOf("Laptop", "Mouse", "Keyboard"))
}