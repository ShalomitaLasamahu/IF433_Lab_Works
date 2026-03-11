package oop_125861_shalomitaaclasamahu.week06

class Smartwatch(brand: String) : Watch(brand), HeartRateMonitor, StepTracker {

    override fun showTime() {
        println("Menampilkan waktu digital.")
    }

    override fun measureHeartRate() {
        println("Mengukur detak jantung...")
    }

    override fun countSteps() {
        println("Menghitung langkah kaki...")
    }
}
