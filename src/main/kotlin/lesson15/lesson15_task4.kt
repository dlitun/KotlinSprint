package lesson15_task4

open class Product(
    val name: String,
    var stock: Int
)

class Accessory(
    name: String,
    stock: Int,
    val compatibleWith: String
) : Product(name, stock)

interface AccessorySearch {
    fun searchAccessories(): List<Accessory>
}

class Instrument(
    name: String,
    stock: Int,
    val type: String,
    private val catalog: List<Accessory>
) : Product(name, stock), AccessorySearch {

    override fun searchAccessories(): List<Accessory> {
        println("Searching...")
        return catalog.filter { it.compatibleWith == type }
    }
}

fun main() {
    val accessories = listOf(
        Accessory("Guitar Strings .010", 25, "Guitar"),
        Accessory("Guitar Capo", 10, "Guitar"),
        Accessory("Drumsticks 5A", 40, "Drums"),
        Accessory("Violin Bow", 8, "Violin")
    )

    val guitar = Instrument("Acoustic Guitar", 5, "Guitar", accessories)
    val drums = Instrument("Drum Kit", 2, "Drums", accessories)

    val guitarAcc = guitar.searchAccessories()
    println("Accessories for ${guitar.name}:")
    guitarAcc.forEach { println("- ${it.name} (stock: ${it.stock})") }
    println()

    val drumAcc = drums.searchAccessories()
    println("Accessories for ${drums.name}:")
    drumAcc.forEach { println("- ${it.name} (stock: ${it.stock})") }
}