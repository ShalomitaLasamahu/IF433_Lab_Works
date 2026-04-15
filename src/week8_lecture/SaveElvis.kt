package week8_lecture

class Alamat(val nomor: Int, val kota: String);
class Mahasiswa (val nim: String, val addr: Alamat?) ;

fun main() {
    val almt = Alamat(nomor = 12, kota = "Tangerang");
    val mhs = Mahasiswa(nim = "125861", addr = almt);

    val defaultAlamat = mhs.addr?.let { alamatAsli ->
        " sini nih.....${mhs.addr.kota} nomornya ${mhs.addr.nomor}";

    }?:   "Gak jelas, gak tau dimana"


    println("Nim-nya ${mhs.nim} tinggalnya di ${defaultAlamat}");
}