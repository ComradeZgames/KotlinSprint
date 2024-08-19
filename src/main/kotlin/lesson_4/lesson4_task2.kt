package org.example.lesson_4

fun main() {
    val weightMin = 35
    val weightMax = 100
    val volumeMax = 100

    val weightFirst = 20
    val volumeFirst = 80

    val weightSecond = 50
    val volumeSecond = 100

    println(
        "Груз с весом $weightFirst кг и объемом $volumeFirst л соответствует категории \'Average\': " +
                "${(weightFirst > weightMin) && (weightFirst <= weightMax) && (volumeFirst < volumeMax)}"
    )

    println(
        "Груз с весом $weightSecond кг и объемом $volumeSecond л соответствует категории \'Average\': " +
                "${(weightSecond > weightMin) && (weightSecond <= weightMax) && (volumeSecond < volumeMax)}"
    )
}