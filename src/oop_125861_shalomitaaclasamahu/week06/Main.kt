package oop_125861_shalomitaaclasamahu.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount) //   Dynamic polymorphism in action
}
fun main() {
    val  myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turn0n()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== Testing Checkout ===")
    processCheckout(pay1, amount = 50000.0)
    processCheckout(pay2, amount = 150000.0)
}
