package oop_125861_shalomitaamandachristylasamahu.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    // Rantai safe calls yg elegan
    val destination = emptyOrder.deliveryDetails?.address?.city?.name?; "kota" +
            "tidak diketahui"
    println("Tujuan pengiriman: $destination")
}