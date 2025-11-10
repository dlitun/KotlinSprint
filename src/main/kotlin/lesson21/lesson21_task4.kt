package lesson21_task4

import java.io.File

fun File.prependWord(word: String) {
    val oldContent = if (exists()) readText() else ""
    writeText(word.lowercase() + "\n" + oldContent)
}