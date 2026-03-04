package week5

class Elective: MataKuliah() {
    override fun set_matkul(sks: Int) {
        super.nama = "VR PROGRAMMING";
        println("Elektif ${super.nama} sks $sks")
    }
    fun ada_praktek(){
        println("wajib dipraktekin");
    }
}