package Week7_Lec

enum class MataKuliah ( val jmlSks: Int){
    OOP(3),
    GAMEDEV(jmlSks = 4),
    DASPRO(jmlSks = 2);

    fun sks_matkul() {
        println("Jml sksnya: $jmlSks");
    }

}

