package Week11

import Week6_lec.Mahasiswa

// function biasa
fun panggil_nama(nama:String):String {
    return "Hai $nama";
}

// function extension  BASIC
fun String.panggil_mahasiswwa(): String {
    val hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar { c ->
            c.uppercase()
        }
    }
    return hasil
}

// function extension - PARAMETER
fun Int.tentukanLulus(nama:String):String {
    var keputusan = ""
    if(this >= 70) {
        keputusan = "lulus"
    } else {
        keputusan = "Remedial"
    }
    return "Mahasiswa $nama hasil kelulusan adalah $keputusan"
}

// function extension  -  cek NULL
fun String?.cekNulldanEmpty():String {
    if(this == null || this.isEmpty()) {
        return "gak boleh null atau  kosong bang"
    } else {
        return "username kamu adalah $this"
    }
}

class Mahasiswa {
    var nim:String = "";
    var nama:String = "";
    var ipk:Int = 0;
}

fun main() {
    // CALL FUNCTION EXTENSION NULL
    var inputUsername: String? = null
    println(inputUsername.cekNulldanEmpty())

    // cara panggil function extension - parameter
    println(88.tentukanLulus("Anya"))


    // cara panggil fun biasa
    println(panggil_nama("Shalom").uppercase());

    // cara pangggil fun exten - basic
    println("shalomita lasamahu".panggil_mahasiswwa());

    // var coba = "Keisha"
    // println(coba.repeat(7)); -> repeat


    // SCOPE - LET
    var kampusSaya = "UMN";
    kampusSaya.let {
        if (it == "UMN") {
            println("kampus" + it + "Telur")
        } else {
            println("Amazing $it")
        }
    }

    // SCOPE - RUN
    var alamatSaya = "Gading Serpong";
    alamatSaya.run {
        println("Saya tinggal di" + this)
    }

    // SCOPE - WITH
    var gradeSaya = with(90) {
        if (this >= 80) {
            "A"
        } else if (this >= 70) {
            "B"
        } else {
            "C"
        }
    }
    println("Grade Saya $gradeSaya")

    // SCOPER - APPLY
    var dataMahasiswa = Mahasiswa().apply {
        nim = "12345678"
        nama = "Angel"
        ipk = 3;
    }
    println("Mahasiswa ${dataMahasiswa.nama} dgn nim ${dataMahasiswa.nim} ipk nya ${dataMahasiswa.ipk}")

    //SCOPE - ALSO
    var deretAngka = mutableListOf<Int>(90,80,66,70,85,68);
    deretAngka.apply {
        println("Sebelum $deretAngka");
    }.add(90)
    println("Setelah $deretAngka") ;
}
