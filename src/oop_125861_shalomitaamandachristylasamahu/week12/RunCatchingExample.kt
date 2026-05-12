package oop_125861_shalomitaamandachristylasamahu.week12

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X". toInt()
    }
}