package oop_125861_shalomitaamandachristylasamahu.week12

fun dispenseKibble( requestedGram: Int, availableGram: Int,  isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    println("=== SMART PET FEEDER SYSTEM ===")
    println()

    // Variabel awal stok kibble
    var currentKibbleStock = 50
    println("Initial kibble stock: ${currentKibbleStock}gr")
    println()
}


