package oop_125861_shalomitaaclasamahu.week13
import java.io.File

fun main() {
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("notes.txt")
    println("File berhasil dibuat dan ditulis")

    file.appendText("Line 2: Menambahkan konfigurasi baruu.\n")
    println("teks berhasil di-appendd:.")

    println("\n===TEST READ TEXT ===")
    val fullContent = file.readText()
    println("Membaca sekaligus:\n$fullContent")

    println("\n===TEST READ LINES ===")
    val lines = file.readLines()
    lines.forEachIndexed { index, line ->  }
        println("Isi index $index: $line")
}