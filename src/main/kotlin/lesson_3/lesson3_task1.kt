package org.example.lesson_3

fun main() {
    print("Enter your name: ")
    val name = readLine()

    var greeting = "Good day"
    println("${greeting}, ${name}!")

    greeting = "Good evening"
    println("${greeting}, ${name}!")
}