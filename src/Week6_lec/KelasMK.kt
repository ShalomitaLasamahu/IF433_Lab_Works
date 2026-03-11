package Week6_lec

interface KelasMK {
    val namaMk: String;
    val nilaiMk: Int;
    fun penilaian();

    fun keaktifan() {
        println("Kamu bawel ya");
    };
}