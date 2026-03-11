package Week6_lec

class Mahasiswa(
    override val namaOrg: String,
    override val budgetRapat: Int,
    override val jmlOrg: Int,
    override val namaMk: String,
    override val nilaiMk: Int
) : Organisasi, KelasMK {
    override fun rapat() {
       println("sedang rapat di $namaOrg");
        println("Biaya konsum rapat: ${super.biayaKonsumsi}");
    }

    override fun penilaian() {
        println("nilai $namaMk adalah $nilaiMk");
    }

    override fun keaktifan() {
       super<KelasMK>.keaktifan();
        super<Organisasi>.keaktifan();
    }
}