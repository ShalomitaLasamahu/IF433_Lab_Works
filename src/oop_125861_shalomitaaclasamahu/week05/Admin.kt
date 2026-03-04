package oop_125861_shalomitaaclasamahu.week05

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja () {
        println("[$nama] sedang duduk didepan komputer melayani administrasi.")

    }

  // Fungsi unik/spesifik yg hanya dimiliki Admin
  fun doAdminWork() {
      println("[$nama] sedang merekap data absensi mahasiswa.")
  }
}
