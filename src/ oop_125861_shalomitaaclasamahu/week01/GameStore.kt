package oop_125861_shalomitaaclasamahu.week01

fun main() {
    val gameTitle: String = "Elden Ring"
    val price: Int = 750000
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        (price * 0.8).toInt()
    } else {
        (price * 0.9).toInt()
    }
