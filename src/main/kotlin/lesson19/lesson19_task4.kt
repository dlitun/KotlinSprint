package lesson19_task4

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank {
    private var currentAmmo: Ammo? = null

    fun load(ammo: Ammo) {
        currentAmmo = ammo
        println("Tank loaded with ${ammo.name} ammo.")
    }

    fun shoot() {
        if (currentAmmo == null) {
            println("No ammo loaded!")
        } else {
            println("Shot fired! Damage: ${currentAmmo!!.damage}")
        }
    }
}

fun main() {
    val tank = Tank()

    tank.shoot()
    tank.load(Ammo.BLUE)
    tank.shoot()
    tank.load(Ammo.GREEN)
    tank.shoot()
    tank.load(Ammo.RED)
    tank.shoot()
}