package com.example.myapplication

class Digital {
    fun digit(item: Library): Disk? {
        if (item is Books) {
            println("oцифрована книга ${item.name}")
            arrDisks += Disk(11, true, "${item.name}_оцифровка", "CD")
            return Disk(11, true, "${item.name}_оцифровка", "CD")
        }
        if (item is Newspapers) {
            println("оцифрована газета ${item.name}")
            arrDisks += Disk(11, true, "${item.name}_оцифровка", "CD")
            return Disk(11, true, "${item.name}_оцифровка", "CD")
        }
        else{
            return null
        }
    }
}