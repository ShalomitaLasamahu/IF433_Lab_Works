package oop_125861_shalomitaamandachristylasamahu_.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in kotlin")

    println("Isi intBox is ${intBox.value}")
    println("Isi stringBox is ${stringBox.value}")
}