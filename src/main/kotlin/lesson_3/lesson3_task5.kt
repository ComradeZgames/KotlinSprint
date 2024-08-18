package org.example.lesson_3

fun main() {
    val move = "D2-D4;0"
    val splitedList = move.split("-", ";")

    val start: String = splitedList[0]
    val finish: String = splitedList[1]
    val numberOfMove: Int = splitedList[2].toInt()

    println("""
        Start = $start
        Finish = $finish
        Number of move = $numberOfMove
    """.trimIndent())
}