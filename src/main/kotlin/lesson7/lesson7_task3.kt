package lesson7_task3

fun main() {
    print("Введите число: ")
    val n = readLine()!!.toInt()

    for (i in 0..n step 2) {
        println(i)
    }
}