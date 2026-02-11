package week2

class Pemain  {
    var nama: String = "tidak terdaftar";
    var speed: Int = 9;
    val shoot: Int = 8;


    init {
        this.nama = "Messi";
        println("Ini adalah constructor");
    }


    // punya parameter kelebihannya
    constructor(alias:String="Budi", Kecepatan:Int=2) {
        nama =  alias;
        speed = Kecepatan;
        println("Ini adalah constructor kedua")
    }
    fun bawa_bola() {
     println("si $nama sedang bawa bola");
    }
}

fun main() {
        val player = Pemain( alias = "Yoel", 100);
        player.bawa_bola();
        println("nama pemain: ${player.nama}")
        println("skill kecepatan: " + player.speed);

       val player2 = Pemain( alias = "Ronaldo", Kecepatan = 99);
       println("pemain Populer: ${player2.nama}");
       println("Kecepatan: " + player2.speed);
}

