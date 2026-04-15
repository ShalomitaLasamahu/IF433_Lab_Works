package week8_lecture

class set_krs(val nim:String, val kodematkul: String?) {
    fun matkul_wajib(sks: Int?) {
        println("matkul kamu $kodematkul sks nya adalah $sks");
    }
}

fun main() {
    var nama: String? = "Mita";
    nama = null;
    println("hai ${nama}");

    val setttingKRS = set_krs( nim = "125861", kodematkul = null);
    println("Nim kamu ${setttingKRS.nim } matkul kamu ${setttingKRS.kodematkul}");
    setttingKRS.matkul_wajib(null);
}