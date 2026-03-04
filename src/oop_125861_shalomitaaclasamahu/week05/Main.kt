package oop_125861_shalomitaaclasamahu.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn ="0123456")
    val admin1 = Admin(nama = "Bu Siti")

    // Polymorphic collection: List yg berisi tipe parent, tapi isinya objek anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        //pegawai.mengajar() // INI AKAN EROR karena tipe referensinya adalah pegawai
            //sMART Casting dengan is dan when
        when (pegawai){
            is Dosen -> {
                println("=> Terdeteksi sebagai dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // smart cast! tdk perlu manual casting(as)
            }
            is Admin -> {
                println("=> Terdeteksi sebagi Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------")
    }

    // TEST COMPILE-TIME POLYMORPHISM (OVERLOADING)
    // ==============================

    println("\n=== TEST MATH HELPER (OVERLOADING) ===")

    val mathHelper = MathHelper()

    println("Luas Persegi: ${mathHelper.hitungLuas(4)}")
    println("Luas Persegi Panjang: ${mathHelper.hitungLuas(5, 3)}")
    println("Luas Lingkaran: ${mathHelper.hitungLuas(7.0)}")

    println("====================================")
}
