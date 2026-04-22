package op_125861_Shalomitaamandachristylasamahu.week09

fun main() {
    println("=== TEST LIST ===")
    // Immutable List (Read-only)
    val frameworks: List<String> = listOf("kotlin", "Java", "C++")
    // Frameworks.add("pythoon)
    println("Immutable List: $frameworks")

    // Mutable List (bisa ditambah/dikurangi)
   val scores: MutableList<Int> = mutableListOf(85,90)
    scores.add(95)
    scores[0] = 88
    println("Mutable list: $scores")
}