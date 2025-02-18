package com.example.myapplication

class BookShop : Shop {
    override fun sell(): Library {
        println("введите название книги:")
        val name = readln()
        println("введите автора книги:")
        val author = readln()
        println("введите количество страниц:")
        val pages = readlnOrNull()?.toIntOrNull()
        var addbook = Books(10, true, name, pages, author)
        arrBooks += addbook
        return addbook
    }
}