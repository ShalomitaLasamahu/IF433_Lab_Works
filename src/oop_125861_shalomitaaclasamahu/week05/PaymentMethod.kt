package oop_125861_shalomitaaclasamahu.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}