package com.example.myapplication.library_res

abstract class Library(
    val Id: Int,
    var isAvailable: Boolean,
    val name: String
) {
    abstract fun kratko(): String
    abstract fun podrobno(): String
}