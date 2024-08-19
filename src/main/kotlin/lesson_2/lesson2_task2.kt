package org.example.lesson_2

fun main() {
    val employeesCount = 50
    val internsCount = 30

    val employeesSalary = 30000
    val internsSalary = 20000

    val mainCost: Int = employeesSalary * employeesCount
    val totalCost: Int = mainCost + (internsSalary * internsCount)
    val avgSalary: Int = totalCost / (employeesCount + internsCount)

    println("Main cost: $mainCost\nTotal cost: $totalCost\nAVG: $avgSalary")
}