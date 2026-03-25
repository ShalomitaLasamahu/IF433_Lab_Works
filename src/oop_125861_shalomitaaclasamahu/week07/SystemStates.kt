package oop_125861_shalomitaaclasamahu.week07

enum class AppStates {
    STARTING, RUNNING, STOPPED
 }

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
 }