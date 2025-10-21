package lesson16_task5

class Player(private val name: String, private var health: Int, private var attackPower: Int) {

    private var isDead = false

    fun takeDamage(damage: Int) {
        if (isDead) {
            println("$name is already dead and cannot take more damage.")
            return
        }

        health -= damage
        println("$name takes $damage damage. Health: $health")

        if (health <= 0) {
            die()
        }
    }

    fun heal(amount: Int) {
        if (isDead) {
            println("$name cannot be healed — already dead.")
            return
        }

        health += amount
        println("$name heals for $amount points. Health: $health")
    }

    private fun die() {
        isDead = true
        health = 0
        attackPower = 0
        println("$name has died. Attack power and health are now zero.")
    }

    fun printStatus() {
        println("Player: $name | Health: $health | Attack power: $attackPower | Dead: $isDead")
    }
}

fun main() {
    val player = Player("Hero", 50, 10)

    player.printStatus()
    player.takeDamage(20)
    player.heal(10)
    player.takeDamage(40)
    player.heal(5)
    player.printStatus()
}
