package lesson7_task3

fun main() {
    print("Введите число: ")
    val n = readln().toInt()

    for (i in 0..n step 2) {
        println(i)
    }
}