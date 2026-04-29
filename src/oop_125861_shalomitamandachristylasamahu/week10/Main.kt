package oop_125861_shalomitamandachristylasamahu.week10


fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in kotlin")

    println("Isi intBox is ${intBox.value}")
    println("Isi stringBox is ${stringBox.value}")
    println("\n=== TEST MULTIPLE PARAMETERS ===")
    val itemPrice = PairBox("Bitcoin", 65000)

    println("\n=== TEST GENERIC FUNCTIONS ===")
    printData(3.14)
    val result = processData("Stable coin")
    println("Hasil proses: $result")

    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")
}