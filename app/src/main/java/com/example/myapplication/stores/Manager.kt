package com.example.myapplication.stores

import com.example.myapplication.library_res.Library

class Manager {
    fun buy(shop: Shop): Library {
        val item = shop.sell()
        println("вы купили: ${item.name}")
        return item
    }
}
