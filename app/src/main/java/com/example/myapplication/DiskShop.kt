package com.example.myapplication

class DiskShop : Shop {
    override fun sell(): Library {
        println("введите название диска:")
        val name = readln()
        println("введите тип диска:")
        val type = readln()
        var adddisk = Disk(10, true, name, type)
        arrDisks += adddisk
        return adddisk
    }
}