package org.example.lesson_4

fun main() {
    val trainingDay = 1
    val isOddDay = (trainingDay % 2 != 0)

    println("""
        Упражнения для рук:    $isOddDay
        Упражнения для ног:    ${!isOddDay}
        Упражнения для спины:  ${!isOddDay}
        Упражнения для пресса: $isOddDay
    """.trimIndent())
}