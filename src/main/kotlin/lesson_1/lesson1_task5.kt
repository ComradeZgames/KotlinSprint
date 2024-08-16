package org.example.lesson_1

fun main() {
    var seconds: Int = 6480
    var hours: Int
    var minutes: Int

    minutes = seconds / 60
    seconds %= 60
    hours = minutes / 60
    minutes %= 60

    println("0$hours:$minutes:0$seconds")
}
