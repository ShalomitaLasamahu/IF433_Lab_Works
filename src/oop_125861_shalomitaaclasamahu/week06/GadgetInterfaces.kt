package oop_125861_shalomitaaclasamahu.week06

// Interface untuk kamera
interface Camera {
    fun turnOn() {
        println("Lensa kamera terbuka dan sensor aktif.")
    }
}

// Interface untuk telepon
interface Phone {
    fun turnOn() {
        println("Sinyal seluler mencari jaringan.")
    }
}

// Interface untuk fitur smartwatch
interface HeartRateMonitor {
    fun measureHeartRate()
}

// Interface untuk penghitung langkah
interface StepTracker {
    fun countSteps()
}