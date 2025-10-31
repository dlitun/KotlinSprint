package lesson19_task1

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH
}

fun main() {
    println("You can add the following fish to your aquarium:")
    for (fish in Fish.values()) {
        println("- ${fish.name}")
    }
}