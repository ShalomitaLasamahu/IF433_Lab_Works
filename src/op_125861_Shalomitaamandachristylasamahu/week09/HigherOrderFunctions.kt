package op_125861_Shalomitaamandachristylasamahu.week09

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("Original data: $numbers")
    println("\n=== HOF: FILTER ===")

    val evens = numbers.filter { it % 2 == 0 }
    println("Evens: $evens")
}