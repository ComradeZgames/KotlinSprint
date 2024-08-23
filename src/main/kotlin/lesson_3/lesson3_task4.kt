package org.example.lesson_3

fun main() {
    var start = "E2"
    var finish = "E4"
    var numberOfMove = 1

    formatPrint(start, finish, numberOfMove)

    start = "D2"
    finish = start.get(0) + ((start.get(1).digitToInt() + 1).toString())
    numberOfMove++

    formatPrint(start, finish, numberOfMove)
}

private fun formatPrint(start: String, finish: String, numberOfMove: Int) {
    println("[$start-$finish;$numberOfMove]")
}