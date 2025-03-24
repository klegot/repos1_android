package com.example.myapplication.library_res

class Books(
    Id: Int,
    isAvailable: Boolean,
    name: String,
    val pages: Int?,
    val author: String,
) : Library(Id, isAvailable, name) {
    override fun kratko(): String {
        var danet: String = if (isAvailable) "Да" else "Нет"
        return "$name доступна: $danet"
    }
    override fun podrobno(): String {
        var danet: String = if (isAvailable) "Да" else "Нет"
        return "книга: $name ($pages стр.) автора: $author с id:$Id доступна: $danet"
    }
}