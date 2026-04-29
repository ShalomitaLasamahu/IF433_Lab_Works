package oop_125861_shalomitamandachristylasamahu.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

        coinRepo.add(Coin("BTC", 1.5))
        coinRepo.add(Coin("ETH", 10.0))
        coinRepo.add(Coin("USDT", 500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    println(response.status)

    response.data.forEach {
        println("Coin: ${it.name}, Balance: ${it.balance}")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 100.0))
    txRepo.add(Transaction("TX002", 250.0))

    txRepo.getAll().forEach {
        println("Transaction: ${it.id}, Amount: ${it.amount}")
    }


}