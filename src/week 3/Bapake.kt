package `week 3`

open class Bapake {

    private var nama: String = "Belum tau"
    private var umur: Int = 35
    protected var gaji: Int = 1000

    public var uangjajan: Int = 0
        set(value) {
            if (value <= 0) {
                println("Masa uang jajan 0 atau minus")
            } else {
                field = value
            }
        }
        get(){
            return field + 123
        }

    fun set_nama(namabaru: String) {
        if (namabaru.isEmpty()) {
            println("Eh nama ga boleh kosong")
        } else {
            this.nama = namabaru
        }
    }

    fun get_nama(): String {
        return this.nama
    }

    fun set_umur(umurBaru: Int) {
        if (umurBaru <= 0) {
            println("Umur tidak boleh negatif atau nol!")
        } else {
            this.umur = umurBaru
        }
    }

    fun get_umur(): Int {
        return this.umur
    }

    class Anake : Bapake() {
        fun dapatin_gaji_bapak(): Int {
            this.gaji = 5500
            return this.gaji + 500
        }
    }
}

fun main() {

    val bpk = Bapake()
    bpk.set_nama("Yanto")
    println("Nama papi kamu ${bpk.get_nama()}")
    print("Masukkan umur bapak: ")
    val inputUmur = readLine()?.toIntOrNull()

    if (inputUmur != null) {
        bpk.set_umur(inputUmur)
    }
    println("Umur bapak sekarang ${bpk.get_umur()}")

    val ank = Bapake.Anake()
    ank.set_nama("Udin")
    println("Nama anak ${ank.get_nama()}")
    println("Gaji bapak : ${ank.dapatin_gaji_bapak()}")

    ank.uangjajan = -100
}
