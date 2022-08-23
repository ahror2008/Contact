package Main

import java.util.*
import Main.Contact as Contact1

fun main(args: Array<String>) {


    val scanner = Scanner(System.`in`)
    val contact = ContactClass()
    Thread.sleep(500)
    print("L")
    Thread.sleep(500)
    print("o")
    Thread.sleep(500)
    print("a")
    Thread.sleep(500)
    print("d")
    Thread.sleep(500)
    print("i")
    Thread.sleep(500)
    print("n")
    Thread.sleep(500)
    print("g")
    println()
    while (true) {
        println("1-> add")
        println("2-> delete")
        println("3-> list")
        println("4-> history")
        println("5-> update")
        println("6-> search")
        println()
        val a = scanner.nextInt()
        when (a) {
            1 -> {
                contact.add()
            }
            2 -> {
                contact.remove()
            }
            3 -> {
                contact.list()
            }
            4 -> {
                contact.history()
            }
            5 -> {
                contact.update()
            }
            6 -> {
                contact.search()

            }
        }
    }
}