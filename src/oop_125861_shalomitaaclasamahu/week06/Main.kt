package oop_125861_shalomitaaclasamahu.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {

    // Testing Smartwatch
    val myWatch = Smartwatch("Samsung")
    myWatch.showBrand()
    myWatch.showTime()

    // Testing Diamond Problem (Smartphone)
    val myPhone = Smartphone()
    myPhone.takePhoto()

    // Testing Payment Method (Polymorphism)
    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== Testing Checkout ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)
}