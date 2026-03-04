package week5

abstract class MataKuliah {
    var nama:String = "";

    abstract fun set_matkul(sks:Int) ;
    fun hasil_matkul() {
        println("Matkul diminati");
    }
}