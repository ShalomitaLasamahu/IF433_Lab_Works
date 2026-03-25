package oop_125861_shalomitaaclasamahu.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}")
        }

        is BattleState.LootDropped -> {
            println("Mendapat loot: ${event.item.name} (Rarity: ${event.item.rarity})")
        }

        is BattleState.GameOver -> {
            println("Game Over! Penyebab: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Pemain berada di zona aman.")
        }
    }
}