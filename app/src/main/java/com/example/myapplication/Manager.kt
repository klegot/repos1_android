package com.example.myapplication

class Manager {
    fun buy(shop: Shop): Library {
        val item = shop.sell()
        println("вы купили: ${item.name}")
        return item
    }
}
