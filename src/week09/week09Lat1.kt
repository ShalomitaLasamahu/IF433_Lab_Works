package week09

fun main() {
    println("===== LIST OF =====")
    val arSiswa = listOf("Budi","danu","susi","cica")
    // VIEW
    println(arSiswa);

    //panjang array
    println("banyak siswa:" + arSiswa.size);

    // munculin satu orang aja
    println("siswa bernama ${arSiswa[1]}");

    //for-eac --- untuk munculin semua orang
    for( a in arSiswa) {
        print("Siswa "+ a + "dan")
    }

    println("======= LIST OF MUTABLE ======");
    val arMatkul = mutableListOf("OOP","Pemweb","matdis","Calculus")
    arMatkul.add("Algo");
    arMatkul[2] = "Aljabar linear"
    arMatkul.remove("Pemweb");
    println(arMatkul);

    println("======= SET OF IMUT =======")   // set off itu yg double hanya muncul 1xx
    var arNilai = setOf(80.88,95,60,75,89,50,95,69,69);
    println("banyak nilai: ${arNilai.size}");
    println("ada angka 90 gak? ${arNilai.contains(90)}");
    println(arNilai);

    println("====== SET OF MUTABLE =====");
    val arMahasiswa = mutableSetOf("Yanto", "Stev","Udin","Petra");
    arMahasiswa.add("Yeni");
    arMahasiswa.remove("Udin");
    arMahasiswa.add("Udin");
    println(arMahasiswa);

    println("====== MAP IMUT =====");
    var arResto = mapOf(
        "ayam" to 5000,
        "Bakpao" to 3000,
        "Udang tepung" to 10000,
        "Jamur Crispy" to 8000
    );
    println("banyak menu ${arResto.size}");
    println("Harga ayam  ${arResto["Ayam"]}");
    println("List makanan: ${arResto.keys}");
    println("list harga: ${arResto.values}");
    println(arResto);


    println("====== MAP MUTABLE =====");
    var arKHS = mutableMapOf(
        "Toni" to 80,
        "Nika" to 85,
        "Ara" to 87,
        "Davin" to 90
    );
    arKHS.remove("Ara");
    arKHS["Nika"] = 92
    arKHS["shalom"]=99
    println(arKHS);

    println("====== LAMBDA =====");
    // FUNCTION BIASA
    fun tambah(a: Int, b: Int): Int {
        return a + b;
    }
    println("hasil penambahan ${tambah(a= 5, b = 3)}")

    // function lamba -> nulis ke samping
    val kurang = { a: Int, b: Int -> a - b }
    println("Hasil pengurangan ${kurang(5,3)}")

    println("====== LAMBDA { IT } =====");
    val pagkat = {a: Int, b: Int -> a*b }
    val hasilpangkat: (Int) -> Int = { it * it }
    println("Hasil pangkat ${hasilpangkat(5)}");

    println("====== FOREACH BIASA =====")
    for(a in arMatkul) {
        println(a);
    }

    println("====== FOREACH IT =====")
    arMatkul.forEach {
        println(it)
    }

    println("====== FOREACH VARIABLE =====")
    arMatkul.forEach {
        mk -> println(mk)
    }

}
