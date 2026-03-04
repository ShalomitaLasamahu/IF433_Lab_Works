package oop_125861_shalomitaaclasamahu.week05

fun main() {

    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    // Polymorphic collection: List yg berisi tipe parent, tapi isinya objek anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {

        // Runtime Polymorphism
        pegawai.bekerja()

        // Smart Casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
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


    // SIMULASI PEMBAYARAN (TASK 2)
    // ==============================

    println("\n=== SIMULASI PEMBAYARAN ===")

    val eWallet = EWallet("Shalomita", 50000.0)
    val creditCard = CreditCard("Shalomita", 100000.0)

    // Polymorphic collection
    val metodePembayaran: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (metode in metodePembayaran) {
        println("\nMetode: ${metode.accountName}")
        metode.processPayment(75000.0)
    }
}