package org.example.lesson_1

const val COUNT_OF_PARTS = 60

fun main() {
    var seconds: Int = 6480
    var hours: Int
    var minutes: Int

    minutes = seconds / COUNT_OF_PARTS
    seconds %= COUNT_OF_PARTS
    hours = minutes / COUNT_OF_PARTS
    minutes %= COUNT_OF_PARTS

    print(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}
