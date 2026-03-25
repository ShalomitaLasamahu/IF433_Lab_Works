package oop_125861_shalomitaaclasamahu.week07

import oop_125861_shalomitaaclasamahu.week07.NetworkClient.Companion.createClient

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instansiasi lewat Factory
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegulerUser("Amanda",19)
    val reg2 = RegulerUser("Amanda", 19)
    println(reg1)
    println("Sama? ${reg1 == reg2}") // false
}