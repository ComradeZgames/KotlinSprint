package org.example.lesson_3

fun main() {
    var age = 20

    var surname = "Андреева"
    val name = "Татьяна"
    val patronymic = "Сергеевна"

    formatPrint(surname, name, patronymic, age)

    age = 22
    surname = "Сидорова"

    formatPrint(surname, name, patronymic, age)
}

private fun formatPrint(surname: String, name: String, patronymic: String, age: Int) {
    println("[$surname $name $patronymic, $age]")
}