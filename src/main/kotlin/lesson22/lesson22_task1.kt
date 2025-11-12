package lesson22_task1

class RegularBook(
    val title: String,
    val author: String
)

data class DataBook(
    val title: String,
    val author: String
)

fun main() {
    val regularBook1 = RegularBook("The Hitchhiker's Guide to the Galaxy", "Douglas Adams")
    val regularBook2 = RegularBook("The Hitchhiker's Guide to the Galaxy", "Douglas Adams")

    val dataBook1 = DataBook("The Hitchhiker's Guide to the Galaxy", "Douglas Adams")
    val dataBook2 = DataBook("The Hitchhiker's Guide to the Galaxy", "Douglas Adams")

    println(regularBook1 == regularBook2)
    // false - хотя книги выглядят одинаково, это два разных объекта в памяти

    println(dataBook1 == dataBook2)
    // true - у дата-классов сравниваются значения свойств, а не место в памяти
}