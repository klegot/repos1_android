package com.example.myapplication.library_res

import com.example.myapplication.arrDisks

class Digital {
    fun digit(item: Library): Disk? {
        return when (item) {
            is Books -> {
                println("oцифрована книга ${item.name}")
                arrDisks += Disk(11, true, "${item.name}_оцифровка", "CD")
                Disk(11, true, "${item.name}_оцифровка", "CD")
            }

            is Newspapers -> {
                println("оцифрована газета ${item.name}")
                arrDisks += Disk(11, true, "${item.name}_оцифровка", "CD")
                Disk(11, true, "${item.name}_оцифровка", "CD")
            }

            else -> {
                return null
            }
        }
    }
}