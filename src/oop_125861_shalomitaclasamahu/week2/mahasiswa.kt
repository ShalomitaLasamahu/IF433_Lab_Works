package oop_125861_shalomitaclasamahu.week2

class Student(
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0,
) {

    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }

    // Secondary Constructor
    constructor(name: String, nim: String) :
            this(name, nim, "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}
