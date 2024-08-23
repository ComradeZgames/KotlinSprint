package org.example.lesson_5

fun main() {
    val winningNumbers = List(3) { (0..42).random() }

    println("Введите три числа от 0 до 42:")
    val userNumbers = List(3) { readln().toInt() }

    val matchedNumbers = userNumbers.intersect(winningNumbers)
    val matchCount = matchedNumbers.size

    when (matchCount) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Отлично! Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз.")
        else -> println("К сожалению, вы не угадали ни одного числа.")
    }

    println("Выигрышные числа: $winningNumbers")
}
