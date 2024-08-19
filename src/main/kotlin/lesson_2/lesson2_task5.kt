package org.example.lesson_2

import kotlin.math.*

fun main() {
    val profitPercent = 16.7
    val startingSum = 70_000
    val targetPeriod = 20

    val result = startingSum * (1 + (profitPercent / 100)).pow(targetPeriod)
    println(String.format("%.03f", result))
}