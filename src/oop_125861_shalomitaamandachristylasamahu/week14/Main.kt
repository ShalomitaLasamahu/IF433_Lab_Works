package oop_125861_shalomitaamandachristylasamahu.week14

fun main() {
    // Setup dependencies
    val csvRepo = CsvOrderRepository()
    val emailNotifier = EmailNotifier()

    // Processor dengan OCP compliance
    val orderProcessor = SafeOrderProcessorOCP(csvRepo, emailNotifier)

    // Proses berbagai tipe customer - tanpa mengubah class processor!
    orderProcessor.processOrder("Laptop", 1000.0, RegularPricing())
    orderProcessor.processOrder("Smartphone", 800.0, VipPricing())
    orderProcessor.processOrder("Tablet", 500.0, SeniorPricing()) // Diskon baru!
}