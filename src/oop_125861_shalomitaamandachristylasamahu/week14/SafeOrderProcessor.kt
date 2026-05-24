package oop_125861_shalomitaamandachristylasamahu.week14

class SafeOrderProcessorOCP(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    // Sekarang menerima PricingStrategy, bukan customerType String!
    fun processOrder(itemName: String, basePrice: Double, pricing: PricingStrategy) {
        val finalPrice = pricing.calculate(basePrice)

        println("Memproses pesanan $itemName seharga $finalPrice")

        repo.saveOrder(itemName, finalPrice, pricing::class.simpleName ?: "Unknown")
        notifier.sendNotification(itemName)
    }
}