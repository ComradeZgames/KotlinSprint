package org.example.lesson_5

const val AGE_TOLERANCE = 18
const val CURRENT_YEAR = 2024

fun main() {
    print("Введите год вашего рождения: ")
    val userAge = (CURRENT_YEAR - readln().toInt())

    if (userAge >= AGE_TOLERANCE)
        println("Показать экран со скрытым контентом")
    else println("Доступ запрещен.")
}