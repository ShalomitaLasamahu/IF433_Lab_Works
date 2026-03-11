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

    // Testing Payment Method
    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== Testing Checkout ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    // CHECKPOINT 19
    // Instansiasi Smart Devices

    val lamp = SmartLamp("1", "Ruang Tamu")
    val speaker = SmartSpeaker("2", "Google Nest Dapur")
    val cctv = SmartCCTV("3", "Ezviz Garasi")

    // CHECKPOINT 20
    // Testing SmartHomeHub

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("\n=== Security Mode Aktif ===")
    hub.activateSecurityMode()

    println("\n=== Mematikan Semua Perangkat ===")
    hub.turnOffAllSwitches()
}