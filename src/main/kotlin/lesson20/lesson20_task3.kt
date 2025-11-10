package lesson20_task3

class Player(val name: String, val hasKey: Boolean)

fun main() {
    val checkDoor: (Player) -> String = { player: Player ->
        if (player.hasKey) "Player opened the door" else "The door is locked"
    }

    val playerWithKey = Player("Emikman", true)
    val playerWithoutKey = Player("Alex", false)

    println(checkDoor(playerWithKey))
    println(checkDoor(playerWithoutKey))
}