package oop_125861_shalomitaamandachristylasamahu.week08

fun main() {
    println("=== E-COMMERCE API PARSER ===\n")
    // Testing pipeline: Electronic, Clothing, Corrupted warranty, Missing ID, Unknown type

    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser()

    for ((index, raw) in rawApiData.withIndex()) {
        println("Processing item #${index + 1}: $raw")

        try {
            val product = parser.parseProduct(raw)
            product?.let {
                parser.checkout(it)
            } ?: println("  SKIPPED: Unknown product type or invalid data\n")
        } catch (e: IllegalArgumentException) {
            println("  ERROR: ${e.message}\n")
        }
    }
}