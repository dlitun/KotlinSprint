package lesson16_task4

class Order(private val orderNumber: Int, private var status: String) {

    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun requestStatusChange(newStatus: String) {
        println("Sending a request to the manager to change the status...")
        changeStatus(newStatus)
        println("Status successfully changed.")
    }

    fun printInfo() {
        println("Order number: $orderNumber, status: $status")
    }
}

fun main() {
    val order = Order(1001, "Processing")

    order.printInfo()
    order.requestStatusChange("Shipped")
    order.printInfo()
}