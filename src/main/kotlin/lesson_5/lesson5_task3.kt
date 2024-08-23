package org.example.lesson_5

fun main() {
    val firstNumber = (0..42).random()
    val secondNumber = (0..42).random()

    println("Введите первое число (от 0 до 42):")
    val firstUserNumber: Int = readln().toInt()

    println("Введите второе число (от 0 до 42):")
    val secondUserNumber: Int = readln().toInt()

    val isFirstNumberGuessed = (firstUserNumber == firstNumber || firstUserNumber == secondNumber)
    val isSecondNumberGuessed = (secondUserNumber == firstNumber || secondUserNumber == secondNumber)

    if (isFirstNumberGuessed && isSecondNumberGuessed) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (isFirstNumberGuessed || isSecondNumberGuessed) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Правильные числа: $firstNumber и $secondNumber")
}