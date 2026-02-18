package oop_125861_shalomitaaclasamahu.week03

class Employee(val name: String){
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            //PERINGATAN: KODE DIBAWAH INI SALAH & BERBAHAYA
            // KITA MEMANGGIL SETTER DI DALAM SETTER (Recursive)
            this.salary = value

        }
}