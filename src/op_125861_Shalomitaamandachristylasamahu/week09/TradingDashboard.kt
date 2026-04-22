package op_125861_Shalomitaamandachristylasamahu.week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 15, -2.0, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 25, 10.0, "CLOSED"),
        TradeLog("XRPUSDT", "SHORT", 5, -8.0, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 10, 5.5, "OPEN")
    )

    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }

    val winningTrades = closedTrades
        .filter { it.roe > 0 }
}