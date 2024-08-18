package org.example.lesson_4

fun main() {
    val sunnyWeather = true
    val outdoorAwning = true
    val airMoisture = 20
    val season = "winter"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${sunnyWeather && outdoorAwning && (airMoisture == 20) && (season != "winter")}"
    )
}