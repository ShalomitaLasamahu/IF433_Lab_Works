package Week7_Lec

fun main() {
    println("server: ${Koneksi.linkServer}");
    Koneksi.test_koneksi();

    Mahasiswa.nama="sam";
    val na:Int = Mahasiswa.set_nilai(88, uas = 100 )
    println("Nilai ${Mahasiswa.nama} adalah $na");

    Mahasiswa.isi_nama_kampus(namaUniv = "UMN") ;

    val dsn1 = Dosen( nama = "Shalomita", nik = "1234567", tahunMasuk =2020);
    println(dsn1)
    val dsn2 = dsn1.copy( nama = "Zahra", nik = "009862");
    println(dsn2)

    // cara untuk ambil data satu field aja
    println("Nama dosen1: ${dsn1.nama} masuk tahun ${dsn1.tahunMasuk}");

    println("Matkul favorit saya: " + MataKuliah.OOP.name);
    println("Index matkul: "+ MataKuliah.OOP.ordinal);

    // looping munculin semua
    for (matkul in MataKuliah.entries) {
        println("matkul: " + matkul + " " );
        matkul.sks_matkul();
    }
}
