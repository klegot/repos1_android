package com.example.myapplication

class Books(
    Id: Int,
    dostup: Boolean,
    name: String,
    val pages: Int?,
    val author: String,
) : Library(Id, dostup, name) {
    override fun kratko(): String {
        var danet: String = if (dostup) "Да" else "Нет"
        return "$name доступна: $danet"
    }
    override fun podrobno(): String {
        var danet: String = if (dostup) "Да" else "Нет"
        return "книга: $name ($pages стр.) автора: $author с id:$Id доступна: $danet"
    }
}