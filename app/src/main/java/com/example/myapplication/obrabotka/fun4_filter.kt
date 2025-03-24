package com.example.myapplication.obrabotka

import com.example.myapplication.library_res.Library

inline fun <reified Type : Library> fun4_filter(items: List<Library>): List<Type> {
    return items.filterIsInstance<Type>()
}