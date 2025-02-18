package com.example.myapplication

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