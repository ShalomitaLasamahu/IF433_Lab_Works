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

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3,4)
    println("unique Numbers (Set): $uniqueNumbers") //duplikat hilang

    val activeUser =  mutableSetOf("UserA", "UserB")
    activeUser.add("UserC")
    activeUser.add("UserA") // diabaikan karna sudah ada
    println("active User: $activeUser")

    println("\n=== TEST MAP ===")
    val studentGrades =  mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "C",
    )
    println("Nilai Bob:${studentGrades["Bob"]}")

    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 55, "Charlie" to 30)
    inventory["Oranges"] = 20
    inventory["Apples"] = 45
    println("Inventory: $inventory")
}