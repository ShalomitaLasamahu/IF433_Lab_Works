package oop_125861_shalomitaaclasamahu.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connected to $url...")
    }
}