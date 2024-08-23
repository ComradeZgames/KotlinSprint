package org.example.lesson_4

const val SUNNY_WEATHER = true
const val OUTDOOR_AWNING = true
const val AIR_MOISTURE = 20
const val UNFAVORABLE_SEASON = "winter"

fun main() {
    val sunnyWeather = true
    val outdoorAwning = true
    val airMoisture = 20
    val season = "winter"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${sunnyWeather == SUNNY_WEATHER && outdoorAwning == OUTDOOR_AWNING && (airMoisture == AIR_MOISTURE) && (season != UNFAVORABLE_SEASON)}"
    )
}