package oop_125861_shalomitaaclasamahu.week04

// Gunakan keywird 'open' agar class bisa diwariskan
open class Vehicle(val brand: String) {
    var speed: Int = 0

    // Method juga bersifat final secara default. Gunakan 'open' agar  bisa di-override
    open fun accelerate(){
        speed +=10
        println("$brand melaju. kecapatan: $speed km/jam")
    }

    open fun honk() {
        println("Beep beep!")
    }
}