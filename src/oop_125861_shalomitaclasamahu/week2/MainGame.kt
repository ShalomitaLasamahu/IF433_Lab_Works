package oop_125861_shalomitaclasamahu.week2

fun main() {

    // 1. input Hero
    print("Masukkan nama Hero: ")
    val heroName = readLine()!!

    print("Masukkan Base Damage: ")
    val baseDamage = readLine()!!.toInt()

    val hero = Hero(heroName, baseDamage)

    // 2. Enemy hanya variabel
    var enemyHp = 100

    println("\n=== GAME START ===")

    // 3. Loop selama hero hidup dan musuh hidup
    while (hero.isAlive() && enemyHp > 0) {

        println("\nMenu:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih: ")

        val choice = readLine()!!.toInt()

        when (choice) {

            1 -> {
                // Hero menyerang
                hero.attack("Musuh")
                enemyHp -= hero.baseDamage

                if (enemyHp < 0) {
                    enemyHp = 0
                }

                println("HP Musuh tersisa: $enemyHp")

                // Musuh balas jika masih hidup
                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("Musuh membalas!")
                    hero.takeDamage(enemyDamage)
                }

                println("HP Hero sekarang: ${hero.hp}")
            }

            2 -> {
                println("${hero.name} kabur dari pertempuran!")
                break
            }

            else -> {
                println("Pilihan tidak valid!")
            }
        }
    }

    // 4. Pengumuman hasil
    println("\n=== GAME OVER ===")

    if (hero.isAlive() && enemyHp <= 0) {
        println("${hero.name} MENANG!")
    } else if (!hero.isAlive()) {
        println("${hero.name} KALAH!")
    } else {
        println("Permainan dihentikan.")
    }
}
