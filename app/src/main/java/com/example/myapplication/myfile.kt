package com.example.myapplication

val book1 = Books(1, true, "книга1", 350, "автор1")
val book2 = Books(2, false, "книга2", 350, "автор2")
val book3 = Books(3, true, "книга3", 350, "автор3")

val newspaper1 = Newspapers(4, false, "газета1", 102, "апрель")
val newspaper2 = Newspapers(5, true, "газета2", 102, "март")
val newspaper3 = Newspapers(6, false, "газета2", 102, "июнь")

val disk1 = Disk(7, true, "диск1", "DVD")
val disk2 = Disk(8, false, "диск2", "CD")
val disk3 = Disk(9, true, "диск3", "DVD")

val spisok_vsego: List<Library> = listOf(book1, book2, book3, newspaper1, newspaper2, newspaper3, disk1, disk2, disk3)
var arrBooks = fun4_filter<Books>(spisok_vsego)
var arrPapers = fun4_filter<Newspapers>(spisok_vsego)
var arrDisks = fun4_filter<Disk>(spisok_vsego)

inline fun <reified Type : Library> fun4_filter(items: List<Library>): List<Type> {
    return items.filterIsInstance<Type>()
}

fun main()
{
    while (true){
        println("1. Показать книги\n2. Показать газеты\n3. Показать диски\n4. Менеджер\n5. выйти из программы")
        when(readlnOrNull()?.toIntOrNull()){
            1 -> {
                var n: Int = 1
                for (elem in arrBooks){
                    println("$n) " + elem.kratko())
                    n+=1
                }
                println()
                println("выберите номер объекта или вернитесь, выбрав 0")
                var choice = readlnOrNull()?.toIntOrNull()
                if (choice == 0 || choice == null) continue else action(arrBooks[choice - 1])
            }
            2 -> {
                var n: Int = 1
                for (elem in arrPapers){
                    println("$n) " + elem.kratko())
                    n+=1
                }
                println()
                println("выберите номер объекта или вернитесь, выбрав 0")
                var choice = readlnOrNull()?.toIntOrNull()
                if (choice == 0 || choice == null) continue else action(arrPapers[choice - 1])
            }
            3 -> {
                var n: Int = 1
                for (elem in arrDisks){
                    println("$n) " + elem.kratko())
                    n+=1
                }
                println()
                println("выберите номер объекта или вернитесь, выбрав 0")
                var choice = readlnOrNull()?.toIntOrNull()
                if (choice == 0 || choice == null) continue else action(arrDisks[choice - 1])
            }
            4 -> {
                println("меню менеджера:")
                println("1. купить книгу")
                println("2. купить газету")
                println("3. купить диск")
                println("0. вернуться назад")

                val manager = Manager()

                when (readlnOrNull()?.toIntOrNull()) {
                    1 -> {
                        val book_shop = BookShop()
                        manager.buy(book_shop)
                    }
                    2 -> {
                        val newspaper_shop = NewspaperShop()
                        manager.buy(newspaper_shop)
                    }
                    3 -> {
                        val disk_shop = DiskShop()
                        manager.buy(disk_shop)
                    }
                    0 -> {
                        continue
                    }
                    else -> println("Неверный выбор, попробуйте еще")
                }
            }
            5 -> {
                break
            }
            else -> {
                println("неверный выбор, попробуйте еще")
            }
        }
    }
}

abstract class Library(
    val Id: Int,
    var dostup: Boolean,
    val name: String
) {
    abstract fun kratko(): String
    abstract fun podrobno(): String
}

fun action(item: Library) {
    while (true) {
        println("\nВыберите действие для ${item.name}:")
        println("1. Взять домой")
        println("2. Читать в читальном зале")
        println("3. Показать подробную информацию")
        println("4. Вернуть")
        println("5. Оцифровать на cd диск")
        println("0. Назад")

        when (readlnOrNull()?.toIntOrNull()) {
            1 -> {
                if (item.dostup) println("${item.name} ${item.Id} взяли домой") else println("объект недоступен")
                item.dostup = false
                return
            }
            2 -> {
                if (item.dostup) println("${item.name} ${item.Id} взяли в читальный зал") else println("объект недоступен")
                item.dostup = false
                return
            }
            3 -> {
                println("подробная информация о ${item.name}:")
                println(item.podrobno())
            }
            4 -> {
                if (item.dostup) println("${item.name} и так доступен") else println("вернули ${item.name} ${item.Id}")
                item.dostup = true
                return
            }
            5 -> {
                if (item is Disk) {
                    println("диск нельзя оцифровать (книгу или газету можно)")
                    return
                }
                else {
                    val ocifrovka_obj = Digital()
                    ocifrovka_obj.digit(item)
                    return
                }
            }
            0 -> return
            else -> println("неверный выбор, попробуйте еще")
        }
    }
}

interface Shop {
    fun sell(): Library
}