package week10

// code Non-Generic
class rumah(var alamat: Any)

//code generic
class kampus<T>(val alamat: T)

// code generic -  multi paramaeter
class Komputer<T, V>(val merk:T, val barcode:V)

// code generic -  function
fun <T> Password(isiPass:T):T {
    return isiPass;
}

//code generic - funtion ada constraint
class Kalkulator<T:Number>(val a:T, val b:T) {
    fun tambah(): Int {
        return a.toInt() + b.toInt();
    }
    fun kurang(): Double {
        return a.toDouble() - b.toDouble();
    }
}

// generic - where
val daftarNilai = listOf(60,71,90,83,73,67,55,84,72)
fun <T> penilaian(list: List<T>, kkm:T):List<T> where T: Comparable<T> {
    return list.filter { it > kkm};
}

fun main() {
    println("=== Generic -  WHERE ===")
    val daftarNilai = listOf(60,71,90,83,73,67,55,84,72)
    println("daftarNilai: "+daftarNilai);
    val nilaiAtasKKM = penilaian( daftarNilai, kkm = 70)
    println("nilai diatas KKM: "+nilaiAtasKKM)

    println("=== Generic -  Constraint ===")
    val kalk = Kalkulator( a =  10.52, b = 20.347)
    println("penambahan ${kalk.a} ditambah ${kalk.b}" + kalk.tambah())
    println("pengurangan ${kalk.a} ditambah ${kalk.b}" + kalk.kurang())

    println("=== Generic- Function ===")
    println("Password kamu: " + Password("12345"));

    println("=== SAMPLE GENERIC -  Multi Param ===");
    val komp = Komputer("delt","12345")
    println("Merk komputer: " + komp.merk)
    println("Barcode komputer : ${komp.barcode}")


    println("=== SAMPLE NON-GENERIC ===");
    val rmh = rumah(alamat = 200);
    val angkaRumah = rmh.alamat
    println(rmh.alamat)

    println("=== SAMPLE GENERIC ====")
    val kmps = kampus(alamat = "Tangerang");
    println(kmps.alamat)
}