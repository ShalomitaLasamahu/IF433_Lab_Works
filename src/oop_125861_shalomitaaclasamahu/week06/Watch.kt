package oop_125861_shalomitaaclasamahu.week06

// Abstract Class = Is-A ( Core Identity)
abstract class Watch(val brand: String) {

    fun showBrand() {
        println("Brand jam: $brand")
    }

    abstract fun showTime()
}