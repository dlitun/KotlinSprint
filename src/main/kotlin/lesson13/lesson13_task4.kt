package lesson13_task4

class ContactV4(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printInfo() {
        println("Name: $name, Phone: $phoneNumber, Company: ${company ?: "<not specified>"}")
    }
}

fun main() {
    val contacts = mutableListOf<ContactV4>()

    for (i in 1..3) {
        println("Enter name:")
        val name = readLine() ?: continue

        println("Enter phone number:")
        val phoneInput = readLine()
        val phoneNumber = phoneInput?.toLongOrNull()

        if (phoneNumber == null) {
            println("Invalid phone number input. Contact was not added.")
            continue
        }

        println("Enter company (optional):")
        val companyInput = readLine()
        val company = if (companyInput.isNullOrBlank()) null else companyInput

        val contact = ContactV4(name, phoneNumber, company)
        contacts.add(contact)
        println("Contact successfully added.\n")
    }

    println("Phonebook:")
    for (contact in contacts) {
        contact.printInfo()
    }
}