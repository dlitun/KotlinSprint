package lesson7_task4

fun main() {
    print("Введите количество секунд: ")
    val seconds = readln().toInt()

    for (i in seconds downTo 1) {
        println("Осталось $i секунд(ы)")
        Thread.sleep(1000)
    }

    println("Время вышло")
}