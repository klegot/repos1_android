package com.example.myapplication

class Disk(
    Id: Int,
    dostup: Boolean,
    name: String,
    val type: String,
) : Library(Id, dostup, name) {
    override fun kratko(): String {
        var danet: String = if (dostup) "Да" else "Нет"
        return "$name доступен: $danet"
    }
    override fun podrobno(): String {
        var danet: String = if (dostup) "Да" else "Нет"
        return "$type $name доступен: $danet"
    }
}