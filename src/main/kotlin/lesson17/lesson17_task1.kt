package lesson17_task1

class QuizElement(
    question: String,
    answer: String
) {

    var question: String = question
        get() = field

    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val element = QuizElement("What is the capital of France?", "Paris")

    println("Question: ${element.question}")
    println("Answer: ${element.answer}")

    element.answer = "Paris (in French - Paris)"
    println("Updated answer: ${element.answer}")
}