package lesson13_task3

class ContactV3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
)

fun main() {
    val contacts = listOf(
        ContactV3("Ivan", 89123456780, "VK"),
        ContactV3("Maria", 89990001122, null),
        ContactV3("Rostislav", 89553336644, "null"),
        ContactV3("Anna", 89998887766, "Google"),
        ContactV3("Oleg", 89887775544, null)
    )

    val companies = contacts.map { it.company }.filterNotNull()

    println("Company list: $companies")
}