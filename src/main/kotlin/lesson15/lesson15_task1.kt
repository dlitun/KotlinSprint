package lesson15_task1

interface Flying {
    fun fly()
}

interface Swimming {
    fun swim()
}

class Seagull : Flying {
    override fun fly() {
        println("The seagull flies over the sea")
    }
}

class Crucian : Swimming {
    override fun swim() {
        println("The crucian swims in the pond")
    }
}

class Duck : Flying, Swimming {
    override fun fly() {
        println("The duck flies low over the ground")
    }

    override fun swim() {
        println("The duck swims on the surface of the lake")
    }
}

fun main() {
    val seagull = Seagull()
    val crucian = Crucian()
    val duck = Duck()

    println("How creatures move:\n")

    seagull.fly()
    crucian.swim()
    duck.fly()
    duck.swim()
}