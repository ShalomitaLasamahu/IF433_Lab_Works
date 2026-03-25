package oop_125861_shalomitaaclasamahu.week07

import oop_125861_shalomitaaclasamahu.week07.NetworkClient.Companion.createClient

fun Main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instansiasi lewat Factory
    client.connect()
}