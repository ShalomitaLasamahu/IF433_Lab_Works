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

    var currentKibbleStock = 50
    println("Initial kibble stock: ${currentKibbleStock}gr")
    println()

    // Checkpointt 15: Jadwal Makan 1 - Multiple Catch
    println("=== JADWAL MAKAN PAGI ===")

    try {
        val newStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
        currentKibbleStock = newStock
        println("Makan pagi sukses! Sisa stok: ${currentKibbleStock}gr")

    } catch (e: DispenserJamException) {
        println("ERROR: ${e.message}")
        println("Silakan periksa dispenser dan bersihkan wadah!")

    } catch (e: FoodEmptyException) {
        println("ERROR: ${e.message}")
        println("Silakan isi ulang stok kibble!")

    } catch (e: Exception) {
        println("ERROR Umum: ${e.message}")

    } finally {
        // CHECKPOINT 16: Finally block
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println()

    // Pemilik mengisi ulang stoknyaa
    println("=== PEMILIK MENGISI ULANG STOK ===")
    currentKibbleStock = 1000
    println("Stok setelah diisi ulang: ${currentKibbleStock}gr")
    println()

    // CHECKPOINT 17: Jadwal Makan 2
    println("=== JADWAL MAKAN SORE (CP17) ===")

    val result = runCatching {
        dispenseKibble(
            requestedGram = 30,
            availableGram = currentKibbleStock,
            isJammed = false
        )
    }

    println("Result: $result")
}

