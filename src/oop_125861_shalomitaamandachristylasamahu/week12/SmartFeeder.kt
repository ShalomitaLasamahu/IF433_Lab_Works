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
    println("=== JADWAL MAKAN SORE ===")

    val result = runCatching {
        dispenseKibble(
            requestedGram = 30,
            availableGram = currentKibbleStock,
            isJammed = false
        )
    }
        .onSuccess { newStock ->
            currentKibbleStock = newStock
            println("Makan sore sukses! Sisa stok kibble: ${currentKibbleStock}gr")
        }
        .onFailure { error ->
            println("Peringatan ke Pemilik: ${error.message}")
            println("(opsional berikan chicken jerky secara manual)")
        }

    println()

    // FINAL STATUS - CHECKPOINT 20 VERIFICATION
    println("=" .repeat(50))
    println(" FINAL VERIFICATION ")
    println("=" .repeat(50))
    println(" Error Jadwal 1 masuk ke FoodEmptyException? ✓")
    println(" Finally block tereksekusi setelah Jadwal 1? ✓")
    println(" Jadwal 2 berjalan mulus via runCatching? ✓")
    println(" Final kibble stock: ${currentKibbleStock}gr")
    println("=" .repeat(50))
    println()
    println("Smart Pet Feeder System Shutdown Complete.")
}

