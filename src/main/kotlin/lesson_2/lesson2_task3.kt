package org.example.lesson_2

const val COUNT_OF_PARTS = 60

fun main() {
    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val travelTime = 457

    var minuteOfArrival = (travelTime % COUNT_OF_PARTS) + minuteOfDeparture
    var hourOfArrival = hourOfDeparture + (travelTime / COUNT_OF_PARTS)

    if (minuteOfArrival > COUNT_OF_PARTS) {
        minuteOfArrival -= COUNT_OF_PARTS
        hourOfArrival++
    }

    println(String.format("%02d:%02d", hourOfArrival, minuteOfArrival))
}