package oop_125861_shalomitaaclasamahu.week06

class Smartphone : Camera, Phone {

    // Override untuk menyelesaikan diamond problem
    override fun turnOn() {
        super<Camera>.turnOn()   // menjalankan logika Camera
        super<Phone>.turnOn()    // menjalankan logika Phone
        println("Sistem operasi smartphone berhasil booting.")
    }

    fun takePhoto() {
        println("Smartphone mengambil foto.")
    }
}