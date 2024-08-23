package org.example.lesson_5

fun main() {
    val registeredUserName = "Zaphod"
    val registeredPassword = "PanGalactic"

    println("Марвин: [вздыхает...] Введите свое имя пользователя:")
    val userName = readln()

    if (userName == registeredUserName) {
        println("Марвин: [грустно] Введите свой пароль:")
        val password = readln()

        if (password == registeredPassword) {
            println("""
                Марвин: [вздыхает ещё глубже...] Ваши данные проверены, и о, чудо, они верны... 
                Пользователь "$registeredUserName", вам разрешено входить на борт корабля "Heart of Gold". 
                Хотя мне всё равно... Ну вперед, войдите... 
                Если вам так уж надо, в конце концов... [меланхолический вздох...] 
                Надеюсь, вам понравится пребывание здесь больше, чем мне.
            """.trimIndent())
        } else {
            println("Марвин: [вздыхает...] Неверный пароль... Попробуйте снова позже или зарегистрируйтесь.")
        }
    } else {
        println("""
            Марвин: [вздыхает...] Кажется, вас нет в моей базе данных...
            Что ж, вам придётся зарегистрироваться. [вздыхает...] Ну, удачи...
        """.trimIndent())
    }
}
