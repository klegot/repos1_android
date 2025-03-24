package com.example.myapplication.stores

import com.example.myapplication.library_res.Library
import com.example.myapplication.arrPapers
import com.example.myapplication.library_res.Newspapers

class NewspaperShop : Shop {
    override fun sell(): Library {
        println("введите название газеты:")
        val name = readln()
        println("введите месяц выпуска:")
        val month = readln()
        println("введите номер выпуска:")
        val number = readlnOrNull()?.toIntOrNull()
        var addnewspaper = Newspapers(10, true, name, number, month)
        arrPapers += addnewspaper
        return addnewspaper
    }
}