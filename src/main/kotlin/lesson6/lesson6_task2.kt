package lesson6_task2

const val ONE_SECOND_MS = 1000L

fun main() {
    print("Введите количество секунд: ")
    val seconds = readln().toInt()

    Thread.sleep(seconds * ONE_SECOND_MS)

    println("Прошло $seconds секунд")
}