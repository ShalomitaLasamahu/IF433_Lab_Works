package oop_125861_shalomitaaclasamahu.week13
import java.io.File

fun main() {
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("notes.txt")
    println("File berhasil dibuat dan ditulis")
}