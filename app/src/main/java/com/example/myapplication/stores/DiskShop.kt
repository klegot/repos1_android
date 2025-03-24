package com.example.myapplication.stores

import com.example.myapplication.library_res.Library
import com.example.myapplication.arrDisks
import com.example.myapplication.library_res.Disk

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