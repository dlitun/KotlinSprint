package lesson5_task6

const val CONVERT_TO_METERS = 100.0
const val BMI_UNDERWEIGHT = 18.5
const val BMI_NORMAL = 25.0
const val BMI_OVERWEIGHT = 30.0

fun main() {
    println("Калькулятор индекса массы тела (ИМТ)")

    print("Введите ваш вес в килограммах: ")
    val weight = readln().toDouble()

    print("Введите ваш рост в сантиметрах: ")
    val heightCm = readln().toDouble()

    val heightM = heightCm / CONVERT_TO_METERS
    val bmi = weight / (heightM * heightM)

    val category = if (bmi < BMI_UNDERWEIGHT) {
        "Недостаточная масса тела"
    } else if (bmi < BMI_NORMAL) {
        "Нормальная масса тела"
    } else if (bmi < BMI_OVERWEIGHT) {
        "Избыточная масса тела"
    } else {
        "Ожирение"
    }

    val formattedBmi = String.format("%.2f", bmi)

    println("Ваш ИМТ: $formattedBmi")
    println("Категория: $category")
}