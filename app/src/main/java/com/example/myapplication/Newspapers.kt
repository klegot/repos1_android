package com.example.myapplication

class Newspapers(
    Id: Int,
    dostup: Boolean,
    name: String,
    val number: Int?,
    val month: String,
) : Library(Id, dostup, name) {
    override fun kratko(): String {
        var danet: String = if (dostup) "Да" else "Нет"
        return "$name доступна: $danet"
    }
    override fun podrobno(): String {
        var danet: String = if (dostup) "Да" else "Нет"
        return "выпуск: $number месяца: $month газеты $name с id: $Id достуен: $danet"
    }
}