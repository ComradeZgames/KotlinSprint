package org.example.lesson_4

const val COUNT_OF_TABLES = 13

fun main() {
    val reservedToday = 13
    val reservedTomorrow = 9

    println("Доступность столиков на сегодня: ${reservedToday < COUNT_OF_TABLES}")
    println("Доступность столиков на завтра: ${reservedTomorrow < COUNT_OF_TABLES}")
}