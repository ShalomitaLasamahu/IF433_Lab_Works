package Week6_lec

fun main() {
   // val org = Organisasi();
   //  org.rapat();
    val mhs = Mahasiswa(
        namaOrg = "HMIF",
        15000,
        jmlOrg = 20,
        "OOP",
        nilaiMk = 89);
    mhs.rapat();
    mhs.penilaian();
    mhs.keaktifan();
}