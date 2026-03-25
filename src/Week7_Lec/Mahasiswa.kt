package Week7_Lec

class Mahasiswa private constructor(val kampus:String) {
    companion object {
        var nama:String = "unknown";

        fun set_nilai(uts:Int, uas:Int): Int {
            return (uts+uas)/2;
        }
        fun isi_nama_kampus(namaUniv:String) {
            Mahasiswa( kampus = namaUniv);
        }
    }
    // Bagian yg class biasa( BUKAN COMPONION OBJECT )
    init {
        println("nama kampus kamu $kampus");
    }
}