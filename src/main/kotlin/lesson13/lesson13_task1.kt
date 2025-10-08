package lesson13_task1

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String?
) {
    fun printInfo() {
        println("Name: $name")
        println("Phone: $phoneNumber")
        println("Company: ${company ?: "Company not specified"}")
    }
}

fun main() {
    val contact1 = Contact("Ivan", 89991234567, null)
    val contact2 = Contact("Maria", 89997654321, "TechCorp")

    contact1.printInfo()
    println()
    contact2.printInfo()
}