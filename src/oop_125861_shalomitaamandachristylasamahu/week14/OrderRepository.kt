package oop_125861_shalomitaamandachristylasamahu.week14
import java.io.File

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository(private val filePath: String = "orders.csv") : OrderRepository {
    private val file = File(filePath)

    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        file.appendText("$itemName,$finalPrice,$customerType\n")
    }
}