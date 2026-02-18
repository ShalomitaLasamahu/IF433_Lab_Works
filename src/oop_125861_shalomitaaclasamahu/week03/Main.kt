package oop_125861_shalomitaaclasamahu.week03

fun main() {

    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 500000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    val weapon = Weapon("Pedang Naga")

    weapon.damage = -50      // harus gagal
    weapon.damage = 9999     // harus jadi 1000

    println("Damage Weapon: ${weapon.damage}")
    println("Tier Weapon: ${weapon.tier}")
}