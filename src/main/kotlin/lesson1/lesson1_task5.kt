package lesson_5

const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60

fun main() {
    val totalSeconds = 6480

    val hours = totalSeconds / SECONDS_IN_HOUR
    val remainingSeconds = totalSeconds % SECONDS_IN_HOUR
    val minutes = remainingSeconds / SECONDS_IN_MINUTE
    val seconds = remainingSeconds % SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}