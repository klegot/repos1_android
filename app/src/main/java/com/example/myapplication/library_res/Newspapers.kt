package com.example.myapplication.library_res

class Newspapers(
    Id: Int,
    isAvailable: Boolean,
    name: String,
    val number: Int?,
    val month: String,
) : Library(Id, isAvailable, name) {
    override fun kratko(): String {
        var danet: String = if (isAvailable) "Да" else "Нет"
        return "$name доступна: $danet"
    }
    override fun podrobno(): String {
        var danet: String = if (isAvailable) "Да" else "Нет"
        return "выпуск: $number месяца: $month газеты $name с id: $Id достуен: $danet"
    }
}