package oop_125861_shalomitaaclasamahu.week01

fun main() {
    val gameTitle: String = "Elden Ring"
    val price: Int = 750000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        (price * 0.8).toInt()
    } else {
        (price * 0.9).toInt()
    }

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("STRUK PEMBELIAN ")
    println("Game : $title")
    println("Harga Akhir : Rp $finalPrice")
    println("Catatan : ${note ?: "Tidak ada catatan"}")
}
