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

    // FILTER CLOSED
    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }

    // WINNING
    val winningTrades = closedTrades
        .filter { it.roe > 0 }

    // LOSING
    val losingTrades = closedTrades
        .filter { it.roe <= 0 }

    // TOP PERFORMERS
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    // WORST PERFORMERS
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    // UNIQUE PAIRS
    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    // OUTPUT
    println("=== CRYPTO TRADING DASHBOARD ===")

    topPerformersString.forEach { println(it) }
    worstPerformersString.forEach { println(it) }

    println("Traded Pairs: $uniquePairs")
}