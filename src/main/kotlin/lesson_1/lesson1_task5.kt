package lesson_5

fun main() {
    // Общее количество секунд
    val totalSeconds = 6480

    // Считаем часы
    val hours = totalSeconds / 3600

    // Считаем оставшиеся секунды после часов
    val remainingSeconds = totalSeconds % 3600

    // Считаем минуты
    val minutes = remainingSeconds / 60

    // Считаем оставшиеся секунды после минут
    val seconds = remainingSeconds % 60

    println("$hours:$minutes:$seconds")
}