package oop_125861_shalomitaaclasamahu.week01

fun main(args: Array<String>) {
    // Variable definition
    val radius: Double = 7.0
    val pi = 3.14

    // Calculation
    val area = pi * radius * radius

    // Output String T
    println("Radius: $radius , Area: $area")

    // Logic check
    println(checkSize(area))
}

fun checkSize(area: Double) =
    if (area > 100) "This is a Big Circle"
    else "This is a Small Circle"
