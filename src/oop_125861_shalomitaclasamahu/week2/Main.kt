package oop_125861_shalomitaclasamahu.week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // =====================
    // PROGRAM STUDENT
    // =====================
    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {

        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine()

        if (type == 1) {
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()

            val s1 = Student(name, nim, major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")

        } else if (type == 2) {
            val s2 = Student(name, nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")

        } else {
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }

    // =====================
    // PROGRAM LOAN (TUGAS MANDIRI)
    // =====================
    println("\n--- SISTEM PEMINJAMAN BUKU ---")

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()
    scanner.nextLine()

    // Validasi lama pinjam
    if (duration < 0) {
        duration = 1
    }

    // Buat objek Loan
    val loan = Loan(title, borrower, duration)

    // Print detail
    println("Judul Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Lama Pinjam: ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")
}

