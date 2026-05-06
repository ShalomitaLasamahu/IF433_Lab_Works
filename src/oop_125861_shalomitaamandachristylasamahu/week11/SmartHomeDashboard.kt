package oop_125861_shalomitaamandachristylasamahu.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    val lamp = SmartDevice("", "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}