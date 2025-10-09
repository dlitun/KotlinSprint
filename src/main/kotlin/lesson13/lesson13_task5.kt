package lesson13_task5

class ContactV5(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printInfo() {
        println("Name: $name, Phone: $phoneNumber, Company: ${company ?: "<not specified>"}")
    }
}

fun main() {
    println("Enter name:")
    val name = readLine() ?: "Unknown"

    println("Enter phone number:")
    val phoneInput = readLine() ?: ""

    try {
        val phoneNumber = phoneInput.toLong()
        val contact = ContactV5(name, phoneNumber)
        println("Contact created successfully:")
        contact.printInfo()
    } catch (e: Exception) {
        println("Error occurred: ${e::class.simpleName}")
    }
}