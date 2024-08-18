package org.example.lesson_4

fun main() {
    print("Укажите наличие повреждений корпуса (true/false): ")
    val damaged: Boolean = readln().toBoolean()

    print("Введите количество членов экипажа: ")
    val crewCount: Int = readln().toInt()

    print("Ввежите количество ящиков с провизией: ")
    val boxCount: Int = readln().toInt()

    print("Укажите благоприятны ли погодные условия? (true/false)")
    val favorableWeather: Boolean = readln().toBoolean()

    val allowedToSail = (!damaged && (crewCount in 55..70) && (boxCount > 50)) ||
            ((crewCount == 70) && (boxCount >= 50) && favorableWeather)

    /*хотел сделать так, но узнал что тернарного оператора в котлине нет,
    "println(allowedToSail? "Корабль может отправиться в плавание" : "Корабль не может отправиться в плавание")"
    поэтому для красивого вывода, я сделал следующее*/

    println(
        if (allowedToSail) "Корабль может отправиться в плавание"
        else "Корабль не может отправиться в плавание"
    )
}