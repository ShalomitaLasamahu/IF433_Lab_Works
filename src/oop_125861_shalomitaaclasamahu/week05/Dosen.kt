package oop_125861_shalomitaaclasamahu.week05

class Dosen (nama: String, val nidn: String) : Pegawai(nama) {
    // Wajib di-override karna fungsi bekerja() bersifat abstract di parent
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    // Fungsi unik/spesifik yg hanya dimiliki Dosen
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}