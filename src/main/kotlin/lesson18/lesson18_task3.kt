package lesson18_task3

open class Animal(val name: String) {
    open fun eat() {}
    open fun sleep() {
        println("$name -> sleeping")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> eating berries")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> eating bones")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> eating fish")
    }
}

fun main() {
    val animals: List<Animal> = listOf(
        Fox("Fiona"),
        Dog("Buddy"),
        Cat("Misty")
    )

    animals.forEach { it.eat() }
}