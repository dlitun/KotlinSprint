package lesson6_task3

const val ONE_SECOND_MS = 1000L

fun main() {
    print("Введите количество секунд: ")
    var counter = readLine()!!.toInt()

    while (counter > 0) {
        println("Осталось секунд: $counter")
        Thread.sleep(ONE_SECOND_MS)
        counter--
    }

    println("Время вышло")
}