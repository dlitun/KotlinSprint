package lesson6_task2

const val ONE_SECOND_MS = 1000L

fun main() {
    print("Введите количество секунд: ")
    val seconds = readLine()!!.toInt()
    var counter = seconds

    while (counter > 0) {
        Thread.sleep(ONE_SECOND_MS)
        counter--
    }

    println("Прошло $seconds секунд")
}