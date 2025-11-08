package lesson20_task2

class Player(val name: String, var currentHealth: Int, val maxHealth: Int)

fun main() {
    val healPotion: (Player) -> Unit = { player: Player ->
        player.currentHealth = player.maxHealth
        println("${player.name} is fully healed! Health: ${player.currentHealth}/${player.maxHealth}")
    }

    val player = Player("Dmitry", 40, 100)
    healPotion(player)
}