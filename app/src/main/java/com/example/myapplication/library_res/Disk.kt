package com.example.myapplication.library_res

class Disk(
    Id: Int,
    isAvailable: Boolean,
    name: String,
    val type: String,
) : Library(Id, isAvailable, name) {
    override fun kratko(): String {
        var danet: String = if (isAvailable) "Да" else "Нет"
        return "$name доступен: $danet"
    }
    override fun podrobno(): String {
        var danet: String = if (isAvailable) "Да" else "Нет"
        return "$type $name доступен: $danet"
    }
}