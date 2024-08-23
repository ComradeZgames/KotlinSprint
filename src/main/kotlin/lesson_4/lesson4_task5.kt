package org.example.lesson_4

const val DAMAGED = false
const val CREW_COUNT_MAX = 70
const val CREW_COUNT_MIN = 55
const val BOX_COUNT_MIN = 50
const val FAVORABLE_WEATHER = true

fun main() {
    print("Укажите наличие повреждений корпуса (true/false): ")
    val damaged: Boolean = readln().toBoolean()

    print("Введите количество членов экипажа: ")
    val crewCount: Int = readln().toInt()

    print("Ввежите количество ящиков с провизией: ")
    val boxCount: Int = readln().toInt()

    print("Укажите благоприятны ли погодные условия? (true/false)")
    val favorableWeather: Boolean = readln().toBoolean()

    val allowedToSail =
        (damaged == DAMAGED && (crewCount in CREW_COUNT_MIN..CREW_COUNT_MAX) && (boxCount > BOX_COUNT_MIN)) ||
            ((crewCount == CREW_COUNT_MAX) && (boxCount >= BOX_COUNT_MIN) && favorableWeather == FAVORABLE_WEATHER)

    println(
        if (allowedToSail) "Корабль может отправиться в плавание"
        else "Корабль не может отправиться в плавание"
    )
}