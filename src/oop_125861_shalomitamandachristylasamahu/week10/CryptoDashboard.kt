package oop_125861_shalomitamandachristylasamahu.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

        coinRepo.add(Coin("BTC", 1.5))
        coinRepo.add(Coin("ETH", 10.0))
        coinRepo.add(Coin("USDT", 500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

}