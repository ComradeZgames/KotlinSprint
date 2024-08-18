package org.example.lesson_2

import kotlin.math.*

const val PROFIT_PERCENT = 16.7

fun main() {
    val startingSum = 70_000
    val targetPeriod = 20

    val result = startingSum * (1 + (PROFIT_PERCENT / 100)).pow(targetPeriod)
    println(String.format("%.03f", result))
}