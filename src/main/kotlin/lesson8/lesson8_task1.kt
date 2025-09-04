package lesson8_task1

fun main() {
    val viewsPerDay = arrayOf(42, 77, 122, 111, 45, 156, 131)
    var totalViews = 0
    for (views in viewsPerDay) {
        totalViews += views
    }
    println("Всего просмотров за неделю: $totalViews")
}