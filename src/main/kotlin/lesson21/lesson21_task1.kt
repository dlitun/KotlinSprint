package lesson21_task1

fun String.vowelCount(): Int {
    val vowels = "aeiouAEIOU"
    return this.count { it in vowels }
}

fun main() {
    val text = "hello"
    println(text.vowelCount())
}