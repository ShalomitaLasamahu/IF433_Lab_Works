package oop_125861_shalomitaaclasamahu.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk() // Memanggil method milik sendiri
    myCar.honk() // Memanggil method yang sudah di-override
    myCar.accelerate() // Memanggil gabungan method parent dan child

    println(" --- ELECTRIC CAR TEST ---")

    val electricCar = ElectricCar("Tesla", 4, 85)

    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()

    println("--- EMPLOYEE TEST ---")

    val manager = Manager("Nathan", 10_000_000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println("")

    val developer = Developer("Andi", 8_000_000, "Kotlin")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}