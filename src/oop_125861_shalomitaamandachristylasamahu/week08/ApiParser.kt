package oop_125861_shalomitaamandachristylasamahu.week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // Ekstrak id dan name dengan requireNotNull
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

    fun checkout(product: Product) {
        val transactionId = when (product) {
            is Product.Electronic -> JavaPaymentService.processPayment(product.id)
            is Product.Clothing -> JavaPaymentService.processPayment(product.id)
        }

        // Menggunakan !! karena kita yakin Java service selalu mengembalikan nilai
        println("Transaction ID: ${transactionId!!}")

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
}