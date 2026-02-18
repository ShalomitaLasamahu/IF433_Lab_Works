package oop_125861_shalomitaaclasamahu.week03

fun main() {

    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 500000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    val weapon = Weapon("Pedang Naga")

    weapon.damage = -50
    weapon.damage = 9999

    println("Damage Weapon: ${weapon.damage}")
    println("Tier Weapon: ${weapon.tier}")

    val player = Player("Shalomita")

    // player.xp  HARUS ERROR (karena private)

    player.addXp(50)
    player.addXp(60)

    println("Level Sekarang: ${player.level}")
}
