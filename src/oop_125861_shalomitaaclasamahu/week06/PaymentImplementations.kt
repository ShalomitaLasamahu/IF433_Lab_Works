package oop_125861_shalomitaaclasamahu.week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double) { println("processing Rp$amount via Gopay server") }
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) { println("contacring bank for Rp$amount") }
}
