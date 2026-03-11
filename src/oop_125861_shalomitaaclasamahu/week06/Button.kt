package oop_125861_shalomitaaclasamahu.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasol diklik!")
    }
}