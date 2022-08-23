package Main

import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet

class ContactClass:Contact {
    var scanner = Scanner(System.`in`)
    var list = HashSet<Contact>()
    var history = HashMap<Int, String>()

    data class Contact(var name: String, var number: Int) {

    }

    override fun add() {
        println("==============Add=================")
        print("Enter name: ")
        val name = scanner.next()
        print("Enter number: ")
        val number = scanner.nextInt()
        list.add(Contact(name, number))
        println("success")
        println()
    }

    override fun remove() {
        println("==============Remove=================")
        println("Ismni kiriitng")
        val name = scanner.next()
        list.removeIf { r -> name.equals(r.name) }
    }




    override fun list() {
        println("==============List=================")

        list.forEach { contact ->
            println("Name: ${contact.name}")
            println("Number: ${contact.number} ")
        }
        println()
    }

    override fun search() {
        println("==============Search=================")
        try {


            print("Enter name: ")
            val name = scanner.next()
            val book: Contact? = list.find { it.name == name }
            println(book)
            println()
        } catch (e: Exception) {
            println("Not found :(")
        }
    }

    override fun update() {
        println("==============Update=================")
        print("Enter name: ")
        val name = scanner.next()
        list.forEach { contact ->
            if (name.equals(contact.name)) {
                print("Enter new name: ")
                val newName = scanner.next()
                print("Enter new number: ")
                val number = scanner.nextInt()

                list.add(Contact(newName, number))
                list.removeIf { r -> name.equals(r.name) }
                println("success")
            }
        }
        println()


    }

    override fun history() {
        println("==============History=================")
        for ((number, name) in history) {
            if (name.equals("")) {
                println("Number: $number")
            } else {
                println("Name: $name")
                println("Number: $number")

            }

        }
        println()
    }
}
