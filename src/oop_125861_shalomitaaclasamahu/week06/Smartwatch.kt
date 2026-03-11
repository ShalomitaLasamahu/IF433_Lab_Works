package oop_125861_shalomitaaclasamahu.week06

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
       println("Layae OLED menyala: 14.00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di sekitar pairing....")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15w.")

    }
}