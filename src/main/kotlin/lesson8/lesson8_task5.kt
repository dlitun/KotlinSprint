package lesson8_task5
fun main() {
    print("Сколько ингредиентов вы хотите добавить? ")
    val count = readln().toInt()

    val ingredients = Array(count) { "" }

    for (i in 0 until count) {
        print("Введите ингредиент ${i + 1}: ")
        ingredients[i] = readln()
    }

    println("Ваш список ингредиентов:")
    for (item in ingredients) {
        print("$item, ")
    }
}