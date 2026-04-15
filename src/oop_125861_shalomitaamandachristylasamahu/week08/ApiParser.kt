package oop_125861_shalomitaamandachristylasamahu.week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"]) { "API Invalid: Missing ID" } as String
        val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing Name" } as String

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = (rawJson["warranty"] as? Int) ?: 12
                Product.Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = (rawJson["size"] as? String) ?: "All Size"
                Product.Clothing(id, name, size)
            }
            else -> null
        }
    }

    // ============ CHECKPOINT 18 ============
    // Fungsi checkout dengan menggunakan !! untuk Java Interop
    fun checkout(product: Product) {
        // Ekstrak ID dari product dengan pola when (karena ia sealed class)
        val transactionId = when (product) {
            is Product.Electronic -> JavaPaymentService.processPayment(product.id)
            is Product.Clothing -> JavaPaymentService.processPayment(product.id)
        }

        // !!! WAJIB: Menggunakan !! pada hasil tangkapannya untuk membuktikan Java Interop
        // Karena kita yakin Java service selalu berhasil mengeluarkan Transaction ID
        println("Transaction ID: ${transactionId!!}")

        // Print detail product
        when (product) {
            is Product.Electronic -> {
                println("  Product: ${product.name} (Electronic)")
                println("  Warranty: ${product.warrantyMonths} months")
            }
            is Product.Clothing -> {
                println("  Product: ${product.name} (Clothing)")
                println("  Size: ${product.size}")
            }
        }
        println("  Status: CHECKOUT SUCCESS")
        println()
    }
    // ============ END CHECKPOINT 18 ============
}