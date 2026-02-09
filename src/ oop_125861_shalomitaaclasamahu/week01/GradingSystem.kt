package oop_125861_shalomitaaclasamahu.week01

// Tulis DI LUAR main()
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"

fun main() {
    // REFACTOR: Gunakan val dan hapus tipe data eksplisit
    val name = "John Thor"
    val score = 80

    // REFACTOR: String Template ($name)
    println("Nama: $name, Nilai: $score")

    // Tambahkan dibawah println
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade: $grade")

    // Panggil DI DALAM main()
    println("Status: ${calculateStatus(score)}")
}
