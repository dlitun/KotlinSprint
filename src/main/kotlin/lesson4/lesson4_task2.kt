package lesson4_task2

fun main() {
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100

    println("Груз с весом 20 кг и объемом 80 л соответствует категории 'Average': ${20 > minWeight && 20 <= maxWeight && 80 < maxVolume}")
    println("Груз с весом 50 кг и объемом 100 л соответствует категории 'Average': ${50 > minWeight && 50 <= maxWeight && 100 < maxVolume}")
}