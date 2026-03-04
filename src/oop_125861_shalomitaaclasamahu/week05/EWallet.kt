package oop_125861_shalomitaaclasamahu.week05

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran berhasil dengan EWallet.")
            println("Sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup di EWallet.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up berhasil. Saldo sekarang: $balance")
    }
}