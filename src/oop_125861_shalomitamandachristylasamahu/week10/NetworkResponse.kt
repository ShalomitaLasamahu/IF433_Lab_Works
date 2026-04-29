package oop_125861_shalomitamandachristylasamahu.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)