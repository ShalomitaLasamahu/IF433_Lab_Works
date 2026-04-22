package op_125861_Shalomitaamandachristylasamahu.week09

fun main() {
    println("=== TEST LAMBDA ===")
    val sumlambda = { a: Int, b: Int -> a + b }
    println("Hasil Sum: ${sumlambda(5, 10)}")

    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasil square: ${squareImplicit(4)}")
}