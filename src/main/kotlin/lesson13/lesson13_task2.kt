package lesson13_task2

class ContactV2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printInfo() {
        println("Name: $name, Phone: $phoneNumber, Company: ${company ?: "<not specified>"}")
    }
}

fun main() {
    val contact = ContactV2("Rostislav", 89123456789)
    contact.printInfo()
}