package oop_125861_shalomitaaclasamahu.week06


class Smartphone: Camera, Phone {
    // Manually ovveride to resolve ambiguity
    override fun tur0n() {
        super<Camera>.turn0n() // menjalankan logika camera
        super<Phone>.tur0n() // menjalankan logika phone
        println("Sistem operasi smartphone berhasil booting.")
    }

    override fun takePhoto() {
    }
}