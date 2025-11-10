package lesson21_task3

class Player(val name: String, val currentHealth: Int, val maxHealth: Int)

fun Player.isHealthy(): Boolean {
    return this.currentHealth == this.maxHealth
}

fun main() {
    val player1 = Player("Alex", 100, 100)
    val player2 = Player("Bob", 75, 100)

    println("${player1.name} is healthy: ${player1.isHealthy()}")
    println("${player2.name} is healthy: ${player2.isHealthy()}")
}