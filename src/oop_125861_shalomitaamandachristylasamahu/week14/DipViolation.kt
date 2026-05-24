package oop_125861_shalomitaamandachristylasamahu.week14

class MySQLDatabase {
    fun query(sql: String): List<String> = listOf("data1", "data2")
}

class UserService {
    private val database = MySQLDatabase() // Hard-coded! Tightly coupledd
    fun getUser(id: Int) = database.query("SELECT * FROM users WHERE id=$id")
}