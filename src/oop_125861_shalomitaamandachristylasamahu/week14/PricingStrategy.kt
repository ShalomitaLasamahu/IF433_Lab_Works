package oop_125861_shalomitaamandachristylasamahu.week14

interface PricingStrategy {
    fun calculate(basePrice: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(basePrice: Double): Double = basePrice
}

class VipPricing : PricingStrategy {
    override fun calculate(basePrice: Double): Double = basePrice * 0.90 // Diskon 10%
}

// Contoh jika ingin menambah diskon baru (tanpa mengubah kode yang sudah ada!)
class SeniorPricing : PricingStrategy {
    override fun calculate(basePrice: Double): Double = basePrice * 0.85 // Diskon 15%
}