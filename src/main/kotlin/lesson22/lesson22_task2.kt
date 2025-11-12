package lesson22_task2

class RegularBook2(
    val title: String,
    val author: String
)

data class DataBook2(
    val title: String,
    val author: String
)

fun main() {
    val regularBook = RegularBook2("The Hitchhiker's Guide to the Galaxy", "Douglas Adams")
    val dataBook = DataBook2("The Hitchhiker's Guide to the Galaxy", "Douglas Adams")

    println(regularBook)
    // Обычный класс не переопределяет toString(), поэтому выводит техническое представление объекта: имя класса + хэш-код в памяти.

    println(dataBook)
    // Data-класс автоматически создает понятный toString(), отображая имена и значения всех свойств.
}