package oop_125861_shalomitaaclasamahu.week07

fun main() {

    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instansiasi lewat Factory
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegulerUser("Amanda", 19)
    val reg2 = RegulerUser("Amanda", 19)
    println(reg1)
    println("Sama? ${reg1 == reg2}") // false

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Amanda", 19)
    val data2 = DataUser("Amanda", 19)
    println(data1) // otomatis readable format
    println("Sama? ${data1 == data2}") // TRUE

    val data3 = data1.copy(age = 19)
    println("Hasil copy: $data3")

    val (userName, userAge) = data1 // Destructuring
    println("Destructured: $userName, berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil di tarik!")

    val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }

    println(uiMessage)

    // =========================
    // CHECKPOINT 18
    // =========================
    println("\n=== TEST GAME MANAGER (SINGLETON) ===")
    GameManager.startGame()
    GameManager.startGame()

    // CHECKPOINT 19
    println("\n=== TEST RARITY & FACTORY ===")
    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata awal: ${starterWeapon.item.name}, Damage: ${starterWeapon.item.damage}, Durability: ${starterWeapon.durability}")
}