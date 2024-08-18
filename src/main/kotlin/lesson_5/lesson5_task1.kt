package org.example.lesson_5

fun main() {
    val firstNumber = (0..100).random()
    val secondNumber = (0..100).random()

    println("Введите ответ на данное выражение: $firstNumber + $secondNumber")

    if (readln().toInt() == (firstNumber + secondNumber))
        println("Добро пожаловать!")
    else println("Доступ запрещен.")
}