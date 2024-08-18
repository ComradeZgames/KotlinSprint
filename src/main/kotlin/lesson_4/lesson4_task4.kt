package org.example.lesson_4

fun main() {
    var trainingDay = 1
    val armExercises = (trainingDay % 2 != 0)
    val legExercises = (trainingDay % 2 == 0)
    val backExercises = (trainingDay % 2 == 0)
    val abdominalExercises = (trainingDay % 2 != 0)

    println("""
        Упражнения для рук:    $armExercises
        Упражнения для ног:    $legExercises
        Упражнения для спины:  $backExercises
        Упражнения для пресса: $abdominalExercises
    """.trimIndent())
}