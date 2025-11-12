package lesson21_task5

fun Map<String, Int>.maxCategory(): String? {
    return this.maxByOrNull { it.value }?.key
}

fun main() {
    val skills = mapOf(
        "strength" to 80,
        "agility" to 95,
        "intelligence" to 70
    )

    println(skills.maxCategory())
}