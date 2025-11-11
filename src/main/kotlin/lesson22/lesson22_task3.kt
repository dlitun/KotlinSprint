package lesson22_task3

data class Movie(
    val title: String,
    val director: String,
    val year: Int
)

fun main() {
    val movie = Movie("The Hitchhiker's Guide to the Galaxy", "Garth Jennings", 2005)
    val (title, director, year) = movie

    println("Title: $title")
    println("Director: $director")
    println("Year: $year")
}